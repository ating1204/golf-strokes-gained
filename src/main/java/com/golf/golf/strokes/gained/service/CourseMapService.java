package com.golf.golf.strokes.gained.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.golf.golf.strokes.gained.dto.CourseBundleDto;
import com.golf.golf.strokes.gained.dto.HoleDto;
import com.golf.golf.strokes.gained.dto.LatLng;
import com.golf.golf.strokes.gained.dto.MapDto;
import com.golf.golf.strokes.gained.dto.TeeDto;
import com.golf.golf.strokes.gained.entity.Course;
import com.golf.golf.strokes.gained.entity.Hole;
import com.golf.golf.strokes.gained.entity.HoleMap;
import com.golf.golf.strokes.gained.entity.HoleTee;
import com.golf.golf.strokes.gained.repository.CourseRepository;
import com.golf.golf.strokes.gained.repository.HoleMapRepository;
import com.golf.golf.strokes.gained.repository.HoleRepository;
import com.golf.golf.strokes.gained.repository.HoleTeeRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseMapService {

    private final CourseRepository courseRepo;
    private final HoleRepository holeRepo;
    private final HoleMapRepository holeMapRepo;
    private final HoleTeeRepository holeTeeRepo;

    public CourseMapService(CourseRepository courseRepo, HoleRepository holeRepo,
                            HoleMapRepository holeMapRepo, HoleTeeRepository holeTeeRepo) {
        this.courseRepo = courseRepo;
        this.holeRepo = holeRepo;
        this.holeMapRepo = holeMapRepo;
        this.holeTeeRepo = holeTeeRepo;
    }
    // returns json file w/ hole detaisl & all info for every hole
    public CourseBundleDto getCourseBundle(Long courseId) {
        Course course = courseRepo.findById(courseId)
            .orElseThrow(() -> new IllegalArgumentException("No course with id " + courseId));

        List<Hole> holes = holeRepo.findByCourseIdOrderByHoleNumberAsc(courseId);

        List<Long> holeIds = holes.stream().map(Hole::getId).toList();
        Map<Long, HoleMap> mapsByHoleId = holeMapRepo.findByHoleIdIn(holeIds).stream()
            .collect(Collectors.toMap(HoleMap::getHoleId, Function.identity()));

        List<HoleTee> allTees = holeTeeRepo.findByHoleIdIn(holeIds);
        Map<Long, List<TeeDto>> teesByHoleId = allTees.stream()
            .collect(Collectors.groupingBy(
                HoleTee::getHoleId,
                Collectors.mapping(t -> new TeeDto(t.getTeeName(),
                        new LatLng(t.getLat(), t.getLng()), t.getYards()),
                    Collectors.toList())));

        List<HoleDto> holeDtos = holes.stream()
            .map(h -> new HoleDto(h.getHoleNumber(), h.getPar(),
                                  toMapDto(mapsByHoleId.get(h.getId())),
                                  teesByHoleId.getOrDefault(h.getId(), List.of())))
            .toList();

        return new CourseBundleDto(
            course.getId(),
            course.getName(),
            course.getCity(),
            course.getState(),
            holeDtos
        );
    }

    //turns hole map DB to a JSON 
    private MapDto toMapDto(HoleMap m) {
        if (m == null) {
            return null;
        }
        return new MapDto(
            m.getImagePath(),
            new LatLng(m.getCenterLat(), m.getCenterLng()),
            m.getBearingDeg(),
            m.getMetersPerPixel(),
            m.getWidthPx(),
            m.getHeightPx(),
            m.getImagerySource()
        );
    }

}