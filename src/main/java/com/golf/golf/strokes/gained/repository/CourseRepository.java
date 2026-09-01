package com.golf.golf.strokes.gained.repository;

import com.golf.golf.strokes.gained.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

//simply interacts with database (Course name/loc) in postgres and nothing else (postgres database access)
public interface CourseRepository extends JpaRepository<Course, Long> {
}