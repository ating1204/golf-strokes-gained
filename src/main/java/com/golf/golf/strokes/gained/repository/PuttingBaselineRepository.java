package com.golf.golf.strokes.gained.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.golf.golf.strokes.gained.entity.PuttingBaseline;

@Repository

public interface PuttingBaselineRepository extends JpaRepository<PuttingBaseline, Integer>{

}
