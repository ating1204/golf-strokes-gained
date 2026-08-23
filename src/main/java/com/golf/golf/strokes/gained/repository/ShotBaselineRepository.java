package com.golf.golf.strokes.gained.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.golf.golf.strokes.gained.entity.ShotBaseline;

@Repository
public interface ShotBaselineRepository extends JpaRepository<ShotBaseline, Integer>{

}
