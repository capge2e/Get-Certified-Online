package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.entity.Training;
import com.demo.main.service.TrainingService;



@RestController
@RequestMapping("/training")
public class TrainingController {
	@Autowired
	TrainingService trainingService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Training Page";
	}
	//http://localhost:8089/Training/registerTraining
	@PostMapping("/registerTraining")
	public Training addTraining(@RequestBody Training training)  {
		try {
			return trainingService.addTraining(training);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return training;
	}
	//http://localhost:8089/Training/allTraining
	@GetMapping("/allTraining")
	public List<Training> viewAllTrainings(){
		return trainingService.viewAllTrainings();
	}
	
	//http://localhost:8089/Training/updateTraining
	@PutMapping("/updateTraining")
	public Training updateTraining(@RequestBody Training training) {
		return trainingService.updateTraining(training);
	}
	
	//http://localhost:8089/Training/deleteTraining
	@DeleteMapping("/deleteTraining")
	public String deleteTraining(@RequestBody Training training)  {
		return trainingService.deleteTraining(training);
	}
	
	
}

