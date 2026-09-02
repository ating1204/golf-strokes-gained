import math, os, time, io, urllib.request
from PIL import Image

# NE and SW corner of stanford golf course + buffer
LA0, LA1 = 37.41240, 37.43240          # south, north
LO0, LO1 = -122.19615, -122.17815      # west,  east
GROUND_MPP = 0.20                     
MAX_TILE   = 2048                      # pixel limit for ArcGIS 
OUT        = "stanfordCourse.jpg" # not included in git
URL = ("https://services.arcgisonline.com/ArcGIS/rest/services/World_Imagery"
       "/MapServer/export?bbox={},{},{},{}&bboxSR=3857&imageSR=3857"
       "&size={},{}&format=jpg&f=image")

# Web Mercator — turns GPS coords into Web Mercator meters
R = 6378137 #earths radius in meters lol
def merc(lat, lng):
    return (R*math.radians(lng), R*math.log(math.tan(math.pi/4 + math.radians(lat)/2)))
def unmerc(x, y):
    return (math.degrees(2*math.atan(math.exp(y/R)) - math.pi/2), math.degrees(x/R))

x0, y0 = merc(LA0, LO0)
x1, y1 = merc(LA1, LO1)

# converts desired course to a pixel canvas (20cm / px) --> computes how to slice canvas into 2048 px files
merc_mpp = GROUND_MPP / math.cos(math.radians((LA0+LA1)/2))
W = round((x1-x0)/merc_mpp)
H = round((y1-y0)/merc_mpp)
cols = -(-W // MAX_TILE)
rows = -(-H // MAX_TILE)
ex = [round(i*W/cols) for i in range(cols+1)]     
ey = [round(j*H/rows) for j in range(rows+1)]
print(f"master {W}x{H} px ({W*H/1e6:.0f} MP) from {cols}x{rows}={cols*rows} tiles")

courseMap = Image.new("RGB", (W, H))
for j in range(rows):
    for i in range(cols):
        tw, th = ex[i+1]-ex[i], ey[j+1]-ey[j]
        bx0 = x0 + ex[i]*merc_mpp;  bx1 = x0 + ex[i+1]*merc_mpp
        by1 = y1 - ey[j]*merc_mpp;  by0 = y1 - ey[j+1]*merc_mpp
        url = URL.format(bx0, by0, bx1, by1, tw, th)
        for attempt in range(4):
            try:
                with urllib.request.urlopen(url, timeout=120) as r:
                    tile = Image.open(io.BytesIO(r.read())).convert("RGB")
                if tile.size != (tw, th):
                    tile = tile.resize((tw, th))
                courseMap.paste(tile, (ex[i], ey[j]))
                print(f"  tile {j*cols+i+1}/{cols*rows} ok", flush=True)
                break
            except Exception as e:
                print(f"  tile {j*cols+i+1} attempt {attempt+1} failed: {e}", flush=True)
                time.sleep(3)
        else:
            raise SystemExit("cannot retrieve tile")

courseMap.save(OUT, quality=92)
nw = unmerc(x0, y1); se = unmerc(x1, y0)
print(f"\nsaved {OUT} ({os.path.getsize(OUT)/1e6:.1f} MB)")
print(f"MASTER_NW = {nw[0]:.7f}, {nw[1]:.7f}")
print(f"MASTER_SE = {se[0]:.7f}, {se[1]:.7f}")
print(f"MASTER_PX = {W} x {H}")