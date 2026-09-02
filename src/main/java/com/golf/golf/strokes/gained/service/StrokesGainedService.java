package com.golf.golf.strokes.gained.service;

import com.golf.golf.strokes.gained.entity.PuttingBaseline;
import com.golf.golf.strokes.gained.entity.ShotBaseline;
import com.golf.golf.strokes.gained.repository.PuttingBaselineRepository;
import com.golf.golf.strokes.gained.repository.ShotBaselineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/* 
service layer performs business logic
*/
@Service
public class StrokesGainedService {

    //note field = priv var in class that isn't in a subfunction
    //declares two repository variables
    //allows this service to look up putting_data and shot_data tables thru JPArepo
    private final PuttingBaselineRepository puttingRepo;
    private final ShotBaselineRepository shotRepo;


    @Autowired
    public StrokesGainedService(PuttingBaselineRepository puttingRepo, ShotBaselineRepository shotRepo) {
        this.puttingRepo = puttingRepo;
        this.shotRepo = shotRepo;
    }

    public double expectedStrokes(int distance, String lie) {
        if (lie == null || lie.isBlank()) {
            throw new IllegalArgumentException("Lie is required");
        }
        lie = lie.trim().toLowerCase();

        //shot is holed => distance = 0
        if ((lie.equals("green") && distance == 0)) {
            return 0.0;
        }

        //Putting has diff SG table
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