package com.golf.golf.strokes.gained.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.golf.golf.strokes.gained.entity.ShotBaseline;

//simply interacts with database in postgres and nothing else
    
@Repository
public interface ShotBaselineRepository extends JpaRepository<ShotBaseline, Integer>{

}
