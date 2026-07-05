# LevelTone — Manual

🌐 Limbi: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · **Română** · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Această traducere este asistată de mașină și nu a fost revizuită de un vorbitor nativ. Ai văzut o greșeală? Corecțiile sunt binevenite — deschide un [PR](../../pulls).*

LevelTone îți transformă telefonul într-o **nivelă pe care o poți auzi**. Așază-l pe orice
suprafață și reglează până când tonul îți spune că e plană — fără să ții ochii pe o bulă.

---

## 1. Instalare (sideload)

LevelTone nu este pe Play Store — îl instalezi prin **sideload**:

1. Descarcă **`LevelTone.apk`** din [cea mai recentă versiune](../../releases/latest).
2. Deschide fișierul descărcat.
3. Dacă Android avertizează despre instalarea dintr-o sursă necunoscută, atinge **Setări →
   Permite din această sursă**, revino și confirmă **Instalează**.
4. Deschide **LevelTone**.

**Gratuit** și **fără reclame** — fără cost, fără cont, fără reclame, fără rețea, fără
permisiuni în afara senzorului de mișcare.

---

> 📹 Preferi să privești? Există o [demonstrație de 30 de secunde](docs/LevelTone-demo-ro.mp4) în depozit.
> Este **mută** — înregistrarea ecranului nu poate capta tonul aplicației — așa că arată doar
> imaginea; sunetul este cel pe care te vei baza cu adevărat.

## 2. A nivela ceva

1. Așază telefonul **plat pe spate, ecranul în sus**, pe suprafața pe care vrei să o nivelezi.
2. Atinge **▶ Pornește tonul**.
3. Reglează suprafața (sau sprijinul telefonului). Ascultă:
   - **Ton grav, oscilație rapidă** → mult în afara nivelului.
   - **Ton urcând, oscilație încetinind** → mai aproape.
   - **Ton înalt și stabil** → la nivel.
4. Când treci la nivel vei auzi un **„bip” de clopoțel** — asta e confirmarea ta. Sună din nou
   de fiecare dată când te reașezi la nivel.
5. Atinge **⏹ Oprește tonul** când ai terminat.

> Telefonul își măsoară *propria* planeitate. Pentru o suprafață separată, sprijină telefonul pe ea;
> pentru un raft sau un suport, așază telefonul acolo unde va merge obiectul de nivelat.

---

## 3. Citirea ecranului

| Element | Semnificație |
|---------|--------------|
| **Nivelă cu bulă** (cerc) | Bula se deplasează spre marginea **înaltă**. Centrată pe inelul-țintă = la nivel. Devine **verde** la nivel. |
| **Etichetă mare** | `LA NIVEL`, sau ce margine e înaltă — `Marginea de sus sus`, `Marginea de jos sus`, `Partea stângă sus`, `Partea dreaptă sus`. |
| **`înclin. / S·D / F·S`** | Grade numerice: înclinare totală, stânga-dreapta, față-spate. |

Dacă scrie **„Întoarce telefonul — ecranul trebuie să fie în sus”**, telefonul e cu susul în jos;
senzorul are nevoie de ecran orientat spre cer.

---

## 4. Comenzi

- **Vol** — volumul tonului. Bipul de clopoțel urmează același volum media, deci dacă nu auzi
  bipul, ridică și volumul media al telefonului.
- **Înălțime** — transpune tot tonul în sus sau în jos, până la ±1 octavă (afișat în semitonuri,
  `-12 st` … `+12 st`; centru = implicit). Nu schimbă cum funcționează nivelarea — doar mută tonul
  într-un registru comod pentru urechile tale sau care taie prin zgomotul de fond.
- **Panoramare stereo** (dezactivată implicit) — când e activă, tonul se mută spre casca/difuzorul
  **stâng** sau **drept** pe măsură ce telefonul se înclină, ca să auzi direcția pe lângă distanță.
  Cel mai bine cu căști. Las-o dezactivată pentru un ton mono simplu.

---

## 5. Sfaturi

- **Căștile** fac schimbările de înălțime (și panoramarea stereo) mult mai ușor de judecat după ureche.
- **Reglaj fin:** ultimul grad e acolo unde înălțimea urcă cel mai repede și se declanșează bipul —
  încetinește pe măsură ce oscilația dispare.
- Ecranul **rămâne treaz** cât timp aplicația e deschisă, ca să nu adoarmă la mijlocul reglajului.
- **Calibrare:** LevelTone se încrede în senzorul de gravitație și presupune că spatele telefonului
  e plan. Un telefon cu proeminență de cameră sau într-o husă poate indica o fracțiune de grad —
  scoate husa pentru cea mai bună precizie, sau notează abaterea.

---

## 6. Depanare

| Problemă | Rezolvare |
|----------|-----------|
| Niciun ton | Atinge **Pornește tonul**; ridică **Vol** și volumul media al telefonului; scoate-l din silențios/Nu deranja. |
| Fără bip la nivel | Ridică volumul media; asigură-te că ajunge chiar la nivel (eticheta arată `LA NIVEL`, bula verde). |
| Citirile sar | Așază telefonul pe o suprafață solidă; vibrația/manevrarea adaugă zgomot. |
| Mereu „în afara nivelului” cu un fir de păr | Scoate husa; ultima fracțiune de grad poate fi o înclinare de la proeminența camerei. |

---

## 7. Cum funcționează (versiunea scurtă)

Senzorul de gravitație dă direcția lui „jos”. LevelTone calculează unghiul dintre aceasta și
normala la ecranul telefonului — 0° înseamnă că spatele e perfect plan. Mapează acel unghi pe un
ton sinusoidal sintetizat (înălțime + rată de oscilație) și declanșează un dangăt de clopoțel care
se stinge la trecerea la nivel. Tot sunetul e generat pe dispozitiv în timp real; nimic nu părăsește
telefonul.

---

## 8. Asistență

Aplicație de hobby, oferită **ca atare** — **fără asistență** și fără garanția actualizărilor. Totuși,
**rapoartele de erori și pull request-urile sunt binevenite**: deschide o [issue](../../issues) sau
un [PR](../../pulls).
