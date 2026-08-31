package com.golf.golf.strokes.gained.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.golf.golf.strokes.gained.entity.PuttingBaseline;


//simply interacts with database in postgres and nothing else (postgres database access)

@Repository

public interface PuttingBaselineRepository extends JpaRepository<PuttingBaseline, Integer>{
/*
 * Extends JpaRepository Available Functions:
 *   findById(id)              one row, or empty
 *   findAll()                 every row
 *   save(entity)              insert or update
 *   existsById(id)            true/false
 *   count()                   row count
 *   deleteById(id)            delete by id
 *   delete(entity)            delete this row
 *   deleteAll()               wipe the table
 * Extra methods you declare below (e.g. findTopByOrderByIdDesc) are also available.
 */
}
