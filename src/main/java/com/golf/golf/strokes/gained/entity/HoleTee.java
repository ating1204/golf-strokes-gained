package com.golf.golf.strokes.gained.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* entity for locations of each tee in a course */

@Entity
public class HoleTee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long holeId;
    private String teeName;
    private Double lat;
    private Double lng;
    private Integer yards;

    public HoleTee() {}

    public Long getId() { return id; }
    public Long getHoleId() { return holeId; }
    public String getTeeName() { return teeName; }
    public Double getLat() { return lat; }
    public Double getLng() { return lng; }
    public Integer getYards() { return yards; }
}