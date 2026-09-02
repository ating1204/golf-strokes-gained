package com.golf.golf.strokes.gained.dto;

public record MapDto(String imageUrl, LatLng center, double bearingDeg,
    double metersPerPixel, int widthPx, int heightPx,
    String imagerySource) {

}
