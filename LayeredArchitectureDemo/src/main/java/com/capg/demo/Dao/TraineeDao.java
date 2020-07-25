package com.capg.demo.Dao;

import com.capg.demo.model.Trainee;

public interface TraineeDao {
	public void addTrainee(Trainee trainee);
	public Trainee findTrainee(int id);
	public void removeTrainee(int id);
}
