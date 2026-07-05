# LevelTone — Käyttöopas

🌐 Kielet: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · **Suomi** · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Tämä käännös on koneellinen eikä äidinkielisen puhujan tarkistama. Näitkö virheen? Korjaukset ovat tervetulleita — avaa [PR](../../pulls).*

LevelTone muuttaa puhelimesi **vesivaakaksi, jonka voit kuulla**. Aseta se mille tahansa
pinnalle ja säädä, kunnes ääni kertoo sen olevan tasainen — sinun ei tarvitse pitää katsetta kuplassa.

---

## 1. Asennus (sivulataus)

LevelTone ei ole Play Kaupassa — se **sivuladataan**:

1. Lataa **`LevelTone.apk`** [uusimmasta julkaisusta](../../releases/latest).
2. Avaa ladattu tiedosto.
3. Jos Android varoittaa asennuksesta tuntemattomasta lähteestä, napauta **Asetukset → Salli
   tästä lähteestä**, palaa takaisin ja vahvista **Asenna**.
4. Avaa **LevelTone**.

**Ilmainen** ja **mainokseton** — ei maksua, ei tiliä, ei mainoksia, ei verkkoa, ei
käyttöoikeuksia liikeanturia lukuun ottamatta.

---

> 📹 Katsotko mieluummin? Repossa on [30 sekunnin esittely](docs/LevelTone-demo-fi.mp4).
> Se on **mykkä** — näytön tallennus ei voi kaapata sovelluksen ääntä — joten se näyttää vain
> kuvan; ääni on se, mihin todella nojaat.

## 2. Jonkin vaaitseminen

1. Aseta puhelin **tasaisesti selälleen, näyttö ylöspäin**, vaaitettavalle pinnalle.
2. Napauta **▶ Aloita ääni**.
3. Säädä pintaa (tai puhelimen alustaa). Kuuntele:
   - **Matala korkeus, nopea värähtely** → kaukana vaa'asta.
   - **Korkeus nousee, värähtely hidastuu** → lähempänä.
   - **Korkea, vakaa ääni** → vaakasuorassa.
4. Kun ylität vaa'an, kuulet kellon **"piippauksen"** — se on vahvistuksesi. Se piippaa taas
   joka kerta, kun asetut uudelleen vaa'aan.
5. Napauta **⏹ Lopeta ääni**, kun olet valmis.

> Puhelin mittaa *omaa* tasaisuuttaan. Erillistä pintaa varten lepuuta puhelinta sen päällä;
> hyllyä tai kannaketta varten aseta puhelin sinne, mihin vaaitettava esine tulee.

---

## 3. Näytön lukeminen

| Elementti | Merkitys |
|-----------|----------|
| **Vesivaaka** (ympyrä) | Kupla ajautuu **korkeaa** reunaa kohti. Keskitettynä kohderenkaaseen = vaakasuorassa. Muuttuu **vihreäksi** vaa'assa. |
| **Iso nimike** | `VAAKA`, tai mikä reuna on ylhäällä — `Yläreuna ylhäällä`, `Alareuna ylhäällä`, `Vasen puoli ylhäällä`, `Oikea puoli ylhäällä`. |
| **`kallistus / V·O / E·T`** | Numeeriset asteet: kokonaiskallistus, vasen-oikea, edessä-takana. |

Jos näkyy **"Käännä puhelin — näytön on osoitettava ylös"**, puhelin on ylösalaisin;
anturi tarvitsee näytön kohti taivasta.

---

## 4. Säätimet

- **Ään.** — äänen voimakkuus. Kellon piippaus seuraa samaa mediaäänenvoimakkuutta, joten jos
  et kuule piippausta, nosta myös puhelimen mediaäänenvoimakkuutta.
- **Korkeus** — transponoi koko äänen ylös tai alas, jopa ±1 oktaavin verran (näytetään
  puolisävelinä, `-12 st` … `+12 st`; keskikohta = oletus). Ei muuta vaaituksen toimintaa —
  siirtää äänen vain korvillesi mukavalle alueelle tai taustamelun läpi leikkaavaksi.
- **Stereopanorointi** (oletuksena pois) — päällä ollessaan ääni siirtyy **vasempaan** tai
  **oikeaan** nappiin/kaiuttimeen puhelimen kallistuessa, joten kuulet suunnan etäisyyden
  lisäksi. Parasta kuulokkeilla. Jätä pois yksinkertaiselle monoäänelle.

---

## 5. Vinkkejä

- **Kuulokkeet** tekevät korkeuden muutosten (ja stereopanoroinnin) arvioinnista korvakuulolta paljon helpompaa.
- **Hienosäätö:** viimeinen aste on siellä, missä korkeus nousee nopeimmin ja piippaus laukeaa —
  hidasta, kun värähtely katoaa.
- Näyttö **pysyy hereillä**, kun sovellus on auki, jottei se nukahda kesken säädön.
- **Kalibrointi:** LevelTone luottaa puhelimen painovoima-anturiin ja olettaa puhelimen selän
  olevan tasainen. Kamerakohouman tai kotelon kanssa puhelin voi näyttää asteen murto-osan verran
  pielessä — poista kotelo parhaan tarkkuuden vuoksi tai merkitse poikkeama muistiin.

---

## 6. Vianmääritys

| Ongelma | Ratkaisu |
|---------|----------|
| Ei ääntä lainkaan | Napauta **Aloita ääni**; nosta **Ään.** ja puhelimen mediaäänenvoimakkuutta; ota pois äänettömästä/Älä häiritse. |
| Ei piippausta vaa'assa | Nosta mediaäänenvoimakkuutta; varmista, että se todella saavuttaa vaa'an (nimike `VAAKA`, kupla vihreä). |
| Lukemat hyppivät | Aseta puhelin tukevalle pinnalle; tärinä/käsittely lisää kohinaa. |
| Aina hiuksenhienosti "pois vaa'asta" | Poista kotelo; viimeinen asteen murto-osa voi olla kamerakohouman kallistus. |

---

## 7. Miten se toimii (lyhyt versio)

Painovoima-anturi antaa "alaspäin"-suunnan. LevelTone laskee kulman sen ja puhelimen
näyttönormaalin välillä — 0° tarkoittaa, että selkä on täysin tasainen. Se kuvaa tämän kulman
syntetisoiduksi siniääneksi (korkeus + värähtelynopeus) ja soittaa vaimenevan kellonsoiton
vaa'aan siirryttäessä. Kaikki ääni tuotetaan laitteella reaaliajassa; mikään ei poistu puhelimesta.

---

## 8. Tuki

Harrastussovellus, tarjotaan **sellaisenaan** — **ei tukea** eikä takuuta päivityksistä. Silti
**virheraportit ja pull-pyynnöt ovat tervetulleita**: avaa [issue](../../issues) tai
[PR](../../pulls).
