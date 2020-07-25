package com.capg.demo.Service;

import com.capg.demo.model.Trainee;

public interface TraineeService {
	public void addTrainee(Trainee trainee);
	public void deleteTrainee(int id);
	public Trainee getTrainee(int id);
}
