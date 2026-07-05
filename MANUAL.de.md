# LevelTone — Handbuch

🌐 Sprachen: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · **Deutsch** · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Diese Übersetzung ist maschinell erstellt und nicht von einem Muttersprachler geprüft. Fehler entdeckt? Korrekturen sind willkommen — öffne einen [PR](../../pulls).*

LevelTone macht dein Telefon zu einer **Wasserwaage, die du hören kannst**. Stell es auf
eine beliebige Oberfläche und justiere, bis der Ton dir sagt, dass sie flach ist — du musst
den Blick nicht auf einer Blase halten.

---

## 1. Installieren (Sideloading)

LevelTone ist nicht im Play Store — du **sideloadest** die APK:

1. Lade **`LevelTone.apk`** aus dem [neuesten Release](../../releases/latest) herunter.
2. Öffne die heruntergeladene Datei.
3. Wenn Android vor der Installation aus einer unbekannten Quelle warnt, tippe auf
   **Einstellungen → Aus dieser Quelle zulassen**, geh dann zurück und bestätige **Installieren**.
4. Öffne **LevelTone**.

**Kostenlos** und **werbefrei** — keine Kosten, kein Konto, keine Werbung, kein Netzwerk,
keine Berechtigungen außer dem Bewegungssensor.

---

> 📹 Lieber ansehen? Es gibt eine [30-Sekunden-Demo](docs/LevelTone-demo-de.mp4) im Repo.
> Sie ist **stumm** — die Bildschirmaufnahme kann den Ton der App nicht erfassen — sie zeigt
> also nur das Bild; der Klang ist das, worauf du dich in Wirklichkeit verlässt.

## 2. Etwas ausrichten

1. Leg das Telefon **flach auf den Rücken, Display nach oben**, auf die auszurichtende Fläche.
2. Tippe auf **▶ Ton starten**.
3. Justiere die Fläche (oder den Stand des Telefons). Höre:
   - **Tiefe Tonhöhe, schnelles Wobbeln** → weit außer der Waage.
   - **Tonhöhe steigt, Wobbeln verlangsamt** → näher dran.
   - **Hoher, stabiler Ton** → waagerecht.
4. Wenn du waagerecht wirst, hörst du einen Glocken-**„Ping“** — das ist deine Bestätigung.
   Er pingt erneut, jedes Mal wenn du dich wieder auf waagerecht einpendelst.
5. Tippe auf **⏹ Ton stoppen**, wenn du fertig bist.

> Das Telefon misst seine *eigene* Flachheit. Für eine separate Fläche leg das Telefon darauf;
> für ein Regal oder eine Halterung setz das Telefon dorthin, wo das auszurichtende Ding hinkommt.

---

## 3. Den Bildschirm lesen

| Element | Bedeutung |
|---------|-----------|
| **Wasserwaage** (Kreis) | Die Blase driftet zur **hohen** Kante. Zentriert auf dem Zielring = waagerecht. Wird **grün** bei waagerecht. |
| **Großes Label** | `WAAGERECHT`, oder welche Kante hoch ist — `Oberkante hoch`, `Unterkante hoch`, `Linke Seite hoch`, `Rechte Seite hoch`. |
| **`Neigung / L·R / V·H`** | Numerische Grad: Gesamtneigung, links-rechts, vorne-hinten. |

Wenn dort **„Telefon umdrehen — Display muss nach oben zeigen“** steht, liegt das Telefon
verkehrt herum; der Sensor braucht das Display zum Himmel gerichtet.

---

## 4. Bedienelemente

- **Laut.** — Tonlautstärke. Der Glocken-Ping folgt derselben Medienlautstärke, also wenn du
  den Ping nicht hörst, erhöhe auch die Medienlautstärke des Telefons.
- **Tonhöhe** — transponiert den ganzen Ton nach oben oder unten, um bis zu ±1 Oktave
  (angezeigt in Halbtönen, `-12 HT` … `+12 HT`; Mitte = Standard). Ändert nichts daran, wie
  das Ausrichten funktioniert — verschiebt den Ton nur in einen Bereich, der für deine Ohren
  angenehm ist oder durch Hintergrundgeräusche durchdringt.
- **Stereo-Panorama** (standardmäßig aus) — wenn aktiviert, verschiebt sich der Ton zum
  **linken** oder **rechten** Ohrhörer/Lautsprecher, während das Telefon links/rechts kippt,
  sodass du Richtung wie auch Abstand hören kannst. Am besten mit Kopfhörern. Lass es aus für
  einen einfachen Mono-Ton.

---

## 5. Tipps

- **Kopfhörer** machen die Tonhöhenänderungen (und das Stereo-Panorama) viel leichter nach
  Gehör zu beurteilen.
- **Feinjustierung:** das letzte Grad ist dort, wo die Tonhöhe am schnellsten steigt und der
  Ping auslöst — werde langsamer, während das Wobbeln verschwindet.
- Der Bildschirm **bleibt wach**, solange die App offen ist, damit er nicht mitten im
  Justieren einschläft.
- **Kalibrierung:** LevelTone vertraut dem Schwerkraftsensor des Telefons und nimmt an, dass
  der Rücken des Telefons flach ist. Ein Telefon mit Kamerabuckel oder in einer Hülle kann
  einen Bruchteil eines Grades abweichen — nimm die Hülle für beste Genauigkeit ab oder
  notiere den Versatz.

---

## 6. Fehlerbehebung

| Problem | Lösung |
|---------|--------|
| Gar kein Ton | Tippe auf **Ton starten**; erhöhe **Laut.** und die Medienlautstärke des Telefons; nimm es aus Stumm/Bitte-nicht-stören. |
| Kein Ping bei waagerecht | Erhöhe die Medienlautstärke; stell sicher, dass es wirklich waagerecht wird (Label zeigt `WAAGERECHT`, Blase grün). |
| Messwerte springen | Stell das Telefon auf eine feste Oberfläche; Vibration/Berührung fügt Rauschen hinzu. |
| Immer um Haaresbreite „außer der Waage“ | Nimm die Hülle ab; der letzte Bruchteil eines Grades kann eine Kamerabuckel-Neigung sein. |

---

## 7. Wie es funktioniert (Kurzfassung)

Der Schwerkraftsensor liefert die Richtung von „unten“. LevelTone berechnet den Winkel
zwischen dieser und der Bildschirmnormalen des Telefons — 0° bedeutet, der Rücken ist perfekt
flach. Dieser Winkel wird auf einen synthetisierten Sinuston (Tonhöhe + Wobbelrate) abgebildet,
und beim Übergang zu waagerecht erklingt ein ausklingender Glockenton. Alle Audiosignale werden
in Echtzeit auf dem Gerät erzeugt; nichts verlässt das Telefon.

---

## 8. Support

Hobby-App, bereitgestellt **wie besehen** — **kein Support** und keine Garantie auf Updates.
Aber **Fehlerberichte und Pull Requests sind willkommen**: öffne ein [Issue](../../issues)
oder einen [PR](../../pulls).
