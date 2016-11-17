package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.ArrayList;
import persistence.entities.Day;


@Controller
public class WorkoutController extends HttpServlet{

	private static String VIEW_INDEX = "homepage";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(WorkoutController.class);
	private static WorkoutService workoutService = new WorkoutService();
	
	//Not fully implemented
	@RequestMapping(value = "currentCycle", method = RequestMethod.GET)
	public String getCurrentCycleGet(HttpSession session){
		
		String username = (String)session.getAttribute("username");

		ArrayList<Day> cycle = workoutService.getCurrentCycle("username");
		VIEW_INDEX = "currentCycle";
		return VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "currentCycle", method = RequestMethod.POST)
	public String getCurrentCyclePost(){

		VIEW_INDEX = "workoutOfToday";
		return "redirect:/"+VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "workoutOfToday", method = RequestMethod.GET)
	public String getSpecificDayGet(HttpSession session, ModelMap model){

		//Get parameters
		String username = (String)session.getAttribute("username");
		String date = "vantar hvernig tökum dagsetningu";

		Day day = workoutService.getSpecificDay(username, date);
		//Input information from day into view. Not implemennted

		VIEW_INDEX = "workoutOfToday";
		return VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "workoutOfToday", method= RequestMethod.POST)
	public String getSpecificDayPost(){

		VIEW_INDEX = "homepage";
		return "redirect:/"+VIEW_INDEX;
	}
}