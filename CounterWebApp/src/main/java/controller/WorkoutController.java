package controller;

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

import service.WorkoutService;


@Controller
public class WorkoutController extends HttpServlet{

	private static String VIEW_INDEX = "homepage";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(WorkoutController.class);
	private static WorkoutService workoutService = new WorkoutService();
	
	//Gets the current workout cycle and shows it to the user
	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public String getCurrentCycleGet(HttpSession session, ModelMap model){
		
		//Finds current workout cycle for the user
		String username = (String)session.getAttribute("username");

		ArrayList<Day> cycle = workoutService.getCurrentCycle(username);
		session.setAttribute("currentCycle",cycle);

		Day day1 = cycle.get(4);
		Day day2 = cycle.get(3);
		Day day3 = cycle.get(2);
		Day day4 = cycle.get(1);
		Day day5 = cycle.get(0);

		ArrayList<Exercises> day1Ex = day1.getExercises();
		ArrayList<Exercises> day2Ex = day2.getExercises();
		ArrayList<Exercises> day3Ex = day3.getExercises();
		ArrayList<Exercises> day4Ex = day4.getExercises();
		ArrayList<Exercises> day5Ex = day5.getExercises();

		String weekday1 = workoutService.getWeekday(day1.getDate());
		String weekday2 = workoutService.getWeekday(day2.getDate());
		String weekday3 = workoutService.getWeekday(day3.getDate());
		String weekday4 = workoutService.getWeekday(day4.getDate());
		String weekday5 = workoutService.getWeekday(day5.getDate());

		//Shows it to the user
		model.addAttribute("day1Weekday",weekday1);
		model.addAttribute("day2Weekday",weekday2);
		model.addAttribute("day3Weekday",weekday3);
		model.addAttribute("day4Weekday",weekday4);
		model.addAttribute("day5Weekday",weekday5);
		model.addAttribute("day1Date",day1.getDate());
		model.addAttribute("day2Date",day2.getDate());
		model.addAttribute("day3Date",day3.getDate());
		model.addAttribute("day4Date",day4.getDate());
		model.addAttribute("day5Date",day5.getDate());
		model.addAttribute("day1Ex",day1Ex);
		model.addAttribute("day2Ex",day2Ex);
		model.addAttribute("day3Ex",day3Ex);
		model.addAttribute("day4Ex",day4Ex);
		model.addAttribute("day5Ex",day5Ex);

		VIEW_INDEX = "homepage";
		return VIEW_INDEX;
	}

	//Takes the user to a specific day in the cycle
	@RequestMapping(value = "homepage", method = RequestMethod.POST)
	public String getCurrentCyclePost(HttpSession session, HttpServletRequest request){

		//Find the right date and keep it in session
		ArrayList<Day> currentCycle = (ArrayList<Day>)session.getAttribute("currentCycle");
		VIEW_INDEX = "workoutOfToday";
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
		if(request.getParameter("food")!=null){
			VIEW_INDEX = "foodPlan";
		}
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
		ArrayList<Set> set = new ArrayList<Set>();
		for(int i = 0; i < exercise.size(); i++){
			set.addAll(exercise.get(i).getSet());
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
	public String getSpecificDayPost(HttpSession session, HttpServletRequest request){
		System.out.println(request.getParameter("æfing 1"));

		VIEW_INDEX = "homepage";
		return "redirect:/"+VIEW_INDEX;
	}
}