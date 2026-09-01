package com.golf.golf.strokes.gained.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//this entity class is for the actual maps that'll be used in the frontend
@Entity
public class HoleMap {

    @Id
    private Long holeId;        // PK and FK to hole — one map row per hole

    private String imagePath;   // e.g. /maps/stanford/hole01.png
    private Double nwLat;       // real-world coords of the image's top-left corner
    private Double nwLng;
    private Double seLat;       // bottom-right corner
    private Double seLng;
    private Integer widthPx;
    private Integer heightPx;
    private String imagerySource;
    private LocalDate imageryDate;

    public HoleMap() {
    }

    public Long getHoleId() {
        return holeId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Double getNwLat() {
        return nwLat;
    }

    public Double getNwLng() {
        return nwLng;
    }

    public Double getSeLat() {
        return seLat;
    }

    public Double getSeLng() {
        return seLng;
    }

    public Integer getWidthPx() {
        return widthPx;
    }

    public Integer getHeightPx() {
        return heightPx;
    }

    public String getImagerySource() {
        return imagerySource;
    }

    public LocalDate getImageryDate() {
        return imageryDate;
    }
}