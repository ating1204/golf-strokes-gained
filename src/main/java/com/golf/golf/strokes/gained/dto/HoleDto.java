package com.golf.golf.strokes.gained.dto;
import java.util.List;

public record HoleDto(int holeNumber, int par, MapDto map, List<TeeDto> tees) {
    
}