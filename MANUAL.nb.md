# LevelTone — Håndbok

🌐 Språk: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · **Norsk** · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Denne oversettelsen er maskinassistert og ikke gjennomgått av en morsmålsbruker. Sett en feil? Rettelser er velkomne — åpne en [PR](../../pulls).*

LevelTone gjør telefonen din til et **vater du kan høre**. Legg den på en hvilken som helst
overflate og juster til tonen sier at den er plan — uten å holde blikket på en boble.

---

## 1. Installer (sideload)

LevelTone er ikke på Play Store — du **sidelaster** APK-en:

1. Last ned **`LevelTone.apk`** fra [siste utgivelse](../../releases/latest).
2. Åpne den nedlastede filen.
3. Hvis Android advarer om installasjon fra ukjent kilde, trykk **Innstillinger → Tillat fra
   denne kilden**, gå tilbake og bekreft **Installer**.
4. Åpne **LevelTone**.

**Gratis** og **reklamefri** — ingen kostnad, ingen konto, ingen reklame, ingen nettverk,
ingen tillatelser utover bevegelsessensoren.

---

> 📹 Foretrekker du å se? Det finnes en [30-sekunders demo](docs/LevelTone-demo-nb.mp4) i repoet.
> Den er **stum** — skjermopptak kan ikke fange appens tone — så den viser bare det visuelle;
> lyden er det du faktisk kommer til å stole på.

## 2. Å nivellere noe

1. Legg telefonen **flatt på ryggen, skjermen opp**, på overflaten du vil nivellere.
2. Trykk **▶ Start tone**.
3. Juster overflaten (eller telefonens leie). Lytt:
   - **Lav tonehøyde, rask vibrato** → langt fra vater.
   - **Tonehøyde stiger, vibrato roer seg** → nærmere.
   - **Høy, stabil tone** → i vater.
4. Når du treffer vater, hører du et klokke-**"pip"** — det er bekreftelsen din. Det piper
   igjen hver gang du legger deg i vater på nytt.
5. Trykk **⏹ Stopp tone** når du er ferdig.

> Telefonen måler sin *egen* planhet. For en separat overflate, hvil telefonen på den;
> for en hylle eller brakett, sett telefonen der tingen du nivellerer skal sitte.

---

## 3. Å lese skjermen

| Element | Betydning |
|---------|-----------|
| **Vater** (sirkel) | Boblen driver mot den **høye** kanten. Sentrert på målringen = i vater. Blir **grønn** ved vater. |
| **Stor etikett** | `I VATER`, eller hvilken kant som er høy — `Øvre kant høy`, `Nedre kant høy`, `Venstre side høy`, `Høyre side høy`. |
| **`helling / V·H / F·B`** | Numeriske grader: total helling, venstre-høyre, for-bak. |

Hvis det står **"Snu telefonen — skjermen må vende opp"**, ligger telefonen opp ned;
sensoren trenger skjermen vendt mot himmelen.

---

## 4. Betjening

- **Lyd** — tonens styrke. Klokkepipet følger den samme medielydstyrken, så hvis du ikke hører
  pipet, skru også opp telefonens medielydstyrke.
- **Tonehøyde** — transponerer hele tonen opp eller ned, opptil ±1 oktav (vist i halvtoner,
  `-12 st` … `+12 st`; midten = standard). Endrer ikke hvordan nivelleringen virker — flytter
  bare tonen til et leie som er behagelig for ørene dine eller skjærer gjennom bakgrunnsstøy.
- **Stereopanorering** (av som standard) — når på, flyttes tonen til **venstre** eller **høyre**
  øreplugg/høyttaler når telefonen heller, så du hører retning i tillegg til avstand. Best med
  hodetelefoner. La den være av for en enkel monotone.

---

## 5. Tips

- **Hodetelefoner** gjør tonehøydeendringene (og stereopanoreringen) mye lettere å bedømme på gehør.
- **Finjustering:** den siste graden er der tonehøyden stiger raskest og pipet utløses — sett
  ned farten mens vibratoen forsvinner.
- Skjermen **holder seg våken** mens appen er åpen, så den ikke sovner midt i justeringen.
- **Kalibrering:** LevelTone stoler på telefonens tyngdesensor og antar at telefonens rygg er
  plan. En telefon med kamerabule eller i et deksel kan vise en brøkdel av en grad ved siden av —
  ta av dekselet for best nøyaktighet, eller noter forskyvningen.

---

## 6. Feilsøking

| Problem | Løsning |
|---------|---------|
| Ingen tone i det hele tatt | Trykk **Start tone**; skru opp **Lyd** og telefonens medielydstyrke; ta den ut av lydløs/Ikke forstyrr. |
| Ingen pip ved vater | Skru opp medielydstyrken; sørg for at den faktisk når vater (etikett viser `I VATER`, boble grønn). |
| Avlesningene hopper | Sett telefonen på en solid overflate; vibrasjon/håndtering legger til støy. |
| Alltid "ute av vater" med en hårsbredd | Ta av dekselet; den siste brøkdelen av en grad kan være en kamerabule-helling. |

---

## 7. Slik virker det (kort versjon)

Tyngdesensoren gir retningen "ned". LevelTone beregner vinkelen mellom den og telefonens
skjermnormal — 0° betyr at ryggen er helt plan. Den avbilder den vinkelen på en syntetisert
sinustone (tonehøyde + vibratotakt) og spiller en avtagende klokkeklang ved overgangen til
vater. All lyd genereres på enheten i sanntid; ingenting forlater telefonen.

---

## 8. Støtte

Hobbyapp, levert **som den er** — **ingen støtte** og ingen garanti for oppdateringer. Men
**feilrapporter og pull requests er velkomne**: åpne en [issue](../../issues) eller en
[PR](../../pulls).
