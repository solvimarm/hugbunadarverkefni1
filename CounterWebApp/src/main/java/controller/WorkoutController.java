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
import persistence.entities.Set;


@Controller
public class WorkoutController extends HttpServlet{

	private static String VIEW_INDEX = "homepage";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(WorkoutController.class);
	private static WorkoutService workoutService = new WorkoutService();
	
	//Gets the current workout cycle and shows it to the user
	@RequestMapping(value = "currentCycle", method = RequestMethod.GET)
	public String getCurrentCycleGet(HttpSession session, ModelMap model){
		
		//Finds current workout cycle for the user
		String username = (String)session.getAttribute("username");

		ArrayList<Day> cycle = workoutService.getCurrentCycle(username);
		session.setAttribute("currentCycle",cycle);

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

		//Shows it to the user
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

	//Takes the user to a specific day in the cycle
	@RequestMapping(value = "currentCycle", method = RequestMethod.POST)
	public String getCurrentCyclePost(HttpSession session, HttpServletRequest request){

		//Find the right date and keep it in session
		ArrayList<Day> currentCycle = (ArrayList<Day>)session.getAttribute("currentCycle");
		if(request.getParameter("monday")!=null){

			String date = currentCycle.get(0).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("tuesday")!=null){

			String date = currentCycle.get(1).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("wednesday")!=null){

			String date = currentCycle.get(2).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("thursday")!=null){

			String date = currentCycle.get(3).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("friday")!=null){

			String date = currentCycle.get(4).getDate();
			session.setAttribute("date",date);
		}
		VIEW_INDEX = "workoutOfToday";
		return "redirect:/"+VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "workoutOfToday", method = RequestMethod.GET)
	public String getSpecificDayGet(HttpSession session, ModelMap model){

		//Get parameters
		String username = (String)session.getAttribute("username");
		String date = (String)session.getAttribute("date");

		Day day = workoutService.getSpecificDay(username, date);
		//Input information from day into view. Not implemennted
		ArrayList<Exercises> exercise = day.getExercises();
		ArrayList workout = new ArrayList();
		ArrayList<Set> set = exercise.get(0).getSet();
		for(int i = 0; i < exercise.size(); i++){
			System.out.println(exercise.get(i).getSet());
			//set.add(exercise.get(i).getSet());
			workout.add(exercise.get(i).getName());
		}
		int rep = (int)set.get(0).getRep();
		model.addAttribute("workout", workout);
		model.addAttribute("rep",rep);

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