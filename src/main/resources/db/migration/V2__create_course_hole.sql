
/* e.g. stanford golf course | Stanford | CA */
CREATE TABLE course (
    id    bigserial PRIMARY KEY,
    name  text NOT NULL,
    city  text NOT NULL,
    state text NOT NULL
);
/* stores holes across all courses */
CREATE TABLE hole (
    id          bigserial PRIMARY KEY,
    course_id   bigint NOT NULL REFERENCES course(id),
    hole_number int NOT NULL CHECK (hole_number BETWEEN 1 AND 18),
    par         int NOT NULL CHECK (par BETWEEN 3 AND 5),
    UNIQUE (course_id, hole_number)
);
