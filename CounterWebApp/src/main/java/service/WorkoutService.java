package com.mkyong.controller;

import java.util.ArrayList;
import persistence.entities.Day;
import persistence.entities.User;
import java.util.*;

public class WorkoutService{

	public UserRepository userRepository = new UserRepository();
	public WorkoutRepository workoutRepository = new WorkoutRepository();

	public void createNewCycle(User user){

	}
	public void updateDay(Day day,User user){
		
	}
	public ArrayList<Day> getCurrentCycle(String username){
		return null;
	}
	public Day getSpecificDay(User user, Date date){
		return null;
	}

}