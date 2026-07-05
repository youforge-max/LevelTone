# LevelTone — Kılavuz

🌐 Diller: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · **Türkçe** · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Bu çeviri makine desteklidir ve ana dili konuşan biri tarafından gözden geçirilmemiştir. Hata mı gördün? Düzeltmeler memnuniyetle karşılanır — bir [PR](../../pulls) aç.*

LevelTone telefonunu **duyabileceğin bir su terazisine** dönüştürür. Herhangi bir yüzeye
koy ve ton sana düz olduğunu söyleyene kadar ayarla — gözünü bir kabarcıkta tutmana gerek yok.

---

## 1. Kurulum (sideload)

LevelTone Play Store'da değil — **sideload** ile kurarsın:

1. **`LevelTone.apk`**'yı [en son sürümden](../../releases/latest) indir.
2. İndirilen dosyayı aç.
3. Android bilinmeyen kaynaktan kurulum konusunda uyarırsa **Ayarlar → Bu kaynağa izin ver**'e
   dokun, geri dön ve **Yükle**'yi onayla.
4. **LevelTone**'u aç.

**Ücretsiz** ve **reklamsız** — ücret yok, hesap yok, reklam yok, ağ yok, hareket sensörü
dışında izin yok.

---

> 📹 İzlemeyi mi tercih edersin? Depoda [30 saniyelik bir tanıtım](docs/LevelTone-demo-tr.mp4) var.
> **Sessizdir** — ekran kaydı uygulamanın tonunu yakalayamaz — bu yüzden yalnızca görüntüyü
> gösterir; asıl güveneceğin şey sestir.

## 2. Bir şeyi tesviye etmek

1. Telefonu **sırtı üstü düz, ekran yukarı bakacak şekilde** tesviye edeceğin yüzeye koy.
2. **▶ Tonu başlat**'a dokun.
3. Yüzeyi (veya telefonun oturuşunu) ayarla. Dinle:
   - **Alçak perde, hızlı titreşim** → tesviyeden çok uzak.
   - **Perde yükseliyor, titreşim yavaşlıyor** → yaklaşıyorsun.
   - **Yüksek, kararlı ton** → düz.
4. Tesviyeye geçtiğinde bir çan **"bip"**'i duyarsın — bu senin onayın. Her yeniden tesviyeye
   oturduğunda tekrar biper.
5. İşin bitince **⏹ Tonu durdur**'a dokun.

> Telefon *kendi* düzlüğünü ölçer. Ayrı bir yüzey için telefonu üzerine koy;
> bir raf veya braket için telefonu, tesviye edilecek nesnenin geleceği yere yerleştir.

---

## 3. Ekranı okumak

| Öğe | Anlamı |
|-----|--------|
| **Su terazisi** (daire) | Kabarcık **yüksek** kenara kayar. Hedef halkasında ortalanmış = düz. Düz olunca **yeşile** döner. |
| **Büyük etiket** | `DÜZ`, ya da hangi kenarın yüksek olduğu — `Üst kenar yüksek`, `Alt kenar yüksek`, `Sol taraf yüksek`, `Sağ taraf yüksek`. |
| **`eğim / S·S / Ö·A`** | Sayısal derece: toplam eğim, sol-sağ, ön-arka. |

Eğer **"Telefonu çevir — ekran yukarı bakmalı"** derse, telefon ters duruyordur; sensörün
ekranın gökyüzüne bakmasına ihtiyacı var.

---

## 4. Kontroller

- **Ses** — ton yüksekliği. Çan bipi aynı medya sesini takip eder, yani bipi duyamıyorsan
  telefonun medya sesini de yükselt.
- **Perde** — tüm tonu yukarı veya aşağı, ±1 oktava kadar aktarır (yarım tonlarda gösterilir,
  `-12 st` … `+12 st`; orta = varsayılan). Tesviyenin nasıl çalıştığını değiştirmez — tonu
  yalnızca kulaklarına rahat gelen veya arka plan gürültüsünü delen bir aralığa taşır.
- **Stereo pan** (varsayılan kapalı) — açıkken, telefon sola/sağa eğildikçe ton **sol** veya
  **sağ** kulaklık/hoparlöre kayar, böylece mesafenin yanı sıra yönü de duyarsın. En iyisi
  kulaklıkla. Düz mono ton için kapalı bırak.

---

## 5. İpuçları

- **Kulaklık**, perde değişimlerini (ve stereo pan'ı) kulaktan değerlendirmeyi çok kolaylaştırır.
- **İnce ayar:** son derece, perdenin en hızlı tırmandığı ve bipin çaldığı yerdir — titreşim
  kaybolurken yavaşla.
- Uygulama açıkken ekran **uyanık kalır**, böylece ayar ortasında uyumaz.
- **Kalibrasyon:** LevelTone telefonun yerçekimi sensörüne güvenir ve telefonun sırtının düz
  olduğunu varsayar. Kamera çıkıntılı veya kılıflı bir telefon derecenin bir kesirini şaşabilir
  — en iyi doğruluk için kılıfı çıkar veya sapmayı not al.

---

## 6. Sorun giderme

| Sorun | Çözüm |
|-------|-------|
| Hiç ton yok | **Tonu başlat**'a dokun; **Ses**'i ve telefonun medya sesini yükselt; sessiz/Rahatsız Etme'den çıkar. |
| Tesviyede bip yok | Medya sesini yükselt; gerçekten tesviyeye ulaştığından emin ol (etiket `DÜZ`, kabarcık yeşil). |
| Okumalar zıplıyor | Telefonu sağlam bir yüzeye koy; titreşim/dokunma gürültü ekler. |
| Hep kıl payı "düz değil" | Kılıfı çıkar; son derece kesri kamera çıkıntısı eğimi olabilir. |

---

## 7. Nasıl çalışır (kısa sürüm)

Yerçekimi sensörü "aşağı" yönünü verir. LevelTone bununla telefonun ekran normali arasındaki
açıyı hesaplar — 0° sırtın kusursuz düz olduğu anlamına gelir. Bu açıyı sentezlenmiş bir sinüs
tonuna (perde + titreşim hızı) eşler ve tesviyeye geçişte sönümlenen bir çan sesi çalar. Tüm
ses cihazda gerçek zamanlı üretilir; hiçbir şey telefondan çıkmaz.

---

## 8. Destek

Hobi uygulaması, **olduğu gibi** sunulur — **destek yok** ve güncelleme garantisi yok. Yine de
**hata bildirimleri ve pull request'ler memnuniyetle karşılanır**: bir [issue](../../issues)
veya [PR](../../pulls) aç.
