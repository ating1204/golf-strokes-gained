package com.golf.golf.strokes.gained.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

@Table(name="shot_data")

public class ShotBaseline {
    @Id //unique identifier in database?
    @Column(name = "distance_yd", unique = true) //connects java var puttDist to col putt_dist in database
    private Integer shotDist;

    private Double tee;

    private Double fairway;

    private Double rough;

    private Double sand;


    //generate constructors, used to initialize objects
    //empty constructor allows spring boot to pull data out of postgre
    public ShotBaseline() {} 

    //creates tangible obj to store in computer's memory
    public ShotBaseline(Integer shotDist, Double tee, Double fairway, Double rough, Double sand) {
        this.shotDist = shotDist;
        this.tee = tee;
        this.fairway = fairway;
        this.rough = rough;
        this.sand = sand;
    }

    //sets up getters --> allows public methods to safely access private variables
    public Integer getShotDist() {
        return shotDist;
    }

    public Double getTee() {
        return tee;
    }

    public Double getFairway() {
        return fairway;
    }

    public Double getRough() {
        return rough;
    }

    public Double getSand() {
        return sand;
    }

    
}
