package com.golf.golf.strokes.gained.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//this entity class is for the actual maps that'll be used in the frontend
@Entity
public class HoleMap {

    @Id
    private Long holeId;

    private String imagePath;
    private Double centerLat;
    private Double centerLng;
    private Double bearingDeg;

    @Column(name = "m_per_px")         
    private Double metersPerPixel;

    private Integer widthPx;
    private Integer heightPx;
    private String imagerySource;
    private LocalDate imageryDate;

    public HoleMap() {}

    public Long getHoleId() { 
        return holeId; 
    }

    public String getImagePath() { 
        return imagePath; 
    }

    public Double getCenterLat() { 
        return centerLat; 
    }

    public Double getCenterLng() { 
        return centerLng; 
    }

    public Double getBearingDeg() { 
        return bearingDeg; 
    }

    public Double getMetersPerPixel() { 
        return metersPerPixel; 
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