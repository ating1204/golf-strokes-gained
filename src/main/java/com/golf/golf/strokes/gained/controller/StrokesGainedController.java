package com.golf.golf.strokes.gained.controller;

import java.util.List;

import com.golf.golf.strokes.gained.entity.UserShot;
import com.golf.golf.strokes.gained.service.StrokesGainedService;
import com.golf.golf.strokes.gained.service.UserShotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/shots")
public class StrokesGainedController {

    private final StrokesGainedService calculatorEngine;
    private final UserShotService userShotService;

    // Inject BOTH services into the controller
    public StrokesGainedController(StrokesGainedService calculatorEngine, UserShotService userShotService) {
        this.calculatorEngine = calculatorEngine;
        this.userShotService = userShotService;
    }

    // --- TAB 1: The Quick Calculator (Does NOT save to DB) ---
    @GetMapping("/calculate")
    public Double calculateOnly(
            @RequestParam int startDist,
            @RequestParam String startLie,
            @RequestParam int endDist,
            @RequestParam String endLie) {
        
        return calculatorEngine.calculateSG(startDist, startLie, endDist, endLie);
    }

    // --- TAB 2: The Data Logger (Calculates AND saves to DB) ---
    @PostMapping("/log")
    public UserShot logShot(
            @RequestParam Integer startDist,
            @RequestParam String startLie,
            @RequestParam Integer endDist,
            @RequestParam String endLie,
            @RequestParam Integer penaltyStrokes,
            @RequestParam String clubUsed) {

        return userShotService.logNewShot(startDist, startLie, endDist, endLie, penaltyStrokes, clubUsed);
    }

    @GetMapping
    public List<UserShot> listShots() {
        return userShotService.getAllShots();
    }

    @DeleteMapping("/last")
    public UserShot undoLastShot() {
        return userShotService.undoLastShot();
    }

    @DeleteMapping("/{id}")
    public void deleteShot(@PathVariable Long id) {
        userShotService.deleteShot(id);
    }
}