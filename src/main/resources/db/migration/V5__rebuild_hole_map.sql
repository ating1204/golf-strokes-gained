/* changing hole map param to be center + bearing, required  */

DROP TABLE hole_map;

CREATE TABLE hole_map (
    hole_id        bigint PRIMARY KEY REFERENCES hole(id) ON DELETE CASCADE,
    image_path     text NOT NULL,
    center_lat     double precision NOT NULL,   -- geographic center of image
    center_lng     double precision NOT NULL,
    bearing_deg    double precision NOT NULL,   -- tee -> green, clockwise from N
    m_per_px       double precision NOT NULL,   -- ground meters/px
    width_px       int NOT NULL,
    height_px      int NOT NULL,
    imagery_source text NOT NULL,
    imagery_date   date
);
