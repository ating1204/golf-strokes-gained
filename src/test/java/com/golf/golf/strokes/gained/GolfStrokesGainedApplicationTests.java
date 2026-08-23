package com.golf.golf.strokes.gained;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.golf.golf.strokes.gained.service.StrokesGainedService;

@SpringBootTest
class GolfStrokesGainedApplicationTests {
	@Autowired
	StrokesGainedService service;

	@Test
	void testExpectedStrokes() {
		double result = service.expectedStrokes(8, "green");
		System.out.println("8 ft on green = " + result);

		double sg = service.calculateSG(400, "tee", 150, "rough");
		String shown = String.format("%.2f", sg);
		System.out.println("Strokes Gained 400yd Tee --> 250 yd Drive to rough = " + shown);
	}

}
