# Golf Strokes Gained

Local Spring Boot app that calculates strokes gained from PGA-style baseline tables in PostgreSQL, and logs shots to `user_shot`.

## Stack

- Java 25, Spring Boot 4.1, Spring Data JPA
- PostgreSQL
- Static HTML: `/calc.html` (sandbox), `/logger.html` (saves to DB), `/gps.html` (GPS logger)
- Flyway: `course` / `hole` / `hole_map`, Stanford seed as course id `1`

## Formula

SG = expected(start) − expected(end) − 1

- Full swing: `shot_data` by yards (tee / fairway / rough / sand)
- Putting: `putting_data` by feet
- Hole-out: end lie **green**, end distance **0** (expected strokes = 0)

Penalty strokes are stored on logged shots but are not in the SG formula yet.

## Run

1. Postgres running, database `strokes_gained` with `shot_data` and `putting_data` loaded.
2. Set user/password in `src/main/resources/application.properties`.
3. `./mvnw spring-boot:run`
4. Open http://localhost:8080/logger.html, http://localhost:8080/calc.html, or http://localhost:8080/gps.html

`ddl-auto` is `validate` — Hibernate will not create missing tables.

## API

| Method | Path | What |
|--------|------|------|
| GET | `/api/v1/shots/calculate` | SG only (query: startDist, startLie, endDist, endLie) |
| POST | `/api/v1/shots/log` | Calculate and save |
| GET | `/api/v1/shots` | All logged shots |
| DELETE | `/api/v1/shots/last` | Undo last shot |
| DELETE | `/api/v1/shots/{id}` | Delete one shot |
| GET | `/api/v1/courses/{courseId}/bundle` | Course + holes + map georefs (Stanford = `1`) |

Lies: `tee`, `fairway`, `rough`, `sand`, `green`. Distances: yards off the green, feet on the green.

## Course imagery

`tools/courseMapMaker.py` stitches ArcGIS World Imagery tiles into `tools/stanfordCourse.jpg` (~20 cm/px). That jpg is gitignored (large). Hole crops go in `src/main/resources/static/maps/` (also gitignored).

```bash
pip3 install Pillow
cd tools
python3 courseMapMaker.py
```

Needs network. Expect a dozen tiles at full res; bump `GROUND_MPP` (e.g. `2.0`) for a faster smoke test.