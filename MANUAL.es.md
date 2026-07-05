# LevelTone — Manual

🌐 Idiomas: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · **Español** · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Esta traducción es asistida por máquina y no ha sido revisada por un hablante nativo. ¿Ves un error? Las correcciones son bienvenidas — abre un [PR](../../pulls).*

LevelTone convierte tu teléfono en un **nivel que puedes oír**. Apóyalo sobre cualquier
superficie y ajústala hasta que el tono te diga que está plana — sin necesidad de mantener
la vista en una burbuja.

---

## 1. Instalar (sideload)

LevelTone no está en Play Store — se instala por **sideload**:

1. Descarga **`LevelTone.apk`** desde la [última versión](../../releases/latest).
2. Abre el archivo descargado.
3. Si Android advierte sobre instalar desde una fuente desconocida, toca **Ajustes →
   Permitir de esta fuente**, vuelve atrás y confirma **Instalar**.
4. Abre **LevelTone**.

**Gratis** y **sin anuncios** — sin coste, sin cuenta, sin publicidad, sin red, sin
permisos aparte del sensor de movimiento.

---

> 📹 ¿Prefieres verlo? Hay una [demo de 30 segundos](docs/LevelTone-demo-es.mp4) en el repo.
> Es **muda** — la grabación de pantalla no capta el tono de la app — así que solo muestra
> lo visual; el sonido es en lo que realmente te apoyarás.

## 2. Nivelar algo

1. Apoya el teléfono **plano sobre su parte trasera, pantalla hacia arriba**, en la superficie a nivelar.
2. Toca **▶ Iniciar tono**.
3. Ajusta la superficie (o el apoyo del teléfono). Escucha:
   - **Tono grave, oscilación rápida** → muy fuera de nivel.
   - **Tono que sube, oscilación que se ralentiza** → más cerca.
   - **Tono agudo y estable** → nivelado.
4. Al cruzar a nivel oirás un **«bip» de campana** — esa es tu confirmación. Vuelve a
   sonar cada vez que te reasientas en el nivel.
5. Toca **⏹ Detener tono** al terminar.

> El teléfono mide su *propia* planitud. Para una superficie aparte, apoya el teléfono encima;
> para un estante o soporte, coloca el teléfono donde irá el objeto a nivelar.

---

## 3. Leer la pantalla

| Elemento | Significado |
|----------|-------------|
| **Nivel de burbuja** (círculo) | La burbuja deriva hacia el borde **alto**. Centrada en el anillo objetivo = nivelado. Se pone **verde** al nivelar. |
| **Etiqueta grande** | `NIVELADO`, o qué borde está alto — `Borde superior alto`, `Borde inferior alto`, `Lado izquierdo alto`, `Lado derecho alto`. |
| **`inclin. / I·D / A·A`** | Grados numéricos: inclinación total, izquierda-derecha, adelante-atrás. |

Si dice **«Voltea el teléfono — la pantalla debe mirar hacia arriba»**, el teléfono está
boca abajo; el sensor necesita la pantalla mirando al cielo.

---

## 4. Controles

- **Vol** — volumen del tono. El bip de campana sigue el mismo volumen multimedia, así que si
  no oyes el bip, sube también el volumen multimedia del teléfono.
- **Altura** — transpone todo el tono hacia arriba o abajo, hasta ±1 octava (mostrado en
  semitonos, `-12 st` … `+12 st`; centro = por defecto). No cambia cómo funciona la nivelación
  — solo lleva el tono a un rango cómodo para tus oídos o que atraviese el ruido de fondo.
- **Panorama estéreo** (desactivado por defecto) — cuando está activo, el tono se desplaza al
  auricular/altavoz **izquierdo** o **derecho** al inclinar el teléfono a izquierda/derecha,
  para oír dirección además de distancia. Mejor con auriculares. Déjalo apagado para mono simple.

---

## 5. Consejos

- **Los auriculares** hacen mucho más fácil juzgar de oído los cambios de altura (y el panorama estéreo).
- **Ajuste fino:** el último grado es donde la altura sube más rápido y suena el bip —
  desacelera a medida que la oscilación desaparece.
- La pantalla **permanece encendida** mientras la app está abierta, para que no se duerma a mitad del ajuste.
- **Calibración:** LevelTone confía en el sensor de gravedad y asume que la parte trasera del
  teléfono es plana. Un teléfono con protuberancia de cámara o con funda puede marcar una
  fracción de grado — quita la funda para máxima precisión, o anota el desfase.

---

## 6. Solución de problemas

| Problema | Solución |
|----------|----------|
| Ningún tono | Toca **Iniciar tono**; sube **Vol** y el volumen multimedia; quítalo de silencio/NPM. |
| Sin bip al nivelar | Sube el volumen multimedia; asegúrate de que llega a nivel (la etiqueta muestra `NIVELADO`, burbuja verde). |
| Las lecturas saltan | Pon el teléfono sobre una superficie sólida; la vibración/manipulación añade ruido. |
| Siempre «fuera de nivel» por un pelo | Quita la funda; la última fracción de grado puede ser inclinación de la protuberancia de la cámara. |

---

## 7. Cómo funciona (versión corta)

El sensor de gravedad da la dirección de «abajo». LevelTone calcula el ángulo entre esa
dirección y la normal a la pantalla del teléfono — 0° significa que la trasera está
perfectamente plana. Mapea ese ángulo a un tono sinusoidal sintetizado (altura + velocidad de
oscilación) y dispara un repique de campana que decae al pasar a nivel. Todo el audio se genera
en el dispositivo en tiempo real; nada sale del teléfono.

---

## 8. Soporte

App de aficionado, provista **tal cual** — **sin soporte** ni garantía de actualizaciones.
Pero **los informes de errores y pull requests son bienvenidos**: abre una
[incidencia](../../issues) o un [PR](../../pulls).
