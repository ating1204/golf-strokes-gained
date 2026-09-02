-- hole_tee seed, produced by teelabel.html

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.421442, -122.183438, 520
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 1;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.421563, -122.183344, 505
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 1;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.421697, -122.183267, 488
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 1;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.42174, -122.183221, 480
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 1;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.425899, -122.184469, 478
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 2;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.426191, -122.184978, 418
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 2;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.426481, -122.185134, 382
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 2;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.426669, -122.185414, 348
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 2;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.428605, -122.18878, 214
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 3;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.428512, -122.18898, 192
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 3;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.428316, -122.189147, 164
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 3;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.428141, -122.189369, 134
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 3;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.426871, -122.190721, 167
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 4;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.426699, -122.190824, 143
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 4;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.426518, -122.190957, 120
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 4;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.426347, -122.191, 101
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 4;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.424929, -122.190902, 444
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 5;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.425057, -122.190711, 385
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 5;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.425332, -122.190435, 346
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 5;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.425376, -122.190357, 335
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 5;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.426699, -122.186849, 426
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 6;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.426481, -122.186734, 403
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 6;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.426352, -122.186713, 386
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 6;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.425895, -122.186358, 324
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 6;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.422909, -122.186411, 536
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 7;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.423154, -122.186584, 478
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 7;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.423364, -122.186786, 447
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 7;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.423495, -122.186916, 427
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 7;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.423924, -122.191596, 186
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 8;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.423912, -122.191153, 145
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 8;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.423901, -122.191017, 130
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 8;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.423922, -122.19087, 117
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 8;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.423671, -122.18925, 364
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 9;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.423614, -122.189147, 350
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 9;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.423542, -122.189021, 333
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 9;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.423482, -122.188928, 325
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 9;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.421912, -122.186776, 430
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 10;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.421745, -122.186515, 401
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 10;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.421524, -122.186476, 376
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 10;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.421248, -122.186279, 338
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 10;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.418451, -122.184542, 360
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 11;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.418501, -122.184602, 350
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 11;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.418563, -122.184663, 338
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 11;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.418612, -122.184706, 332
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 11;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.420911, -122.187042, 474
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 12;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.420938, -122.187426, 442
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 12;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.421131, -122.187452, 425
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 12;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.421373, -122.187523, 403
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 12;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.423914, -122.191597, 437
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 13;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.423652, -122.191477, 403
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 13;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.423511, -122.191388, 384
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 13;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.423293, -122.191194, 352
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 13;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.420445, -122.18919, 188
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 14;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.420467, -122.188905, 160
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 14;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.420479, -122.188659, 136
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 14;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.420205, -122.1884, 117
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 14;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.420053, -122.186759, 363
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 15;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.41992, -122.186835, 351
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 15;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.419785, -122.186933, 322
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 15;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.419657, -122.187053, 299
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 15;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.417849, -122.189515, 505
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 16;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.417826, -122.18936, 492
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 16;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.417628, -122.188883, 442
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 16;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.417629, -122.18879, 431
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 16;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.416917, -122.184764, 196
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 17;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.416856, -122.184542, 175
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 17;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.41683, -122.184387, 158
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 17;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.416799, -122.18422, 141
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 17;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Cardinal', 37.417227, -122.182661, 454
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 18;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Black', 37.417464, -122.182871, 420
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 18;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'White', 37.417649, -122.183033, 394
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 18;

INSERT INTO hole_tee (hole_id, tee_name, lat, lng, yards)
SELECT h.id, 'Blue', 37.417913, -122.18317, 359
FROM hole h JOIN course c ON c.id = h.course_id
WHERE c.name = 'Stanford Golf Course' AND h.hole_number = 18;

