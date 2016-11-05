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


@Controller
public class WorkoutController extends HttpServlet{

	private static String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(WorkoutController.class);
	//private static WorkoutService workoutService = new WorkoutService();
	
	@RequestMapping(value = "currentCycle", method = RequestMethod.GET)
	public String getCurrentCycleGet(){

		VIEW_INDEX = "currentCycle";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "currentCycle", method = RequestMethod.POST)
	public String getCurrentCyclePost(){

		VIEW_INDEX = "workoutOfToday";
		return "redirect:/"+VIEW_INDEX;
	}

	@RequestMapping(value = "workoutOfToday", method = RequestMethod.GET)
	public String getSpecificDayGet(){

		VIEW_INDEX = "workoutOfToday";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "workoutOfToday", method= RequestMethod.POST)
	public String getSpecificDayPost(){

		VIEW_INDEX = "homepage";
		return "redirect:/"+VIEW_INDEX;
	}
}