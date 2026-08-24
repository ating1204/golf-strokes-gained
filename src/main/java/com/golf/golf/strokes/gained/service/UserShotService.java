package com.golf.golf.strokes.gained.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.golf.golf.strokes.gained.entity.UserShot;
import com.golf.golf.strokes.gained.repository.UserShotRepository;

@Service
public class UserShotService {
    private final UserShotRepository userShotRepo;
    private final StrokesGainedService calculatorEngine;

    public UserShotService(UserShotRepository userShotRepo, StrokesGainedService calculatorEngine) {
        this.userShotRepo = userShotRepo;
        this.calculatorEngine = calculatorEngine;
    }

    public List<UserShot> getAllShots() {
        return userShotRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void deleteShot(Long id) {
        if (!userShotRepo.existsById(id)) {
            throw new IllegalArgumentException("No shot with id " + id);
        }
        userShotRepo.deleteById(id);
    }

    public UserShot undoLastShot() {
        UserShot last = userShotRepo.findTopByOrderByIdDesc()
            .orElseThrow(() -> new IllegalArgumentException("No shots to undo"));
        userShotRepo.delete(last);
        return last;
    }

    public UserShot logNewShot(Integer startDist, String startLie, Integer endDist, String endLie, Integer penaltyStrokes, String clubUsed) {
        
        // Step A: Ask the math engine to do the heavy lifting
        Double calculatedSG = calculatorEngine.calculateSG(startDist, startLie, endDist, endLie);

        // Step B: Build the new shot entity with the calculated result
        UserShot newShot = new UserShot(
            startDist, 
            startLie, 
            endDist, 
            endLie, 
            penaltyStrokes, 
            clubUsed, 
            calculatedSG
        );

        // Step C: Save it to PostgreSQL and return the saved object
        return userShotRepo.save(newShot);
    }
}
