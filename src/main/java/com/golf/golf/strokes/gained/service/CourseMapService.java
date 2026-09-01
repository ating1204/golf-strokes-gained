package com.golf.golf.strokes.gained.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.golf.golf.strokes.gained.dto.CourseBundleDto;
import com.golf.golf.strokes.gained.dto.HoleDto;
import com.golf.golf.strokes.gained.dto.LatLng;
import com.golf.golf.strokes.gained.dto.MapDto;
import com.golf.golf.strokes.gained.entity.Course;
import com.golf.golf.strokes.gained.entity.Hole;
import com.golf.golf.strokes.gained.entity.HoleMap;
import com.golf.golf.strokes.gained.repository.CourseRepository;
import com.golf.golf.strokes.gained.repository.HoleMapRepository;
import com.golf.golf.strokes.gained.repository.HoleRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseMapService {

    private final CourseRepository courseRepo;
    private final HoleRepository holeRepo;
    private final HoleMapRepository holeMapRepo;

    public CourseMapService(CourseRepository courseRepo, HoleRepository holeRepo,
                            HoleMapRepository holeMapRepo) {
        this.courseRepo = courseRepo;
        this.holeRepo = holeRepo;
        this.holeMapRepo = holeMapRepo;
    }
    // returns json file w/ hole detaisl & all info for every hole
    public CourseBundleDto getCourseBundle(Long courseId) {
        Course course = courseRepo.findById(courseId)
            .orElseThrow(() -> new IllegalArgumentException("No course with id " + courseId));

        List<Hole> holes = holeRepo.findByCourseIdOrderByHoleNumberAsc(courseId);

        List<Long> holeIds = holes.stream().map(Hole::getId).toList();
        Map<Long, HoleMap> mapsByHoleId = holeMapRepo.findByHoleIdIn(holeIds).stream()
            .collect(Collectors.toMap(HoleMap::getHoleId, Function.identity()));

        List<HoleDto> holeDtos = holes.stream()
            .map(h -> new HoleDto(h.getHoleNumber(), h.getPar(), toMapDto(mapsByHoleId.get(h.getId()))))
            .toList();

        return new CourseBundleDto(
            course.getId(),
            course.getName(),
            course.getCity(),
            course.getState(),
            holeDtos
        );
    }

    // for when theres no map for some hole
    private MapDto toMapDto(HoleMap m) {
        if (m == null) {
            return null;
        }
        return new MapDto(
            m.getImagePath(),
            new LatLng(m.getNwLat(), m.getNwLng()),
            new LatLng(m.getSeLat(), m.getSeLng()),
            m.getWidthPx(),
            m.getHeightPx(),
            m.getImagerySource()
        );
    }
}