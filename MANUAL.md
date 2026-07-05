# LevelTone — User Manual

🌐 Languages: **English** · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

LevelTone turns your phone into a **level you can hear**. Set it on any surface and
adjust until the tone tells you it's flat — no need to keep your eyes on a bubble.

---

## 1. Install (sideload)

LevelTone isn't on the Play Store — you **sideload** the APK:

1. Download **`LevelTone.apk`** from the [latest release](../../releases/latest).
2. Open the downloaded file.
3. If Android warns about installing from an unknown source, tap **Settings →
   Allow from this source**, then go back and confirm **Install**.
4. Open **LevelTone**.

**Free** and **ad-free** — no cost, no account, no ads, no network, no permissions
beyond the motion sensor.

---

> 📹 Prefer to watch? There's a [30-second demo](docs/LevelTone-demo.mp4) in the repo.
> It's **silent** — screen recording can't capture the app's tone — so it shows the
> visuals only; the sound is what you'll actually rely on.

## 2. Level something

1. Lay the phone **flat on its back, screen facing up**, on the surface you want to level.
2. Tap **▶ Start tone**.
3. Adjust the surface (or the phone's footing). Listen:
   - **Low pitch, fast wobble** → far off level.
   - **Pitch rising, wobble slowing** → getting closer.
   - **High, steady tone** → level.
4. When you cross into level you'll hear a **bell "ping"** — that's your confirmation.
   It pings again every time you re-settle onto level.
5. Tap **⏹ Stop tone** when done.

> The phone measures its *own* flatness. For a separate surface, rest the phone on it;
> for a shelf or bracket, sit the phone where the thing you're leveling will go.

---

## 3. Reading the screen

| Element | Meaning |
|---------|---------|
| **Bubble level** (circle) | The bubble drifts toward the **high** edge. Centered on the target ring = level. Turns **green** when level. |
| **Big label** | `LEVEL`, or which edge is high — `Top edge high`, `Bottom edge high`, `Left side high`, `Right side high`. |
| **`tilt / L·R / F·B`** | Numeric degrees: total tilt, left-right, front-back. |

If it says **"Flip phone — screen must face up"**, the phone is upside-down; the sensor
needs the screen facing the sky.

---

## 4. Controls

- **Vol** — tone loudness. The bell ping follows the same media volume, so if you can't
  hear the ping, raise the phone's media volume too.
- **Pitch** — transposes the whole tone up or down, up to ±1 octave (shown in semitones,
  `-12 st` … `+12 st`; centre = default). Doesn't change how leveling works — just moves
  the tone into a range that's comfortable for your ears or cuts through background noise.
- **Stereo pan** (off by default) — when on, the tone shifts to the **left** or **right**
  earbud/speaker as the phone tilts left/right, so you can hear direction as well as
  distance. Best with headphones. Leave off for a plain mono tone.

---

## 5. Tips

- **Headphones** make the pitch changes (and stereo pan) much easier to judge by ear.
- **Fine-tuning:** the last degree is where the pitch climbs fastest and the ping fires —
  slow down as the wobble disappears.
- The screen **stays awake** while the app is open so it won't sleep mid-adjustment.
- **Calibration:** LevelTone trusts the phone's gravity sensor and assumes the phone's
  own back is flat. A phone with a camera bump or in a case may read a fraction of a
  degree off — remove the case for best accuracy, or note the offset.

---

## 6. Troubleshooting

| Problem | Fix |
|---------|-----|
| No tone at all | Tap **Start tone**; raise **Vol** and the phone's media volume; take it off silent/DND. |
| No ping at level | Raise media volume; make sure it actually reaches level (label shows `LEVEL`, bubble green). |
| Readings jump around | Set the phone on a solid surface; vibration/handling adds noise. |
| Always "off level" by a hair | Remove the case; the last fraction of a degree may be a camera-bump tilt. |

---

## 7. How it works (short version)

The gravity sensor gives the direction of "down". LevelTone computes the angle between
that and the phone's screen-normal — 0° means the back is perfectly flat. It maps that
angle to a synthesized sine tone (pitch + wobble rate) and fires a decaying bell chime on
the transition into level. All audio is generated on-device in real time; nothing leaves
the phone.

---

## 8. Support

Hobby app, provided **as-is** — **no support** and no guarantee of updates. But
**bug reports and pull requests are welcome**: open an
[issue](../../issues) or a [PR](../../pulls).
