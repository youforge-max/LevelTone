# LevelTone — Panduan

🌐 Bahasa: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · **Bahasa Indonesia** · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Terjemahan ini dibantu mesin dan belum ditinjau oleh penutur asli. Menemukan kesalahan? Koreksi diterima dengan senang hati — buka [PR](../../pulls).*

LevelTone mengubah ponsel Anda menjadi **waterpas yang bisa Anda dengar**. Letakkan di
permukaan mana pun dan sesuaikan sampai nada memberitahu bahwa itu datar — tanpa perlu terus
menatap gelembung.

---

## 1. Pasang (sideload)

LevelTone tidak ada di Play Store — Anda **sideload** APK-nya:

1. Unduh **`LevelTone.apk`** dari [rilis terbaru](../../releases/latest).
2. Buka berkas yang diunduh.
3. Jika Android memperingatkan pemasangan dari sumber tak dikenal, ketuk **Setelan → Izinkan
   dari sumber ini**, lalu kembali dan konfirmasi **Pasang**.
4. Buka **LevelTone**.

**Gratis** dan **tanpa iklan** — tanpa biaya, tanpa akun, tanpa iklan, tanpa jaringan, tanpa
izin selain sensor gerak.

---

> 📹 Lebih suka menonton? Ada [demo 30 detik](docs/LevelTone-demo-id.mp4) di repo.
> Demo itu **bisu** — perekaman layar tidak bisa menangkap nada aplikasi — jadi hanya
> menampilkan visual; suaralah yang sebenarnya Anda andalkan.

## 2. Meratakan sesuatu

1. Baringkan ponsel **telentang datar, layar menghadap ke atas**, di permukaan yang ingin diratakan.
2. Ketuk **▶ Mulai nada**.
3. Sesuaikan permukaan (atau tumpuan ponsel). Dengarkan:
   - **Nada rendah, getaran cepat** → jauh dari rata.
   - **Nada naik, getaran melambat** → makin dekat.
   - **Nada tinggi dan stabil** → rata.
4. Saat menyeberang ke rata Anda akan mendengar **"ping" lonceng** — itulah konfirmasi Anda.
   Ia berbunyi lagi setiap kali Anda kembali mantap di posisi rata.
5. Ketuk **⏹ Hentikan nada** saat selesai.

> Ponsel mengukur kerataan *dirinya sendiri*. Untuk permukaan terpisah, letakkan ponsel di atasnya;
> untuk rak atau braket, letakkan ponsel di tempat benda yang akan diratakan nantinya berada.

---

## 3. Membaca layar

| Elemen | Arti |
|--------|------|
| **Waterpas** (lingkaran) | Gelembung hanyut ke tepi **tinggi**. Terpusat pada cincin target = rata. Berubah **hijau** saat rata. |
| **Label besar** | `RATA`, atau tepi mana yang tinggi — `Tepi atas tinggi`, `Tepi bawah tinggi`, `Sisi kiri tinggi`, `Sisi kanan tinggi`. |
| **`miring / K·Ka / D·B`** | Derajat numerik: kemiringan total, kiri-kanan, depan-belakang. |

Jika tertulis **"Balik ponsel — layar harus menghadap ke atas"**, ponsel terbalik; sensor
butuh layar menghadap langit.

---

## 4. Kontrol

- **Vol** — kenyaringan nada. Ping lonceng mengikuti volume media yang sama, jadi jika Anda
  tidak mendengar ping, naikkan juga volume media ponsel.
- **Nada** — menggeser seluruh nada naik atau turun, hingga ±1 oktaf (ditampilkan dalam
  seminada, `-12 st` … `+12 st`; tengah = default). Tidak mengubah cara kerja perataan — hanya
  memindah nada ke rentang yang nyaman bagi telinga Anda atau menembus derau latar.
- **Pan stereo** (mati secara default) — saat aktif, nada bergeser ke earbud/speaker **kiri**
  atau **kanan** seiring ponsel miring, sehingga Anda mendengar arah selain jarak. Terbaik
  dengan headphone. Biarkan mati untuk nada mono biasa.

---

## 5. Tips

- **Headphone** membuat perubahan nada (dan pan stereo) jauh lebih mudah dinilai dengan telinga.
- **Penyetelan halus:** derajat terakhir adalah tempat nada naik paling cepat dan ping berbunyi —
  perlambat saat getaran menghilang.
- Layar **tetap menyala** selama aplikasi terbuka, agar tidak tidur di tengah penyetelan.
- **Kalibrasi:** LevelTone memercayai sensor gravitasi ponsel dan menganggap punggung ponsel
  datar. Ponsel dengan tonjolan kamera atau dalam casing bisa terbaca meleset sepersekian derajat —
  lepas casing untuk akurasi terbaik, atau catat selisihnya.

---

## 6. Pemecahan masalah

| Masalah | Solusi |
|---------|--------|
| Tidak ada nada sama sekali | Ketuk **Mulai nada**; naikkan **Vol** dan volume media ponsel; keluarkan dari senyap/JanganGanggu. |
| Tidak ada ping saat rata | Naikkan volume media; pastikan benar-benar mencapai rata (label `RATA`, gelembung hijau). |
| Pembacaan meloncat-loncat | Letakkan ponsel di permukaan kokoh; getaran/pegangan menambah derau. |
| Selalu "tidak rata" sehelai rambut | Lepas casing; sepersekian derajat terakhir bisa jadi kemiringan tonjolan kamera. |

---

## 7. Cara kerjanya (versi singkat)

Sensor gravitasi memberi arah "bawah". LevelTone menghitung sudut antara arah itu dan normal
layar ponsel — 0° berarti punggung benar-benar datar. Ia memetakan sudut itu ke nada sinus
sintetis (nada + laju getaran) dan membunyikan lonceng meredup pada transisi ke rata. Semua
audio dihasilkan di perangkat secara waktu nyata; tidak ada yang meninggalkan ponsel.

---

## 8. Dukungan

Aplikasi hobi, disediakan **apa adanya** — **tanpa dukungan** dan tanpa jaminan pembaruan.
Namun **laporan bug dan pull request diterima dengan senang hati**: buka [issue](../../issues)
atau [PR](../../pulls).
