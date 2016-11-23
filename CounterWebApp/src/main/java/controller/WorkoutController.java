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
import persistence.entities.Stats;

import service.WorkoutService;
import service.StatsService;
import service.UserService;


@Controller
public class WorkoutController extends HttpServlet{

	private static String VIEW_INDEX = "homepage";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(WorkoutController.class);
	private static WorkoutService workoutService = new WorkoutService();
	private static StatsService statsService = new StatsService();
	private static UserService userService = new UserService();
	
	//Gets the current workout cycle and shows it to the user
	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public String getCurrentCycleGet(HttpSession session, ModelMap model){
		if(session.getAttribute("username") == null){
			VIEW_INDEX = "index";
			return "redirect:/"+VIEW_INDEX;
		}
		
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
		if(request.getParameter("day1")!=null){

			String date = currentCycle.get(4).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("day2")!=null){

			String date = currentCycle.get(3).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("day3")!=null){

			String date = currentCycle.get(2).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("day4")!=null){

			String date = currentCycle.get(1).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("day5")!=null){

			String date = currentCycle.get(0).getDate();
			session.setAttribute("date",date);
		}
		if(request.getParameter("food")!=null){
			VIEW_INDEX = "foodPlan";
		}
		return "redirect:/"+VIEW_INDEX;
	}

	//Show user the wholw workout for a specific day.
	@RequestMapping(value = "workoutOfToday", method = RequestMethod.GET)
	public String getSpecificDayGet(HttpSession session, ModelMap model){
		if(session.getAttribute("username") == null){
			VIEW_INDEX = "index";
			return "redirect:/"+VIEW_INDEX;
		}

		//Get parameters
		String username = (String)session.getAttribute("username");
		String date = (String)session.getAttribute("date");

		Day day = workoutService.getSpecificDay(username, date);
		
		//Input information from day into view. 
		ArrayList<Exercises> exercises = day.getExercises();
		int numberOfInputs=0;

		for(int i=0; i<exercises.size();i++){
			 numberOfInputs += exercises.get(i).getSet().size();
		}
		session.setAttribute("numberOfInputs",numberOfInputs);
		model.addAttribute("exercises",exercises);

		VIEW_INDEX = "workoutOfToday";
		return VIEW_INDEX;
	}

	//Not fully implemented
	@RequestMapping(value = "workoutOfToday", method= RequestMethod.POST)
	public String getSpecificDayPost(HttpSession session, HttpServletRequest request, ModelMap model){

		String username = (String)session.getAttribute("username");
		String date = (String)session.getAttribute("date");
		int numberOfInputs = (Integer)session.getAttribute("numberOfInputs");
		Day day = workoutService.getSpecificDay(username,date);
		ArrayList<Exercises> exercises = day.getExercises();
		ArrayList<Double> inputs = new ArrayList<Double>();


		//Gets weights inputs from user
		for(int i=1; i<=numberOfInputs;i++){
			String number = Integer.toString(i);
			inputs.add(Double.parseDouble(request.getParameter(number)));
		}

		//Adds input into day object.
		int index = 0;
		for(int i=0; i<exercises.size(); i++){
			Exercises exercise = exercises.get(i);
			ArrayList<Set> sets = exercise.getSet();
			for(int j=0; j<sets.size();j++){
				Set set = sets.get(j);
				Double input = inputs.get(index);
				set.setWeight(input);
				index++;
			}
		}
		//Add input into databse
		workoutService.updateDay(day, username);
	
			
		VIEW_INDEX = "homepage";
		return "redirect:/"+VIEW_INDEX;
	}
	@RequestMapping(value = "stats", method = RequestMethod.GET)
	public String statsGet(HttpSession session, ModelMap model){
		if(session.getAttribute("username") == null){
			VIEW_INDEX = "index";
			return "redirect:/"+VIEW_INDEX;
		}
		String username = (String)session.getAttribute("username");
		String date = (String)session.getAttribute("date");
		ArrayList user = userService.findUser(username);
		String goal = (String)user.get(1);
		int id = workoutService.getIdByDate(date);

		ArrayList<Stats> stats = statsService.getAveragePerDay(username,id,goal);
		


		VIEW_INDEX = "stats";
		return VIEW_INDEX;
	}
}









