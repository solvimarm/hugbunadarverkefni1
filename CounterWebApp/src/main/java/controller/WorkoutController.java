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
import persistence.entities.Exercises;


@Controller
public class WorkoutController extends HttpServlet{

	private static String VIEW_INDEX = "homepage";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(WorkoutController.class);
	private static WorkoutService workoutService = new WorkoutService();
	
	//Gets the current workout cycle and shows it to the user
	@RequestMapping(value = "currentCycle", method = RequestMethod.GET)
	public String getCurrentCycleGet(HttpSession session, ModelMap model){
		
		String username = (String)session.getAttribute("username");

		ArrayList<Day> cycle = workoutService.getCurrentCycle(username);

		Day monday = cycle.get(0);
		Day tuesday = cycle.get(1);
		Day wednesday = cycle.get(2);
		Day thursday = cycle.get(3);
		Day friday = cycle.get(4);

		ArrayList<Exercises> mondayEx = monday.getExercises();
		ArrayList<Exercises> tuesdayEx = tuesday.getExercises();
		ArrayList<Exercises> wednesdayEx = wednesday.getExercises();
		ArrayList<Exercises> thursdayEx = thursday.getExercises();
		ArrayList<Exercises> fridayEx = friday.getExercises();

		model.addAttribute("mondayDate",monday.getDate());
		model.addAttribute("tuesdayDate",tuesday.getDate());
		model.addAttribute("wednesdayDate",wednesday.getDate());
		model.addAttribute("thursdayDate",thursday.getDate());
		model.addAttribute("fridayDate", friday.getDate());
		model.addAttribute("mondayEx",mondayEx);
		model.addAttribute("tuesdayEx",tuesdayEx);
		model.addAttribute("wednesdayEx",wednesdayEx);
		model.addAttribute("thursdayEx",thursdayEx);
		model.addAttribute("fridayEx",fridayEx);

		VIEW_INDEX = "currentCycle";
		return VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "currentCycle", method = RequestMethod.POST)
	public String getCurrentCyclePost(HttpSession session, HttpServletRequest request){

		if(request.getParameter("monday")!=null){
			session.setAttribute("date","dagur");
			System.out.println("ég er hjér að ýta á mánudagggggggg");
		}
		VIEW_INDEX = "workoutOfToday";
		return "redirect:/"+VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "workoutOfToday", method = RequestMethod.GET)
	public String getSpecificDayGet(HttpSession session, ModelMap model){

		//Get parameters
		String username = (String)session.getAttribute("username");
		String date = "03/01/2016";

		Day day = workoutService.getSpecificDay(username, date);
		//Input information from day into view. Not implemennted
		ArrayList<Exercises> exercise = day.getExercises();
		ArrayList workout = new ArrayList();
		for(int i = 0; i < exercise.size(); i++){
			System.out.println(exercise.get(i).getSet());
			//set.add(exercise.get(i).getSet());
			workout.add(exercise.get(i).getName());
		}
		model.addAttribute("workout",workout);

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