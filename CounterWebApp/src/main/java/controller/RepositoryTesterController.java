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
import java.util.Date;
import persistence.entities.User;
import persistence.entities.Day;
import persistence.entities.Exercises;
import java.text.SimpleDateFormat;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;



@Controller
public class RepositoryTesterController extends HttpServlet{

	
	private static String VIEW_INDEX = "index";
	//private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
	private static UserRepository groovyXml=new UserRepository();
	private static WorkoutRepository groovyWorkout = new WorkoutRepository();



	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String login() {
			VIEW_INDEX = "createNewUserTester";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "test", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request) {
			//SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
			User user = new User(request.getParameter("name"), request.getParameter("password"), Integer.parseInt(request.getParameter("age")), request.getParameter("username"), request.getParameter("goal"), request.getParameter("gender"), Double.parseDouble(request.getParameter("weight")), request.getParameter("nextUpdate"));
			groovyXml.createNewUser(user);

			VIEW_INDEX = "createNewUserTester";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "FindUser", method = RequestMethod.GET)
	public String getUsername(){
		VIEW_INDEX = "testinputFindUser";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "FindUser", method = RequestMethod.POST)
	public String getUsernamePost(HttpServletRequest request, ModelMap model) throws IOException{

		
		Object user = groovyXml.findUser(request.getParameter("username"));
		
		
		if(user instanceof User){
			System.out.println("eg er inni if bby");
			User u = (User) user;
			System.out.println(u.getName());
		}


		VIEW_INDEX = "testFindUser";
				
			

			return VIEW_INDEX;
	}

	@RequestMapping(value = "testUpdate", method = RequestMethod.GET)
	public String update() {
			VIEW_INDEX = "testUpdateUser";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testUpdate", method = RequestMethod.POST)
	public String updatepost(HttpServletRequest request) {
			User user = new User(null, null, Integer.parseInt(request.getParameter("age")), request.getParameter("username"), request.getParameter("goal"), null, Double.parseDouble(request.getParameter("weight")), null);
			groovyXml.updateUser(user);

			VIEW_INDEX = "testUpdateUser";
		return VIEW_INDEX;
	}


	@RequestMapping(value = "testworkout", method = RequestMethod.GET)
	public String getworkout() {
			VIEW_INDEX = "testgetworkout";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testworkout", method = RequestMethod.POST)
	public String getworkoutPost(HttpServletRequest request) {
			groovyWorkout.createCycle(request.getParameter("username"), request.getParameter("date"));


			VIEW_INDEX = "testgetworkout";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testgetcycle", method = RequestMethod.GET)
	public String getworkoutCycle() {
			VIEW_INDEX = "testgetCycle";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testgetcycle", method = RequestMethod.POST)
	public String getworkoutCyclePost(HttpServletRequest request) {
			Object cc = groovyWorkout.getCurrentCycle(request.getParameter("username"));

			if(cc instanceof ArrayList<?>){
			System.out.println("eg er inni if bby");
			ArrayList<Day> days = (ArrayList<Day>) cc;
			ArrayList<Exercises> exer = days.get(0).getExercises();
			System.out.println(days.get(0).getWentToGym());
			System.out.println(exer.get(0).getName());
			}


			VIEW_INDEX = "testgetCycle";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testgetday", method = RequestMethod.GET)
	public String getSpecificDay() {
			VIEW_INDEX = "testgetday";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testgetday", method = RequestMethod.POST)
	public String getSpecificDay(HttpServletRequest request) {
			Object cc = groovyWorkout.getSpecificDay(request.getParameter("username"), request.getParameter("date"));

			if(cc instanceof Day){
			System.out.println("eg er inni if bby");
			Day days = (Day) cc;
			System.out.println(days.getWentToGym());
			}


			VIEW_INDEX = "testgetday";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testUpdateSet", method = RequestMethod.GET)
	public String updateSet() {
			VIEW_INDEX = "testUpdateSet";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "testUpdateSet", method = RequestMethod.POST)
	public String updateSetPost(HttpServletRequest request) {
			
			groovyWorkout.updateSet(request.getParameter("username"), Double.parseDouble(request.getParameter("dbWeight")),Integer.parseInt(request.getParameter("noOfSet")),Integer.parseInt(request.getParameter("exerciseID")), request.getParameter("date"));

		

			VIEW_INDEX = "testUpdateSet";
		return VIEW_INDEX;
	}
}
