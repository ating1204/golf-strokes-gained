package com.golf.golf.strokes.gained.service;

import com.golf.golf.strokes.gained.entity.PuttingBaseline;
import com.golf.golf.strokes.gained.entity.ShotBaseline;
import com.golf.golf.strokes.gained.repository.PuttingBaselineRepository;
import com.golf.golf.strokes.gained.repository.ShotBaselineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrokesGainedService {

    //create  empty slots for databases
    private final PuttingBaselineRepository puttingRepo;
    private final ShotBaselineRepository shotRepo;

    // 2. The Constructor to inject the databases
    @Autowired
    public StrokesGainedService(PuttingBaselineRepository puttingRepo, ShotBaselineRepository shotRepo) {
        this.puttingRepo = puttingRepo;
        this.shotRepo = shotRepo;
    }

    public double expectedStrokes(int distance, String lie) {
        lie = lie.toLowerCase();
        //Exp Strokes = 0 when holed
        //maybe change logic later
        if (lie.equals("holed")) {
            return 0.0;
        }

        //Putting has diff ES table
        if (lie.equals("green")) {
            PuttingBaseline putt = puttingRepo.findById(distance)
                .orElseThrow(() -> new IllegalArgumentException(
                    "No putting baseline for " + distance + " ft"));
            return putt.getStrokes();
        }

        //ShotBaseline table
        ShotBaseline shot = shotRepo.findById(distance)
        .orElseThrow(() -> new IllegalArgumentException(
            "No shot baseline frfor " + distance + " yd"));
        
        if (lie.equals("tee")) return shot.getTee();
        if (lie.equals("fairway")) return shot.getFairway();
        if (lie.equals("rough")) return shot.getRough();
        if (lie.equals("sand")) return shot.getSand();

        throw new IllegalArgumentException("Invalid Lie Type: " + lie);
    }

    public double calculateSG (int startDist, String startLie,
        int endDist, String endLie) {
            double before = expectedStrokes(startDist, startLie);
            double after  = expectedStrokes(endDist, endLie);
            return before - after - 1;
    }

}