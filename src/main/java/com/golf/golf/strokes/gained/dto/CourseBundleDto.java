package com.golf.golf.strokes.gained.dto;

import java.util.List;

// everything the phone needs for a round, downloaded in one request
public record CourseBundleDto(long courseId, String name, String city, String state, List<HoleDto> holes) {

}