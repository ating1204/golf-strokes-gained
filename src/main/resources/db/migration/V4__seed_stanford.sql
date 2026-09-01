-- Seed data for Stanford Golf Course (Par 70)

INSERT INTO course (name, city, state)
VALUES ('Stanford Golf Course', 'Stanford', 'CA');

INSERT INTO hole (course_id, hole_number, par)
SELECT c.id, v.hole_number, v.par
FROM course c,
     (VALUES
        (1, 5), (2, 4), (3, 3), (4, 3), (5, 4), (6, 4), (7, 5), (8, 3), (9, 4),
        (10, 4), (11, 4), (12, 4), (13, 4), (14, 3), (15, 4), (16, 5), (17, 3), (18, 4)
     ) AS v(hole_number, par)
WHERE c.name = 'Stanford Golf Course';