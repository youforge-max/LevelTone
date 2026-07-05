# LevelTone — Vejledning

🌐 Sprog: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · **Dansk** · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Denne oversættelse er maskinassisteret og ikke gennemgået af en indfødt taler. Set en fejl? Rettelser er velkomne — åbn en [PR](../../pulls).*

LevelTone gør din telefon til et **vaterpas, du kan høre**. Læg den på en hvilken som helst
overflade og juster, indtil tonen fortæller, at den er plan — uden at holde øjnene på en boble.

---

## 1. Installer (sideload)

LevelTone er ikke på Play Store — du **sideloader** APK'en:

1. Download **`LevelTone.apk`** fra [seneste udgivelse](../../releases/latest).
2. Åbn den downloadede fil.
3. Hvis Android advarer om installation fra ukendt kilde, tryk **Indstillinger → Tillad fra
   denne kilde**, gå tilbage og bekræft **Installer**.
4. Åbn **LevelTone**.

**Gratis** og **reklamefri** — ingen omkostning, ingen konto, ingen reklamer, intet netværk,
ingen tilladelser ud over bevægelsessensoren.

---

> 📹 Foretrækker du at se? Der er en [30-sekunders demo](docs/LevelTone-demo-da.mp4) i repoet.
> Den er **lydløs** — skærmoptagelse kan ikke fange appens tone — så den viser kun det
> visuelle; lyden er det, du faktisk kommer til at læne dig op ad.

## 2. At nivellere noget

1. Læg telefonen **fladt på ryggen, skærmen opad**, på overfladen du vil nivellere.
2. Tryk **▶ Start tone**.
3. Juster overfladen (eller telefonens leje). Lyt:
   - **Lav tonehøjde, hurtig vibrato** → langt fra vater.
   - **Tonehøjde stiger, vibrato aftager** → tættere på.
   - **Høj, stabil tone** → i vater.
4. Når du rammer vater, hører du et klokke-**"bip"** — det er din bekræftelse. Det bipper
   igen, hver gang du lægger dig i vater på ny.
5. Tryk **⏹ Stop tone**, når du er færdig.

> Telefonen måler sin *egen* planhed. For en separat overflade, hvil telefonen på den;
> for en hylde eller beslag, sæt telefonen der, hvor tingen du nivellerer skal sidde.

---

## 3. At læse skærmen

| Element | Betydning |
|---------|-----------|
| **Vaterpas** (cirkel) | Boblen driver mod den **høje** kant. Centreret på målringen = i vater. Bliver **grøn** ved vater. |
| **Stor etiket** | `I VATER`, eller hvilken kant der er høj — `Øverste kant høj`, `Nederste kant høj`, `Venstre side høj`, `Højre side høj`. |
| **`hældning / V·H / F·B`** | Numeriske grader: samlet hældning, venstre-højre, for-bag. |

Hvis der står **"Vend telefonen — skærmen skal vende opad"**, ligger telefonen omvendt;
sensoren har brug for skærmen vendt mod himlen.

---

## 4. Betjening

- **Lyd** — tonens styrke. Klokkebippet følger den samme medielydstyrke, så hvis du ikke hører
  bippet, skru også op for telefonens medielydstyrke.
- **Tonehøjde** — transponerer hele tonen op eller ned, op til ±1 oktav (vist i halvtoner,
  `-12 st` … `+12 st`; midten = standard). Ændrer ikke, hvordan nivelleringen virker — flytter
  blot tonen til et leje, der er behageligt for dine ører eller skærer gennem baggrundsstøj.
- **Stereopanorering** (fra som standard) — når til, flytter tonen til **venstre** eller
  **højre** øreprop/højtaler, når telefonen hælder, så du hører retning ud over afstand. Bedst
  med hovedtelefoner. Lad den være slået fra for en simpel monotone.

---

## 5. Tips

- **Hovedtelefoner** gør tonehøjdeændringerne (og stereopanoreringen) meget lettere at bedømme på gehør.
- **Finjustering:** den sidste grad er, hvor tonehøjden stiger hurtigst, og bippet udløses —
  sæt farten ned, mens vibratoen forsvinder.
- Skærmen **forbliver vågen**, mens appen er åben, så den ikke falder i søvn midt i justeringen.
- **Kalibrering:** LevelTone stoler på telefonens tyngdesensor og antager, at telefonens ryg er
  plan. En telefon med kamerabule eller i et etui kan vise en brøkdel af en grad ved siden af —
  tag etuiet af for bedste nøjagtighed, eller notér forskydningen.

---

## 6. Fejlfinding

| Problem | Løsning |
|---------|---------|
| Ingen tone overhovedet | Tryk **Start tone**; skru op for **Lyd** og telefonens medielydstyrke; tag den ud af lydløs/Forstyr ikke. |
| Intet bip ved vater | Skru op for medielydstyrken; sørg for, at den faktisk når vater (etiket viser `I VATER`, boble grøn). |
| Aflæsningerne hopper | Sæt telefonen på en solid overflade; vibration/håndtering tilføjer støj. |
| Altid "ude af vater" med en hårsbredde | Tag etuiet af; den sidste brøkdel af en grad kan være en kamerabule-hældning. |

---

## 7. Sådan virker det (kort version)

Tyngdesensoren giver retningen "ned". LevelTone beregner vinklen mellem den og telefonens
skærmnormal — 0° betyder, at ryggen er helt plan. Den afbilder den vinkel på en syntetiseret
sinustone (tonehøjde + vibratotakt) og spiller en aftagende klokkeklang ved overgangen til
vater. Al lyd genereres på enheden i realtid; intet forlader telefonen.

---

## 8. Support

Hobbyapp, leveret **som den er** — **ingen support** og ingen garanti for opdateringer. Men
**fejlrapporter og pull requests er velkomne**: åbn en [issue](../../issues) eller en
[PR](../../pulls).
