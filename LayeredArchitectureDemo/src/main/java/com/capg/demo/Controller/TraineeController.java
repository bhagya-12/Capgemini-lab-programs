package com.capg.demo.Controller;

import com.capg.demo.Service.TraineeService;
import com.capg.demo.model.Trainee;

public class TraineeController {
	TraineeService service;

	public void addTrainee(Trainee trainee) {
		service.addTrainee(trainee);
	}
}
