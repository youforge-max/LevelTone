package eu.cisodiagonal.leveltone

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioManager
import android.media.AudioTrack
import kotlin.math.PI
import kotlin.math.exp
import kotlin.math.min
import kotlin.math.sin

/**
 * Continuously synthesizes a sine tone whose pitch and pulse-rate track how far the
 * phone is from level. Runs a single generator thread writing into a streaming
 * [AudioTrack]. All control params are volatile so the sensor callback can update
 * them from another thread without locking; the generator smooths frequency changes
 * to stay click-free.
 *
 * Mapping (set via [update]):
 *   - level  -> high, steady tone  (calm)
 *   - tilted -> lower pitch + faster amplitude wobble  (agitated)
 */
class ToneEngine {

    private val sampleRate = 44100

    @Volatile var gain = 0.5f          // master volume 0..1 (slider)
    @Volatile var stereo = false       // pan L/R by roll when true
    @Volatile private var targetFreq = 440f
    @Volatile private var pulseHz = 0f // 0 = solid; >0 = amplitude wobble rate
    @Volatile private var pan = 0f     // -1 full left .. +1 full right

    private var track: AudioTrack? = null
    private var thread: Thread? = null
    @Volatile private var running = false

    /** @param tiltDeg 0 = level. @param rollDeg signed left/right tilt for panning. */
    fun update(freq: Float, pulse: Float, rollDeg: Float) {
        targetFreq = freq
        pulseHz = pulse
        pan = (rollDeg / PAN_FULL_DEG).coerceIn(-1f, 1f)
    }

    fun start() {
        if (running) return
        running = true
        val minBuf = AudioTrack.getMinBufferSize(
            sampleRate, AudioFormat.CHANNEL_OUT_STEREO, AudioFormat.ENCODING_PCM_FLOAT
        )
        val bufBytes = maxOf(minBuf, BUFFER_FRAMES * 2 * 4)
        val t = AudioTrack.Builder()
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
            )
            .setAudioFormat(
                AudioFormat.Builder()
                    .setSampleRate(sampleRate)
                    .setEncoding(AudioFormat.ENCODING_PCM_FLOAT)
                    .setChannelMask(AudioFormat.CHANNEL_OUT_STEREO)
                    .build()
            )
            .setBufferSizeInBytes(bufBytes)
            .setTransferMode(AudioTrack.MODE_STREAM)
            .build()
        track = t
        t.play()
        thread = Thread({ generate(t) }, "leveltone-audio").also { it.start() }
    }

    /**
     * One-shot pleasant "ping" — a bell-like tone (fundamental + octave partial) with a
     * fast attack and exponential decay. Self-contained on its own short-lived AudioTrack,
     * so it works whether or not the continuous tone is running.
     */
    fun ping() {
        Thread {
            val dur = 0.6
            val n = (sampleRate * dur).toInt()
            val buf = FloatArray(n)
            val f0 = 1568.0            // G6, bright and clear
            var ph1 = 0.0
            var ph2 = 0.0
            for (i in 0 until n) {
                val tt = i.toDouble() / sampleRate
                ph1 += 2.0 * PI * f0 / sampleRate
                ph2 += 2.0 * PI * (f0 * 2.0) / sampleRate
                val body = sin(ph1) + 0.35 * sin(ph2)     // bell timbre
                val decay = exp(-tt * 5.0)                 // ~0.2s ring
                val attack = min(1.0, tt / 0.004)          // 4ms ramp -> no click
                buf[i] = (body * 0.5 * decay * attack * HEADROOM).toFloat()
            }
            val minBuf = AudioTrack.getMinBufferSize(
                sampleRate, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_FLOAT
            )
            val pt = AudioTrack.Builder()
                .setAudioAttributes(
                    AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .build()
                )
                .setAudioFormat(
                    AudioFormat.Builder()
                        .setSampleRate(sampleRate)
                        .setEncoding(AudioFormat.ENCODING_PCM_FLOAT)
                        .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                        .build()
                )
                .setBufferSizeInBytes(maxOf(minBuf, n * 4))
                .setTransferMode(AudioTrack.MODE_STATIC)
                .build()
            pt.write(buf, 0, n, AudioTrack.WRITE_BLOCKING)
            pt.play()
            Thread.sleep((dur * 1000).toLong() + 60)
            runCatching { pt.stop(); pt.release() }
        }.also { it.isDaemon = true }.start()
    }

    fun stop() {
        running = false
        thread?.join(500)
        thread = null
        track?.run { runCatching { pause(); flush(); stop(); release() } }
        track = null
    }

    private fun generate(t: AudioTrack) {
        val buf = FloatArray(BUFFER_FRAMES * 2) // interleaved stereo
        var phase = 0.0          // carrier phase
        var pulsePhase = 0.0     // wobble phase
        var curFreq = targetFreq.toDouble()
        var curGain = gain
        var curPan = pan

        while (running) {
            val tf = targetFreq.toDouble()
            val ph = pulseHz.toDouble()
            for (i in 0 until BUFFER_FRAMES) {
                // One-pole smoothing to avoid zipper noise / clicks on param jumps.
                curFreq += (tf - curFreq) * FREQ_SMOOTH
                curGain += (gain - curGain) * PARAM_SMOOTH_F
                curPan += ((if (stereo) pan else 0f) - curPan) * PARAM_SMOOTH_F

                phase += 2.0 * PI * curFreq / sampleRate
                if (phase > 2.0 * PI) phase -= 2.0 * PI

                // Amplitude envelope: solid at level, tremolo when tilted.
                val env = if (ph <= 0.0001) 1.0 else {
                    pulsePhase += 2.0 * PI * ph / sampleRate
                    if (pulsePhase > 2.0 * PI) pulsePhase -= 2.0 * PI
                    0.5 + 0.5 * sin(pulsePhase)
                }

                val s = (sin(phase) * env * curGain * HEADROOM).toFloat()
                // Linear pan: tilt right (pan>0) fades the left channel, and vice-versa.
                buf[i * 2] = s * (1f - curPan.coerceAtLeast(0f))     // left
                buf[i * 2 + 1] = s * (1f + curPan.coerceAtMost(0f))  // right
            }
            t.write(buf, 0, buf.size, AudioTrack.WRITE_BLOCKING)
        }
    }

    companion object {
        private const val BUFFER_FRAMES = 512
        private const val FREQ_SMOOTH = 0.02
        private const val PARAM_SMOOTH_F = 0.05f
        private const val HEADROOM = 0.9
        const val PAN_FULL_DEG = 12f
    }
}
