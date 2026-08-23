package com.golf.golf.strokes.gained.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

@Table(name="putting_data")

public class PuttingBaseline {
    @Id //unique identifier of 
    @Column(name = "putt_dist", unique = true) //connects java var puttDist to col putt_dist in database
    private Integer puttDist;

    private Double strokes;

    public PuttingBaseline() {}

    public PuttingBaseline(Integer puttDist, Double strokes) {
        this.puttDist = puttDist;
        this.strokes = strokes;
    }

    public Integer getPuttDist() {
        return puttDist;
    }

    public Double getStrokes() {
        return strokes;
    }
}
