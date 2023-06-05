package com.demo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Training;

@Service
public interface TrainingService {

	public Training registerTraining(Training training);

	public List<Training> getAllTrainings();

	public Training updateTraining(Training training);

	public String deleteTraining(Training training);
    
	public List<Training> sortingBasedOnDuration();
	
	public Training addTraining(Training training);
	
	public List<Training> findTrainingWithSorting(String trainingName);

	public List<Training> viewAllTrainings();
	
}
