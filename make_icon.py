#!/usr/bin/env python3
"""Generate LevelTone launcher icons: a bubble-level target with a centered green
bubble on a dark disc. Renders legacy square + round mipmaps and an adaptive-icon
foreground layer for API 26+."""
import os
from PIL import Image, ImageDraw

RES = os.path.join(os.path.dirname(__file__), "app/src/main/res")

BG_OUTER = (0x1a, 0x16, 0x24)   # deep charcoal-purple
BG_INNER = (0x2a, 0x22, 0x3a)
RING = (0xD0, 0xBC, 0xFF)       # M3 purple accent
BUBBLE = (0x3D, 0xDC, 0x84)     # level green
GLASS = (0x12, 0x10, 0x16)

def radial_bg(sz):
    """Dark radial disc background."""
    img = Image.new("RGBA", (sz, sz), (0, 0, 0, 0))
    d = ImageDraw.Draw(img)
    c = sz / 2
    for i in range(int(c), 0, -1):
        t = i / c
        col = tuple(int(BG_INNER[k] + (BG_OUTER[k] - BG_INNER[k]) * (1 - t)) for k in range(3))
        d.ellipse([c - i, c - i, c + i, c + i], fill=col + (255,))
    return img

def draw_level(img, sz, art):
    """Draw the target rings + crosshair + bubble, art = fraction of size used."""
    d = ImageDraw.Draw(img)
    c = sz / 2
    R = sz * art / 2                       # outer ring radius
    lw = max(2, int(sz * 0.028))
    # glass well
    d.ellipse([c - R, c - R, c + R, c + R], fill=GLASS + (255,))
    d.ellipse([c - R, c - R, c + R, c + R], outline=RING + (255,), width=lw)
    # crosshair
    d.line([c - R, c, c + R, c], fill=RING + (180,), width=max(1, lw // 2))
    d.line([c, c - R, c, c + R], fill=RING + (180,), width=max(1, lw // 2))
    # centre target ring
    tr = R * 0.34
    d.ellipse([c - tr, c - tr, c + tr, c + tr], outline=BUBBLE + (255,), width=lw)
    # bubble (centred = level) with a soft highlight
    br = tr * 0.82
    d.ellipse([c - br, c - br, c + br, c + br], fill=BUBBLE + (255,))
    hl = br * 0.4
    d.ellipse([c - br * 0.35 - hl, c - br * 0.35 - hl,
               c - br * 0.35 + hl, c - br * 0.35 + hl], fill=(255, 255, 255, 90))

def rounded_mask(sz, rad):
    m = Image.new("L", (sz, sz), 0)
    ImageDraw.Draw(m).rounded_rectangle([0, 0, sz - 1, sz - 1], radius=rad, fill=255)
    return m

def circle_mask(sz):
    m = Image.new("L", (sz, sz), 0)
    ImageDraw.Draw(m).ellipse([0, 0, sz - 1, sz - 1], fill=255)
    return m

def make_legacy(sz, round_icon):
    base = Image.new("RGBA", (sz, sz), (0, 0, 0, 0))
    disc = radial_bg(sz)
    base.paste(disc, (0, 0), disc)
    draw_level(base, sz, 0.74)
    mask = circle_mask(sz) if round_icon else rounded_mask(sz, int(sz * 0.22))
    out = Image.new("RGBA", (sz, sz), (0, 0, 0, 0))
    out.paste(base, (0, 0), mask)
    return out

def make_foreground(sz):
    """Adaptive foreground: transparent, art kept inside the 66/108 safe zone."""
    img = Image.new("RGBA", (sz, sz), (0, 0, 0, 0))
    draw_level(img, sz, 0.60)   # safe-zone sized
    return img

DENS = {"mdpi": 1, "hdpi": 1.5, "xhdpi": 2, "xxhdpi": 3, "xxxhdpi": 4}

for dens, m in DENS.items():
    d = os.path.join(RES, f"mipmap-{dens}")
    os.makedirs(d, exist_ok=True)
    leg = int(48 * m)
    fg = int(108 * m)
    make_legacy(leg, False).save(os.path.join(d, "ic_launcher.png"))
    make_legacy(leg, True).save(os.path.join(d, "ic_launcher_round.png"))
    make_foreground(fg).save(os.path.join(d, "ic_launcher_foreground.png"))
    print(f"{dens}: legacy {leg}px, fg {fg}px")

# Play Store hi-res
make_legacy(512, False).save(os.path.join(os.path.dirname(__file__), "ic_launcher-web.png"))
print("web 512px")
