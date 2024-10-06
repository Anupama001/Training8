package com.st.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.st.entity.TrainingCenter;
import com.st.service.TrainingService;

@RestController
public class TrainingController {
	@Autowired
	TrainingService service;
	// POST API to save training center
	@PostMapping("/trainingcenter")
	private ResponseEntity<TrainingCenter> saveTraining(@RequestBody TrainingCenter trainingCenter) {
		TrainingCenter savedCenter=service.saveTraining(trainingCenter);
		if (savedCenter == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // error handle
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCenter);	// save 
	}
	 // GET API to get a list of all training centers
	@GetMapping("/trainingcenter")
	public ResponseEntity<List<TrainingCenter>> getAll()
	  {
	    List<TrainingCenter> centers= service.getAllTrainingCenters();
	    if (centers.isEmpty()) {
            return ResponseEntity.ok(Collections.emptyList()); // Return 200 OK with empty list
        }
        return ResponseEntity.ok(centers); // Return 200 OK with list of Training center
	  }
	

}
