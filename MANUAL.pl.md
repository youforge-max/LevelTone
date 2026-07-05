# LevelTone — Instrukcja

🌐 Języki: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · **Polski** · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *To tłumaczenie zostało wykonane maszynowo i nie było sprawdzane przez rodzimego użytkownika. Widzisz błąd? Poprawki są mile widziane — otwórz [PR](../../pulls).*

LevelTone zmienia twój telefon w **poziomicę, którą słychać**. Połóż go na dowolnej
powierzchni i reguluj, aż ton powie ci, że jest płaska — bez wpatrywania się w bąbelek.

---

## 1. Instalacja (sideload)

LevelTone nie ma go w Sklepie Play — instalujesz przez **sideload**:

1. Pobierz **`LevelTone.apk`** z [najnowszego wydania](../../releases/latest).
2. Otwórz pobrany plik.
3. Jeśli Android ostrzega przed instalacją z nieznanego źródła, dotknij **Ustawienia →
   Zezwól z tego źródła**, wróć i potwierdź **Zainstaluj**.
4. Otwórz **LevelTone**.

**Za darmo** i **bez reklam** — bez opłat, bez konta, bez reklam, bez sieci, bez uprawnień
poza czujnikiem ruchu.

---

> 📹 Wolisz obejrzeć? W repozytorium jest [30-sekundowe demo](docs/LevelTone-demo-pl.mp4).
> Jest **nieme** — nagrywanie ekranu nie potrafi uchwycić tonu aplikacji — pokazuje więc
> tylko obraz; dźwięk to to, na czym naprawdę polegasz.

## 2. Poziomowanie czegoś

1. Połóż telefon **płasko na plecach, ekranem do góry**, na powierzchni do wypoziomowania.
2. Dotknij **▶ Uruchom ton**.
3. Reguluj powierzchnię (lub oparcie telefonu). Słuchaj:
   - **Niska wysokość, szybkie drganie** → daleko od poziomu.
   - **Wysokość rośnie, drganie zwalnia** → coraz bliżej.
   - **Wysoki, stabilny ton** → poziomo.
4. Gdy przekroczysz poziom, usłyszysz **dzwonkowy „bip”** — to twoje potwierdzenie. Bipnie
   ponownie za każdym razem, gdy znów osiądziesz na poziomie.
5. Dotknij **⏹ Zatrzymaj ton**, gdy skończysz.

> Telefon mierzy *własną* płaskość. Dla osobnej powierzchni połóż telefon na niej;
> dla półki lub wspornika ustaw telefon tam, gdzie trafi poziomowany przedmiot.

---

## 3. Odczyt ekranu

| Element | Znaczenie |
|---------|-----------|
| **Poziomica** (okrąg) | Bąbelek dryfuje ku **wysokiej** krawędzi. Wyśrodkowany na pierścieniu celu = poziomo. Robi się **zielony** przy poziomie. |
| **Duża etykieta** | `POZIOMO`, albo która krawędź jest wyżej — `Górna krawędź wyżej`, `Dolna krawędź wyżej`, `Lewa strona wyżej`, `Prawa strona wyżej`. |
| **`nachyl. / L·P / P·T`** | Stopnie liczbowe: całkowite nachylenie, lewo-prawo, przód-tył. |

Jeśli wyświetla **„Odwróć telefon — ekran musi być skierowany do góry”**, telefon leży
odwrotnie; czujnik potrzebuje ekranu zwróconego do nieba.

---

## 4. Sterowanie

- **Głoś.** — głośność tonu. Dzwonkowy bip podąża za tą samą głośnością multimediów, więc jeśli
  nie słyszysz bipa, podnieś też głośność multimediów telefonu.
- **Wysokość** — transponuje cały ton w górę lub w dół, do ±1 oktawy (pokazane w półtonach,
  `-12 st` … `+12 st`; środek = domyślnie). Nie zmienia działania poziomowania — przesuwa tylko
  ton w zakres wygodny dla twoich uszu lub przebijający się przez szum tła.
- **Panorama stereo** (domyślnie wyłączona) — gdy włączona, ton przesuwa się do **lewej** lub
  **prawej** słuchawki/głośnika wraz z przechyleniem telefonu, więc słyszysz kierunek obok
  odległości. Najlepiej ze słuchawkami. Zostaw wyłączoną dla zwykłego tonu mono.

---

## 5. Wskazówki

- **Słuchawki** znacznie ułatwiają ocenę zmian wysokości (i panoramy stereo) na słuch.
- **Dostrajanie:** ostatni stopień to miejsce, gdzie wysokość rośnie najszybciej i odpala bip —
  zwalniaj, gdy drganie zanika.
- Ekran **pozostaje włączony**, gdy aplikacja jest otwarta, by nie zasnął w trakcie regulacji.
- **Kalibracja:** LevelTone ufa czujnikowi grawitacji i zakłada, że plecy telefonu są płaskie.
  Telefon z wypukłością aparatu lub w etui może wskazać ułamek stopnia — zdejmij etui dla
  najlepszej dokładności lub zanotuj przesunięcie.

---

## 6. Rozwiązywanie problemów

| Problem | Rozwiązanie |
|---------|-------------|
| Brak tonu | Dotknij **Uruchom ton**; podnieś **Głoś.** i głośność multimediów; zdejmij z trybu cichego/NP. |
| Brak bipa przy poziomie | Podnieś głośność multimediów; upewnij się, że naprawdę osiąga poziom (etykieta `POZIOMO`, bąbelek zielony). |
| Odczyty skaczą | Postaw telefon na solidnej powierzchni; wibracje/dotykanie dodają szumu. |
| Zawsze „poza poziomem” o włos | Zdejmij etui; ostatni ułamek stopnia może być nachyleniem od wypukłości aparatu. |

---

## 7. Jak to działa (krótko)

Czujnik grawitacji podaje kierunek „w dół”. LevelTone oblicza kąt między nim a normalną do
ekranu telefonu — 0° oznacza, że plecy są idealnie płaskie. Odwzorowuje ten kąt na
syntezowany ton sinusoidalny (wysokość + tempo drgania) i odpala zanikający dzwonek przy
przejściu w poziom. Cały dźwięk generowany jest na urządzeniu w czasie rzeczywistym; nic nie
opuszcza telefonu.

---

## 8. Wsparcie

Aplikacja hobbystyczna, dostarczana **taka jaka jest** — **bez wsparcia** i bez gwarancji
aktualizacji. Mimo to **zgłoszenia błędów i pull requesty są mile widziane**: otwórz
[issue](../../issues) lub [PR](../../pulls).
