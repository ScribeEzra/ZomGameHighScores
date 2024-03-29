package com.moncrief.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.moncrief.models.Score;

@Controller
public class ZomGameController {

	//Return a string from /HighScores URL
	@GetMapping("/HighScores")
	public String printScores(Model model) {
		
		List<Score> scores = new ArrayList<Score>();
		
		scores.add(new Score(0, "CJM", 30000));
		scores.add(new Score(1, "JV", 50000));
		scores.add(new Score(2, "CV", 50000));
		scores.add(new Score(3, "LIZ", 25000));
		scores.add(new Score(4, "NUL", 0));
		
		System.out.println(scores);
		
		model.addAttribute("scores", scores);
		return "HighScores";
	};
}
