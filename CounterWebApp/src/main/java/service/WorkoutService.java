package com.mkyong.controller;
import java.util.ArrayList;
import persistence.entities.Day;
import persistence.entities.User;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import persistence.entities.Exercises;
import persistence.entities.Set;

public class WorkoutService{

	public UserRepository userRepository = new UserRepository();
	public WorkoutRepository workoutRepository = new WorkoutRepository();

	public void createNewCycle(User user){

		//String to Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String nextUpdate = user.getNextUpdate();
		Date nextUpdateDate;
		try{
			nextUpdateDate = dateFormat.parse(nextUpdate);

			Calendar c = Calendar.getInstance();
			c.setTime(new Date()); // Now use today date.
			c.add(Calendar.DATE, 1); // Adding 1 day
			Date date = c.getTime();
			String toomorrow = dateFormat.format(date);
			//Date currDateFormat = dateFormat.parse(currentDate);
			if(date.compareTo(nextUpdateDate) >= 0) {
				workoutRepository.createCycle(user.getUsername(), toomorrow);
			}

		}catch(Exception e){
			System.out.println("þú ert inní exception auli");
		}	
	}

	public void updateDay(Day day,User user){
		ArrayList<Exercises> exercises = day.getExercises();
		for(int i=0; i<exercises.size(); i++){
			Exercises exercise = exercises.get(i);
			ArrayList<Set> sets = exercise.getSet();
			for(int j=0; j<sets.size();j++){
				Set set = sets.get(j);
				workoutRepository.updateSet(user.getUsername(), set.getWeight(), set.getNumber(), exercise.getId(), day.getDate());
			}
		}
		
		workoutRepository.wentToGym(user.getUsername(), day.getDate());

	}

	public ArrayList<Day> getCurrentCycle(String username){

		Object currentCycleObject = workoutRepository.getCurrentCycle(username);
		
		if(currentCycleObject instanceof ArrayList<?>){
			ArrayList<Day> currentCycle = (ArrayList<Day>) currentCycleObject;
			ArrayList<Exercises> exer = currentCycle.get(0).getExercises();
			System.out.println(currentCycle.get(0).getWentToGym());
			System.out.println(exer.get(0).getName());
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