# LevelTone — Manual

🌐 Idiomas: [English](MANUAL.md) · [Nederlands](MANUAL.nl.md) · [Deutsch](MANUAL.de.md) · [Français](MANUAL.fr.md) · [Español](MANUAL.es.md) · **Português** · [Italiano](MANUAL.it.md) · [Polski](MANUAL.pl.md) · [Русский](MANUAL.ru.md) · [Українська](MANUAL.uk.md) · [Türkçe](MANUAL.tr.md) · [Svenska](MANUAL.sv.md) · [Dansk](MANUAL.da.md) · [Norsk](MANUAL.nb.md) · [Suomi](MANUAL.fi.md) · [Čeština](MANUAL.cs.md) · [Ελληνικά](MANUAL.el.md) · [Română](MANUAL.ro.md) · [Magyar](MANUAL.hu.md) · [日本語](MANUAL.ja.md) · [한국어](MANUAL.ko.md) · [简体中文](MANUAL.zh-cn.md) · [繁體中文](MANUAL.zh-tw.md) · [العربية](MANUAL.ar.md) · [עברית](MANUAL.he.md) · [हिन्दी](MANUAL.hi.md) · [ไทย](MANUAL.th.md) · [Tiếng Việt](MANUAL.vi.md) · [Bahasa Indonesia](MANUAL.id.md) · [فارسی](MANUAL.fa.md)

> ⚠️ 🌐 *Esta tradução é assistida por máquina e não foi revisada por um falante nativo. Viu um erro? Correções são bem-vindas — abra um [PR](../../pulls).*

O LevelTone transforma seu telefone num **nível que você pode ouvir**. Apoie-o sobre
qualquer superfície e ajuste até o tom dizer que está plana — sem precisar manter os olhos
numa bolha.

---

## 1. Instalar (sideload)

O LevelTone não está na Play Store — você instala por **sideload**:

1. Baixe **`LevelTone.apk`** da [versão mais recente](../../releases/latest).
2. Abra o arquivo baixado.
3. Se o Android avisar sobre instalar de fonte desconhecida, toque em **Configurações →
   Permitir desta fonte**, volte e confirme **Instalar**.
4. Abra o **LevelTone**.

**Grátis** e **sem anúncios** — sem custo, sem conta, sem propaganda, sem rede, sem
permissões além do sensor de movimento.

---

> 📹 Prefere assistir? Há uma [demo de 30 segundos](docs/LevelTone-demo-pt.mp4) no repositório.
> Ela é **muda** — a gravação de tela não capta o tom do app — então mostra só o visual;
> o som é no que você realmente vai se apoiar.

## 2. Nivelar algo

1. Deite o telefone **plano de costas, tela para cima**, sobre a superfície a nivelar.
2. Toque em **▶ Iniciar tom**.
3. Ajuste a superfície (ou o apoio do telefone). Escute:
   - **Tom grave, oscilação rápida** → muito fora de nível.
   - **Tom subindo, oscilação desacelerando** → chegando perto.
   - **Tom agudo e estável** → nivelado.
4. Ao cruzar para o nível você ouve um **"bip" de sino** — é a sua confirmação. Ele bipa
   de novo toda vez que você se reassenta no nível.
5. Toque em **⏹ Parar tom** ao terminar.

> O telefone mede a *própria* planeza. Para uma superfície separada, apoie o telefone sobre ela;
> para uma prateleira ou suporte, ponha o telefone onde ficará o objeto a nivelar.

---

## 3. Ler a tela

| Elemento | Significado |
|----------|-------------|
| **Nível de bolha** (círculo) | A bolha desliza para a borda **alta**. Centralizada no anel-alvo = nivelado. Fica **verde** ao nivelar. |
| **Rótulo grande** | `NIVELADO`, ou qual borda está alta — `Borda superior alta`, `Borda inferior alta`, `Lado esquerdo alto`, `Lado direito alto`. |
| **`inclin. / E·D / F·T`** | Graus numéricos: inclinação total, esquerda-direita, frente-trás. |

Se disser **"Vire o telefone — a tela deve ficar para cima"**, o telefone está de cabeça
para baixo; o sensor precisa da tela voltada para o céu.

---

## 4. Controles

- **Vol** — volume do tom. O bip de sino segue o mesmo volume de mídia, então se você não
  ouve o bip, aumente também o volume de mídia do telefone.
- **Altura** — transpõe todo o tom para cima ou para baixo, até ±1 oitava (mostrado em
  semitons, `-12 st` … `+12 st`; centro = padrão). Não muda como o nivelamento funciona —
  só move o tom para uma faixa confortável aos seus ouvidos ou que corta o ruído de fundo.
- **Panorama estéreo** (desligado por padrão) — quando ligado, o tom se desloca para o fone/
  alto-falante **esquerdo** ou **direito** conforme o telefone inclina, para você ouvir direção
  além de distância. Melhor com fones. Deixe desligado para um tom mono simples.

---

## 5. Dicas

- **Fones de ouvido** deixam as mudanças de altura (e o panorama estéreo) bem mais fáceis de julgar de ouvido.
- **Ajuste fino:** o último grau é onde a altura sobe mais rápido e o bip dispara —
  desacelere à medida que a oscilação some.
- A tela **fica acesa** enquanto o app está aberto, para não dormir no meio do ajuste.
- **Calibração:** o LevelTone confia no sensor de gravidade e assume que as costas do telefone
  são planas. Um telefone com saliência de câmera ou numa capa pode marcar uma fração de grau —
  tire a capa para melhor precisão, ou anote o desvio.

---

## 6. Solução de problemas

| Problema | Solução |
|----------|---------|
| Nenhum tom | Toque em **Iniciar tom**; aumente **Vol** e o volume de mídia; tire do silencioso/NPT. |
| Sem bip ao nivelar | Aumente o volume de mídia; garanta que realmente chega ao nível (rótulo mostra `NIVELADO`, bolha verde). |
| Leituras saltando | Ponha o telefone numa superfície firme; vibração/manuseio adiciona ruído. |
| Sempre "fora de nível" por um triz | Tire a capa; a última fração de grau pode ser inclinação da saliência da câmera. |

---

## 7. Como funciona (versão curta)

O sensor de gravidade dá a direção de "baixo". O LevelTone calcula o ângulo entre ela e a
normal à tela do telefone — 0° significa que as costas estão perfeitamente planas. Ele mapeia
esse ângulo para um tom senoidal sintetizado (altura + taxa de oscilação) e dispara um sino
que decai na transição para o nível. Todo o áudio é gerado no aparelho em tempo real; nada sai
do telefone.

---

## 8. Suporte

App de hobby, fornecido **no estado em que se encontra** — **sem suporte** e sem garantia de
atualizações. Mas **relatórios de bugs e pull requests são bem-vindos**: abra uma
[issue](../../issues) ou um [PR](../../pulls).
