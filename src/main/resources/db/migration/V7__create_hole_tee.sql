-- Tee boxes per hole. A hole has several, so this is its own table rather than
-- columns on hole. yards comes from the scorecard and is kept for cross-checking
-- against the coordinates.
CREATE TABLE hole_tee (
    id        bigserial PRIMARY KEY,
    hole_id   bigint NOT NULL REFERENCES hole(id) ON DELETE CASCADE,
    tee_name  text NOT NULL,              -- 'Cardinal', 'Black', 'White', 'Blue'
    lat       double precision NOT NULL,
    lng       double precision NOT NULL,
    yards     int,
    UNIQUE (hole_id, tee_name)
);
CREATE INDEX ON hole_tee (hole_id);