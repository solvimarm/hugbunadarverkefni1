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

		Object currentCycleObject = workoutRepository.getCurrentCycle(username);

		if(currentCycleObject instanceof ArrayList<?>){
			ArrayList<Day> currentCycle = (ArrayList<Day>) currentCycleObject;
			return currentCycle;
		}
		return null;
	}
	public Day getSpecificDay(String username, String date){
		
		Object dayObject = workoutRepository.getSpecificDay(username, date);

		if(dayObject instanceof Day){
			Day day = (Day) dayObject;
			return day;
		}
		return null;
	}

}