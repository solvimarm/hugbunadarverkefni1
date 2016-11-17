package com.mkyong.controller;

import java.util.ArrayList;
import persistence.entities.Food;

//Not fully implemented
public class FoodService{

	public FoodRepository foodRepository = new FoodRepository();

	//Gets diet plan from repository for specific user
	public ArrayList<Food> getDietPlan(String username){

		Object dietPlanObject = foodRepository.getDietPlan(username);

		if(dietPlanObject instanceof ArrayList<?>){
			ArrayList<Food> dietPlan = (ArrayList<Food>) dietPlanObject;
			return dietPlan;
		}
		return null;
	}

}