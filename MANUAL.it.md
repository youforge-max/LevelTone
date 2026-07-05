# LevelTone — Manuale

🌐 Lingue: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · **Italiano** · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Questa traduzione è assistita da macchina e non è stata rivista da un madrelingua. Trovato un errore? Le correzioni sono benvenute — apri una [PR](../../pulls).*

LevelTone trasforma il tuo telefono in una **livella che puoi sentire**. Appoggialo su
qualsiasi superficie e regola finché il tono ti dice che è in piano — senza dover tenere gli
occhi su una bolla.

---

## 1. Installare (sideload)

LevelTone non è sul Play Store — si installa con **sideload**:

1. Scarica **`LevelTone.apk`** dall'[ultima release](../../releases/latest).
2. Apri il file scaricato.
3. Se Android avvisa dell'installazione da origine sconosciuta, tocca **Impostazioni →
   Consenti da questa origine**, torna indietro e conferma **Installa**.
4. Apri **LevelTone**.

**Gratis** e **senza pubblicità** — nessun costo, nessun account, nessuna pubblicità,
nessuna rete, nessun permesso oltre al sensore di movimento.

---

> 📹 Preferisci guardare? C'è una [demo di 30 secondi](docs/LevelTone-demo-it.mp4) nel repo.
> È **muta** — la registrazione dello schermo non può catturare il tono dell'app — mostra
> quindi solo il visivo; il suono è ciò su cui farai davvero affidamento.

## 2. Mettere qualcosa in piano

1. Poggia il telefono **piatto sul dorso, schermo verso l'alto**, sulla superficie da livellare.
2. Tocca **▶ Avvia tono**.
3. Regola la superficie (o l'appoggio del telefono). Ascolta:
   - **Tono basso, oscillazione rapida** → molto fuori piano.
   - **Tono che sale, oscillazione che rallenta** → più vicino.
   - **Tono acuto e stabile** → in piano.
4. Quando raggiungi il piano senti un **«bip» di campana** — è la tua conferma. Suona di
   nuovo ogni volta che ti riassesti in piano.
5. Tocca **⏹ Ferma tono** quando hai finito.

> Il telefono misura la *propria* planarità. Per una superficie separata, poggia il telefono su di essa;
> per una mensola o staffa, metti il telefono dove andrà l'oggetto da livellare.

---

## 3. Leggere lo schermo

| Elemento | Significato |
|----------|-------------|
| **Livella a bolla** (cerchio) | La bolla scivola verso il bordo **alto**. Centrata sull'anello bersaglio = in piano. Diventa **verde** in piano. |
| **Etichetta grande** | `IN PIANO`, o quale bordo è alto — `Bordo superiore alto`, `Bordo inferiore alto`, `Lato sinistro alto`, `Lato destro alto`. |
| **`inclin. / S·D / A·I`** | Gradi numerici: inclinazione totale, sinistra-destra, avanti-indietro. |

Se dice **«Gira il telefono — lo schermo deve essere rivolto in alto»**, il telefono è
capovolto; il sensore ha bisogno dello schermo rivolto verso il cielo.

---

## 4. Controlli

- **Vol** — volume del tono. Il bip di campana segue lo stesso volume multimediale, quindi se
  non senti il bip, alza anche il volume multimediale del telefono.
- **Altezza** — traspone l'intero tono su o giù, fino a ±1 ottava (mostrato in semitoni,
  `-12 st` … `+12 st`; centro = predefinito). Non cambia il funzionamento della livellatura —
  sposta solo il tono in un intervallo comodo per le tue orecchie o che buca il rumore di fondo.
- **Panorama stereo** (disattivato di default) — se attivo, il tono si sposta verso
  l'auricolare/altoparlante **sinistro** o **destro** mentre il telefono si inclina, così senti
  la direzione oltre alla distanza. Meglio con le cuffie. Lascialo spento per un tono mono semplice.

---

## 5. Suggerimenti

- **Le cuffie** rendono molto più facile giudicare a orecchio i cambi di altezza (e il panorama stereo).
- **Regolazione fine:** l'ultimo grado è dove l'altezza sale più in fretta e scatta il bip —
  rallenta mentre l'oscillazione sparisce.
- Lo schermo **resta acceso** mentre l'app è aperta, così non si addormenta a metà regolazione.
- **Calibrazione:** LevelTone si fida del sensore di gravità e presume che il dorso del telefono
  sia piatto. Un telefono con sporgenza fotocamera o in una custodia può segnare una frazione di
  grado — togli la custodia per la massima precisione, o annota lo scarto.

---

## 6. Risoluzione dei problemi

| Problema | Soluzione |
|----------|-----------|
| Nessun tono | Tocca **Avvia tono**; alza **Vol** e il volume multimediale; togli da silenzioso/NDT. |
| Nessun bip in piano | Alza il volume multimediale; assicurati che raggiunga davvero il piano (etichetta `IN PIANO`, bolla verde). |
| Le letture saltano | Metti il telefono su una superficie solida; vibrazioni/maneggiamento aggiungono rumore. |
| Sempre «fuori piano» di un pelo | Togli la custodia; l'ultima frazione di grado può essere l'inclinazione della sporgenza fotocamera. |

---

## 7. Come funziona (versione breve)

Il sensore di gravità dà la direzione del «basso». LevelTone calcola l'angolo tra questa e la
normale allo schermo del telefono — 0° significa che il dorso è perfettamente piatto. Mappa
quell'angolo su un tono sinusoidale sintetizzato (altezza + frequenza di oscillazione) e fa
suonare un rintocco di campana calante al passaggio in piano. Tutto l'audio è generato sul
dispositivo in tempo reale; nulla lascia il telefono.

---

## 8. Assistenza

App per hobby, fornita **così com'è** — **nessuna assistenza** e nessuna garanzia di
aggiornamenti. Tuttavia **segnalazioni di bug e pull request sono benvenute**: apri una
[issue](../../issues) o una [PR](../../pulls).
