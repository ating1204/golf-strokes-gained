package com.golf.golf.strokes.gained.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.golf.golf.strokes.gained.entity.UserShot;

@Repository
public interface UserShotRepository extends JpaRepository<UserShot, Long>{

    Optional<UserShot> findTopByOrderByIdDesc();
}
