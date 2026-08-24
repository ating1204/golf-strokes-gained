# Golf Strokes Gained

Local Spring Boot app that calculates strokes gained from PGA-style baseline tables in PostgreSQL, and logs shots to `user_shot`.

## Stack

- Java 25, Spring Boot 4.1, Spring Data JPA
- PostgreSQL
- Static HTML: `/calc.html` (sandbox) and `/logger.html` (saves to DB)

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
4. Open http://localhost:8080/logger.html or http://localhost:8080/calc.html

`ddl-auto` is `validate` — Hibernate will not create missing tables.

## API

| Method | Path | What |
|--------|------|------|
| GET | `/api/v1/shots/calculate` | SG only (query: startDist, startLie, endDist, endLie) |
| POST | `/api/v1/shots/log` | Calculate and save |
| GET | `/api/v1/shots` | All logged shots |
| DELETE | `/api/v1/shots/last` | Undo last shot |
| DELETE | `/api/v1/shots/{id}` | Delete one shot |

Lies: `tee`, `fairway`, `rough`, `sand`, `green`. Distances: yards off the green, feet on the green.