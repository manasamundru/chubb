package com.OneToMany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OneToMany.Service.TutorialsService;
import com.OneToMany.request.Tutorials;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class TutorialsController {
	@Autowired
	TutorialsService tutorialService;
	@GetMapping("/tutorials")
	String getTutorial() {
		return "Tutorial";
	}
	@PostMapping("/tutorials")
	void saveTutorial(@RequestBody  Tutorials tutorial) {
		tutorialService.insertTutorial(tutorial);
	}
   
}
