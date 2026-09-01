package com.golf.golf.strokes.gained.repository;

import java.util.List;

import com.golf.golf.strokes.gained.entity.HoleMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoleMapRepository extends JpaRepository<HoleMap, Long> {

    // becomes: SELECT * FROM hole_map WHERE hole_id IN (...) — all 18 maps in one query
    List<HoleMap> findByHoleIdIn(List<Long> holeIds);
}