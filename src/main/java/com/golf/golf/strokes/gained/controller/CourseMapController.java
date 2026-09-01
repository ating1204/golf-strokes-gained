package com.golf.golf.strokes.gained.controller;

import java.util.concurrent.TimeUnit;

import com.golf.golf.strokes.gained.dto.CourseBundleDto;
import com.golf.golf.strokes.gained.service.CourseMapService;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseMapController {

    private final CourseMapService courseMapService;

    public CourseMapController(CourseMapService courseMapService) {
        this.courseMapService = courseMapService;
    }

    // one call per round: all holes + image georeferences, cacheable for a day
    @GetMapping("/{courseId}/bundle")
    public ResponseEntity<CourseBundleDto> getCourseBundle(@PathVariable Long courseId) {
        CourseBundleDto bundle = courseMapService.getCourseBundle(courseId);
        return ResponseEntity.ok()
            .cacheControl(CacheControl.maxAge(1, TimeUnit.DAYS).cachePublic())
            .body(bundle);
    }
}