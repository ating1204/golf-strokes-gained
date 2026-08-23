package com.golf.golf.strokes.gained.controller;

import com.golf.golf.strokes.gained.service.StrokesGainedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //marks class to get this method to return a domain (?)
@RequestMapping(path = "/api/v1/calculator") //url
public class StrokesGainedController {

    private final StrokesGainedService sgService;

    public StrokesGainedController(StrokesGainedService sgService) {
        this.sgService = sgService;
    }

    // Creating the web endpoint
    @GetMapping("/shot")
    public Double getShotSG(
            @RequestParam int startDist,
            @RequestParam String startLie,
            @RequestParam int endDist,
            @RequestParam String endLie) {

        // Passing the web URL parameters directly into your Java math function
        return sgService.calculateSG(startDist, startLie, endDist, endLie);
    }

}
