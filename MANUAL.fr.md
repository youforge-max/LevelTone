# LevelTone — Manuel

🌐 Langues: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · **Français** · [Español](MANUAL.es.md) · [Português](MANUAL.pt.md) · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Cette traduction est générée par machine et non relue par un locuteur natif. Une erreur ? Les corrections sont les bienvenues — ouvrez une [PR](../../pulls).*

LevelTone transforme votre téléphone en un **niveau que vous pouvez entendre**. Posez-le sur
n'importe quelle surface et ajustez jusqu'à ce que le son vous dise qu'elle est plane — pas
besoin de garder les yeux sur une bulle.

---

## 1. Installer (chargement latéral)

LevelTone n'est pas sur le Play Store — vous **chargez latéralement** l'APK :

1. Téléchargez **`LevelTone.apk`** depuis la [dernière version](../../releases/latest).
2. Ouvrez le fichier téléchargé.
3. Si Android avertit d'une installation depuis une source inconnue, appuyez sur
   **Paramètres → Autoriser cette source**, puis revenez et confirmez **Installer**.
4. Ouvrez **LevelTone**.

**Gratuit** et **sans publicité** — sans coût, sans compte, sans pub, sans réseau, aucune
autorisation en dehors du capteur de mouvement.

---

> 📹 Vous préférez regarder ? Il y a une [démo de 30 secondes](docs/LevelTone-demo-fr.mp4) dans le dépôt.
> Elle est **muette** — l'enregistrement d'écran ne peut pas capter le son de l'application —
> elle ne montre donc que les visuels ; le son est ce sur quoi vous vous appuierez réellement.

## 2. Mettre quelque chose de niveau

1. Posez le téléphone **à plat sur le dos, écran vers le haut**, sur la surface à mettre de niveau.
2. Appuyez sur **▶ Démarrer le son**.
3. Ajustez la surface (ou l'assise du téléphone). Écoutez :
   - **Hauteur basse, oscillation rapide** → loin du niveau.
   - **Hauteur qui monte, oscillation qui ralentit** → plus proche.
   - **Son aigu et stable** → de niveau.
4. Quand vous passez au niveau, vous entendez un **« bip » de cloche** — c'est votre
   confirmation. Il bipe à nouveau chaque fois que vous vous re-stabilisez au niveau.
5. Appuyez sur **⏹ Arrêter le son** quand vous avez terminé.

> Le téléphone mesure sa *propre* planéité. Pour une surface distincte, posez le téléphone
> dessus ; pour une étagère ou un support, placez le téléphone là où ira l'objet à mettre de niveau.

---

## 3. Lire l'écran

| Élément | Signification |
|---------|---------------|
| **Niveau à bulle** (cercle) | La bulle dérive vers le bord **haut**. Centrée sur l'anneau cible = de niveau. Devient **verte** au niveau. |
| **Grande étiquette** | `DE NIVEAU`, ou quel bord est haut — `Bord supérieur haut`, `Bord inférieur haut`, `Côté gauche haut`, `Côté droit haut`. |
| **`inclin. / G·D / A·A`** | Degrés numériques : inclinaison totale, gauche-droite, avant-arrière. |

S'il affiche **« Retournez le téléphone — écran vers le haut »**, le téléphone est à l'envers ;
le capteur a besoin de l'écran tourné vers le ciel.

---

## 4. Commandes

- **Vol** — volume du son. Le bip de cloche suit le même volume multimédia, donc si vous
  n'entendez pas le bip, montez aussi le volume multimédia du téléphone.
- **Hauteur** — transpose tout le son vers le haut ou le bas, jusqu'à ±1 octave (affiché en
  demi-tons, `-12 dt` … `+12 dt` ; centre = par défaut). Ne change rien au fonctionnement de la
  mise à niveau — déplace seulement le son vers une plage confortable pour vos oreilles ou qui
  perce le bruit de fond.
- **Panoramique stéréo** (désactivé par défaut) — quand il est activé, le son se déplace vers
  l'écouteur/haut-parleur **gauche** ou **droit** à mesure que le téléphone penche à
  gauche/droite, de sorte que vous entendez la direction en plus de la distance. Idéal au
  casque. Laissez désactivé pour un simple son mono.

---

## 5. Astuces

- **Un casque** rend les variations de hauteur (et le panoramique stéréo) bien plus faciles à
  juger à l'oreille.
- **Réglage fin :** le dernier degré est là où la hauteur monte le plus vite et où le bip se
  déclenche — ralentissez à mesure que l'oscillation disparaît.
- L'écran **reste allumé** tant que l'application est ouverte, pour qu'il ne s'endorme pas en
  plein réglage.
- **Étalonnage :** LevelTone fait confiance au capteur de gravité du téléphone et suppose que le
  dos du téléphone est plat. Un téléphone avec une bosse d'appareil photo ou dans une coque peut
  indiquer une fraction de degré d'écart — retirez la coque pour une meilleure précision, ou
  notez le décalage.

---

## 6. Dépannage

| Problème | Solution |
|----------|----------|
| Aucun son | Appuyez sur **Démarrer le son** ; montez **Vol** et le volume multimédia du téléphone ; sortez-le du mode silencieux/NPD. |
| Pas de bip au niveau | Montez le volume multimédia ; assurez-vous qu'il atteint vraiment le niveau (l'étiquette affiche `DE NIVEAU`, bulle verte). |
| Les mesures sautent | Posez le téléphone sur une surface solide ; les vibrations/manipulations ajoutent du bruit. |
| Toujours « hors niveau » d'un cheveu | Retirez la coque ; la dernière fraction de degré peut être une inclinaison due à la bosse de l'appareil photo. |

---

## 7. Comment ça marche (version courte)

Le capteur de gravité donne la direction du « bas ». LevelTone calcule l'angle entre celle-ci
et la normale à l'écran du téléphone — 0° signifie que le dos est parfaitement plat. Il fait
correspondre cet angle à un son sinusoïdal synthétisé (hauteur + fréquence d'oscillation) et
déclenche un carillon de cloche déclinant lors du passage au niveau. Tout l'audio est généré
sur l'appareil en temps réel ; rien ne quitte le téléphone.

---

## 8. Assistance

Application de loisir, fournie **telle quelle** — **sans assistance** ni garantie de mises à
jour. Mais **les rapports de bugs et les pull requests sont les bienvenus** : ouvrez une
[issue](../../issues) ou une [PR](../../pulls).
