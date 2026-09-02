package com.golf.golf.strokes.gained.repository;

import java.util.List;

import com.golf.golf.strokes.gained.entity.HoleTee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoleTeeRepository extends JpaRepository<HoleTee, Long> {

    List<HoleTee> findByHoleIdIn(List<Long> holeIds);
}