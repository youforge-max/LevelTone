# LevelTone — Handbok

🌐 Språk: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · **Svenska** · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Denna översättning är maskinstödd och inte granskad av en modersmålstalare. Sett ett fel? Rättelser är välkomna — öppna en [PR](../../pulls).*

LevelTone gör din telefon till ett **vattenpass du kan höra**. Lägg den på vilken yta som
helst och justera tills tonen säger att den är plan — du behöver inte hålla blicken på en bubbla.

---

## 1. Installera (sideload)

LevelTone finns inte på Play Store — du **sidladdar** APK:n:

1. Ladda ner **`LevelTone.apk`** från [senaste utgåvan](../../releases/latest).
2. Öppna den nedladdade filen.
3. Om Android varnar för installation från okänd källa, tryck **Inställningar → Tillåt från
   denna källa**, gå tillbaka och bekräfta **Installera**.
4. Öppna **LevelTone**.

**Gratis** och **reklamfritt** — ingen kostnad, inget konto, inga annonser, inget nätverk,
inga behörigheter utöver rörelsesensorn.

---

> 📹 Föredrar du att titta? Det finns en [30-sekunders demo](docs/LevelTone-demo-sv.mp4) i repot.
> Den är **tyst** — skärminspelning kan inte fånga appens ton — så den visar bara det visuella;
> ljudet är vad du faktiskt kommer att förlita dig på.

## 2. Väga in något

1. Lägg telefonen **platt på baksidan, skärmen uppåt**, på ytan du vill väga in.
2. Tryck **▶ Starta ton**.
3. Justera ytan (eller telefonens stöd). Lyssna:
   - **Låg tonhöjd, snabbt vibrato** → långt från våg.
   - **Tonhöjd stiger, vibrato saktar** → närmare.
   - **Hög, stabil ton** → i våg.
4. När du når våg hör du ett klock-**"pip"** — det är din bekräftelse. Det pipar igen varje
   gång du lägger dig i våg på nytt.
5. Tryck **⏹ Stoppa ton** när du är klar.

> Telefonen mäter sin *egen* planhet. För en separat yta, vila telefonen på den;
> för en hylla eller konsol, ställ telefonen där föremålet du väger in ska sitta.

---

## 3. Läsa skärmen

| Element | Betydelse |
|---------|-----------|
| **Vattenpass** (cirkel) | Bubblan driver mot den **höga** kanten. Centrerad på målringen = i våg. Blir **grön** vid våg. |
| **Stor etikett** | `I VÅG`, eller vilken kant som är hög — `Överkant hög`, `Nederkant hög`, `Vänster sida hög`, `Höger sida hög`. |
| **`lutning / V·H / F·B`** | Numeriska grader: total lutning, vänster-höger, fram-bak. |

Om det står **"Vänd telefonen — skärmen måste vara uppåt"** ligger telefonen upp och ner;
sensorn behöver skärmen vänd mot himlen.

---

## 4. Kontroller

- **Vol** — tonens volym. Klockpipet följer samma medievolym, så om du inte hör pipet, höj
  även telefonens medievolym.
- **Tonhöjd** — transponerar hela tonen upp eller ner, upp till ±1 oktav (visas i halvtoner,
  `-12 st` … `+12 st`; mitten = standard). Ändrar inte hur invägningen fungerar — flyttar bara
  tonen till ett omfång som är bekvämt för dina öron eller skär genom bakgrundsljud.
- **Stereopanorering** (av som standard) — när på flyttas tonen till **vänster** eller **höger**
  öronsnäcka/högtalare när telefonen lutar, så du hör riktning utöver avstånd. Bäst med
  hörlurar. Lämna av för en enkel monoton.

---

## 5. Tips

- **Hörlurar** gör tonhöjdsändringarna (och stereopanoreringen) mycket lättare att bedöma på gehör.
- **Finjustering:** sista graden är där tonhöjden stiger snabbast och pipet utlöses — sakta
  ner när vibratot försvinner.
- Skärmen **förblir vaken** medan appen är öppen, så den inte somnar mitt i justeringen.
- **Kalibrering:** LevelTone litar på telefonens gravitationssensor och antar att telefonens
  baksida är plan. En telefon med kamerabula eller i ett skal kan visa en bråkdels grad fel —
  ta av skalet för bästa noggrannhet, eller notera avvikelsen.

---

## 6. Felsökning

| Problem | Lösning |
|---------|---------|
| Ingen ton alls | Tryck **Starta ton**; höj **Vol** och telefonens medievolym; ta den ur tyst/Stör ej. |
| Inget pip vid våg | Höj medievolymen; se till att den verkligen når våg (etiketten visar `I VÅG`, bubblan grön). |
| Avläsningarna hoppar | Ställ telefonen på en stadig yta; vibration/hantering lägger till brus. |
| Alltid "ur våg" med ett hårstrå | Ta av skalet; sista bråkdels grad kan vara en kamerabulslutning. |

---

## 7. Så fungerar det (kort version)

Gravitationssensorn ger riktningen "ner". LevelTone beräknar vinkeln mellan den och telefonens
skärmnormal — 0° betyder att baksidan är helt plan. Den mappar den vinkeln till en syntetiserad
sinuston (tonhöjd + vibratotakt) och spelar en avtonande klockklang vid övergången till våg.
Allt ljud genereras på enheten i realtid; inget lämnar telefonen.

---

## 8. Support

Hobbyapp, tillhandahålls **i befintligt skick** — **ingen support** och ingen garanti för
uppdateringar. Men **buggrapporter och pull requests är välkomna**: öppna en
[issue](../../issues) eller en [PR](../../pulls).
