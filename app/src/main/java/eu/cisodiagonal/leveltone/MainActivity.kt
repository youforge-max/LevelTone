package eu.cisodiagonal.leveltone

import android.app.Application
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    override fun attachBaseContext(newBase: android.content.Context) {
        super.attachBaseContext(LocaleHelper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Keep the screen awake while you adjust the surface.
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        // Immersive: hide the navigation bar (and status bar) so the bubble level
        // gets the full screen; a swipe from the edge brings them back transiently.
        val bars = WindowCompat.getInsetsController(window, window.decorView)
        bars.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        bars.hide(WindowInsetsCompat.Type.systemBars())
        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                Surface(Modifier.fillMaxSize()) { LevelApp() }
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        // Re-hide the bars after a transient swipe reveal or returning to the app.
        if (hasFocus) {
            WindowCompat.getInsetsController(window, window.decorView)
                .hide(WindowInsetsCompat.Type.systemBars())
        }
    }
}

// ---------------------------------------------------------------------------
// ViewModel: reads gravity sensor, computes tilt, drives the tone engine.
// ---------------------------------------------------------------------------

data class Readout(
    val tiltDeg: Float = 0f,
    val pitchDeg: Float = 0f,   // front/back tilt (top edge +)
    val rollDeg: Float = 0f,    // left/right tilt (right edge +)
    val level: Boolean = false,
    val labelRes: Int = R.string.status_place_flat,   // localized status text
)

class LevelViewModel(app: Application) : AndroidViewModel(app), SensorEventListener {

    private val sm = app.getSystemService(SensorManager::class.java)
    private val sensor: Sensor? =
        sm.getDefaultSensor(Sensor.TYPE_GRAVITY) ?: sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    private val usingRawAccel = sm.getDefaultSensor(Sensor.TYPE_GRAVITY) == null

    private val tone = ToneEngine()

    // "You hit level" alert fires on the rising edge (not-level -> level). Uses the
    // engine's synthesized bell ping so it's audible on the media stream regardless of
    // notification-volume settings.
    private var wasLevel = false

    private val _readout = MutableStateFlow(Readout())
    val readout: StateFlow<Readout> = _readout.asStateFlow()

    var toneOn by mutableStateOf(false)
        private set
    var stereo by mutableStateOf(false)
        private set
    var volume by mutableStateOf(0.5f)
        private set
    // Pitch offset: 0.5 = default, 0 = one octave down, 1 = one octave up.
    var pitch by mutableStateOf(0.5f)
        private set

    // Low-pass filter state (only used when we have raw accelerometer, no gravity sensor).
    private val g = FloatArray(3)
    private var haveG = false

    fun startListening() {
        sensor?.let { sm.registerListener(this, it, SensorManager.SENSOR_DELAY_GAME) }
    }

    fun stopListening() {
        sm.unregisterListener(this)
    }

    fun toggleTone() {
        toneOn = !toneOn
        if (toneOn) {
            tone.gain = volume
            tone.stereo = stereo
            tone.start()
        } else tone.stop()
    }

    fun onVolume(v: Float) { volume = v; tone.gain = v }
    fun onStereo(on: Boolean) { stereo = on; tone.stereo = on }
    fun onPitch(v: Float) { pitch = v }

    // Transpose the whole tone range by up to +/- one octave (2^(+-1)).
    private fun pitchScale(): Float =
        Math.pow(2.0, ((pitch - 0.5f) * 2f).toDouble()).toFloat()

    override fun onSensorChanged(e: SensorEvent) {
        if (usingRawAccel) {
            val a = 0.2f
            if (!haveG) { g[0] = e.values[0]; g[1] = e.values[1]; g[2] = e.values[2]; haveG = true }
            else for (i in 0..2) g[i] = g[i] + a * (e.values[i] - g[i])
        } else {
            g[0] = e.values[0]; g[1] = e.values[1]; g[2] = e.values[2]
        }
        val gx = g[0]; val gy = g[1]; val gz = g[2]
        val mag = sqrt(gx * gx + gy * gy + gz * gz).coerceAtLeast(1e-3f)

        // Angle of the screen normal away from vertical (0 = perfectly flat, screen up).
        val tilt = Math.toDegrees(acos((gz / mag).coerceIn(-1f, 1f).toDouble())).toFloat()
        val roll = Math.toDegrees(atan2(gx.toDouble(), gz.toDouble())).toFloat()   // right edge +
        val pitch = Math.toDegrees(atan2(gy.toDouble(), gz.toDouble())).toFloat()  // top edge +

        val level = tilt < LEVEL_THRESH
        val labelRes = when {
            gz < 0 -> R.string.status_flip
            level -> R.string.status_level
            abs(roll) >= abs(pitch) -> if (roll > 0) R.string.status_right_high else R.string.status_left_high
            else -> if (pitch > 0) R.string.status_top_high else R.string.status_bottom_high
        }
        _readout.value = Readout(tilt, pitch, roll, level, labelRes)

        // Ping every time we cross into level.
        if (level && !wasLevel) tone.ping()
        wasLevel = level

        // Drive tone: level -> high steady; tilted -> lower pitch + faster wobble.
        val t = (tilt / TILT_RANGE).coerceIn(0f, 1f)
        val freq = (FREQ_LEVEL - t * (FREQ_LEVEL - FREQ_FAR)) * pitchScale()
        val pulse = if (level) 0f else 1.5f + t * 7f
        tone.update(freq, pulse, roll)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}

    override fun onCleared() { tone.stop(); stopListening() }

    companion object {
        const val LEVEL_THRESH = 0.4f   // degrees considered "level"
        const val TILT_RANGE = 12f      // degrees mapped across the full tone range
        const val FREQ_LEVEL = 1318f    // Hz at level (E6, bright)
        const val FREQ_FAR = 330f       // Hz when far off level (E4)
    }
}

// ---------------------------------------------------------------------------
// UI
// ---------------------------------------------------------------------------

@Composable
fun LevelApp(vm: LevelViewModel = viewModel()) {
    val r by vm.readout.collectAsState()
    var showLang by remember { mutableStateOf(false) }

    DisposableEffect(Unit) {
        vm.startListening()
        onDispose { vm.stopListening() }
    }

    Box(Modifier.fillMaxSize()) {
    // Language picker button, top-end corner.
    TextButton(
        onClick = { showLang = true },
        modifier = Modifier.align(Alignment.TopEnd).padding(top = 8.dp, end = 4.dp)
    ) { Text("🌐", fontSize = 20.sp) }

    if (showLang) LanguageDialog(onDismiss = { showLang = false })

    Column(
        Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.app_name), style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(4.dp))
        Text(stringResource(R.string.subtitle),
            style = MaterialTheme.typography.bodySmall, textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurfaceVariant)

        Spacer(Modifier.height(20.dp))

        BubbleLevel(r, Modifier.fillMaxWidth().aspectRatio(1f).padding(horizontal = 12.dp))

        Spacer(Modifier.height(16.dp))

        val accent = if (r.level) Color(0xFF3DDC84) else MaterialTheme.colorScheme.onSurface
        Text(stringResource(r.labelRes), style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold, color = accent, textAlign = TextAlign.Center)
        Spacer(Modifier.height(6.dp))
        Text(stringResource(R.string.readout_fmt, r.tiltDeg, r.rollDeg, r.pitchDeg),
            style = MaterialTheme.typography.bodyMedium, fontFamily = FontFamily.Monospace,
            color = MaterialTheme.colorScheme.onSurfaceVariant)

        Spacer(Modifier.weight(1f))

        Button(onClick = { vm.toggleTone() }, modifier = Modifier.fillMaxWidth()) {
            Text(stringResource(if (vm.toneOn) R.string.btn_stop else R.string.btn_start), fontSize = 18.sp)
        }

        Spacer(Modifier.height(12.dp))
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(stringResource(R.string.lbl_vol), style = MaterialTheme.typography.labelLarge)
            Spacer(Modifier.width(12.dp))
            Slider(
                value = vm.volume,
                onValueChange = { vm.onVolume(it) },
                modifier = Modifier.weight(1f)
            )
            Spacer(Modifier.width(12.dp))
            Text("${(vm.volume * 100).toInt()}%", fontFamily = FontFamily.Monospace)
        }

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(stringResource(R.string.lbl_pitch), style = MaterialTheme.typography.labelLarge)
            Spacer(Modifier.width(12.dp))
            Slider(
                value = vm.pitch,
                onValueChange = { vm.onPitch(it) },
                modifier = Modifier.weight(1f)
            )
            Spacer(Modifier.width(12.dp))
            Text(stringResource(R.string.semitone_fmt, ((vm.pitch - 0.5f) * 24).toInt()),
                fontFamily = FontFamily.Monospace)
        }

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(stringResource(R.string.lbl_stereo), Modifier.weight(1f),
                style = MaterialTheme.typography.bodyMedium)
            Switch(checked = vm.stereo, onCheckedChange = { vm.onStereo(it) })
        }
    }
    }
}

@Composable
private fun LanguageDialog(onDismiss: () -> Unit) {
    val ctx = LocalContext.current
    val current = LocaleHelper.savedTag(ctx)
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.lbl_language)) },
        text = {
            LazyColumn(Modifier.fillMaxWidth()) {
                items(LocaleHelper.LANGUAGE_TAGS) { tag ->
                    val label = if (tag.isEmpty()) stringResource(R.string.language_system)
                                else LocaleHelper.displayName(tag)
                    val selected = tag == current
                    Row(
                        Modifier.fillMaxWidth().padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(selected = selected, onClick = {
                            LocaleHelper.save(ctx, tag)
                            LocaleHelper.findActivity(ctx)?.recreate()
                        })
                        Spacer(Modifier.width(8.dp))
                        Text(label, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text(stringResource(R.string.dlg_close)) } },
    )
}

@Composable
private fun BubbleLevel(r: Readout, modifier: Modifier) {
    val ringColor = MaterialTheme.colorScheme.outline
    val targetColor = if (r.level) Color(0xFF3DDC84) else MaterialTheme.colorScheme.primary
    val bubbleColor = if (r.level) Color(0xFF3DDC84) else Color(0xFFFF7043)

    Canvas(modifier) {
        val w = size.minDimension
        val cx = size.width / 2f
        val cy = size.height / 2f
        val outer = w * 0.46f
        val targetR = w * 0.09f

        // Outer ring + crosshair.
        drawCircle(ringColor, radius = outer, center = Offset(cx, cy), style = androidx.compose.ui.graphics.drawscope.Stroke(3f))
        drawLine(ringColor, Offset(cx - outer, cy), Offset(cx + outer, cy), strokeWidth = 2f)
        drawLine(ringColor, Offset(cx, cy - outer), Offset(cx, cy + outer), strokeWidth = 2f)
        // Center target where the bubble should sit.
        drawCircle(targetColor, radius = targetR, center = Offset(cx, cy),
            style = androidx.compose.ui.graphics.drawscope.Stroke(3f))

        // Bubble offset: map roll (x) and pitch (y) to pixels, clamp to ring.
        val scale = outer / LevelViewModel.TILT_RANGE
        var dx = r.rollDeg * scale
        var dy = -r.pitchDeg * scale   // top-edge-high pushes bubble up
        val d = sqrt(dx * dx + dy * dy)
        val maxD = outer - targetR
        if (d > maxD && d > 0f) { dx *= maxD / d; dy *= maxD / d }

        drawCircle(bubbleColor, radius = targetR * 0.85f, center = Offset(cx + dx, cy + dy))
    }
}
