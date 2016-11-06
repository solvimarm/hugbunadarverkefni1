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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


@Controller
public class UserController extends HttpServlet{

	private static String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
	private static UserService userService = new UserService();
	private static VerifyService verifyService = new VerifyService();
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	//Gets starting page
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexGet() {
			VIEW_INDEX = "index";
		return VIEW_INDEX;
	}

	//Redirects to login page or register page
	@RequestMapping(value = "index", method = RequestMethod.POST)
	public String indexPost(HttpServletRequest request) {
		if(request.getParameter("login")!=null){
			VIEW_INDEX = "login";
		}
		else if(request.getParameter("register")!=null){
			VIEW_INDEX = "register";
		}
		return "redirect:/"+VIEW_INDEX;
	}

	//Gets register page
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerGet() {
			VIEW_INDEX = "register";
		return VIEW_INDEX;
	}

	//Registers new user, redirects to homepage when succesfull
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerPost(HttpServletRequest request, ModelMap model, HttpSession session) {

		//Gets parameters from form
		String name = request.getParameter("name");
		String password	= request.getParameter("password");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String goal = request.getParameter("goal");
		String gender = request.getParameter("gender");
		String weight = request.getParameter("weight");
		
		Date date = new Date();
		String nextUpdate = (String)dateFormat.format(date);
		ArrayList error = new ArrayList();

		//Verifies if parameters are in the correct format
		if(!verifyService.verifyName(name)||!verifyService.verifyUsername(username)||
			!verifyService.verifyPass(password)||!verifyService.verifyEmail(email)||!verifyService.verifyWeight(weight)){
			
			if(!verifyService.verifyName(name)){
				error.add("Invalid name");
			}
			if(!verifyService.verifyUsername(username)){
				error.add("Invalid username");
			}
			if(!verifyService.verifyPass(password)){
				error.add("Invalid password");
			}
			if(!verifyService.verifyEmail(email)){
				error.add("Invalid email");
			}
			if(!verifyService.verifyWeight(weight)){
				error.add("Invalid weight");
			}
		}
		//Redirects to homepage
		else{
			session.setAttribute("username", username);
			userService.createNewUser(name,password,email,username,age,goal,gender,weight,nextUpdate);
			VIEW_INDEX = "homepage";
			return "redirect:/"+VIEW_INDEX;
		}

		//Keeps input if not succesful
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("age", age);
		model.addAttribute("goal", goal );
		model.addAttribute("gender", gender);
		model.addAttribute("weight", weight);
		model.addAttribute("error", error+":");

		return null;
	}

	//Gets login page
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginGet(){
		VIEW_INDEX = "login";
		return VIEW_INDEX;
	}

	//Authenticates the login, redirects to homepage if succesful
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request, ModelMap model, HttpSession session){
		
		//Gets parameters
		String password	= request.getParameter("pw");
		String username = request.getParameter("person_id");

		if(userService.authUser(username, password)){
			session.setAttribute("username", username);
			VIEW_INDEX = "homepage";	
			return  "redirect:/"+VIEW_INDEX;
		}
		else{
			model.addAttribute("error", "Invalid Username or Password");
			return null;
		}

	}

	//Gets homepage specific for each user
	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public String getHomepage(HttpSession session, ModelMap model){
		
		//Redirects to index if not loged in
		if(session == null){
			indexGet();
		}
		else{
			String username =  (String)session.getAttribute("username");
			ArrayList user = new ArrayList();

			user = userService.findUser(username);

			model.addAttribute("name",user.get(0));
			model.addAttribute("email",user.get(2));
			model.addAttribute("goal",user.get(1));
			VIEW_INDEX = "homepage";
		}
		return VIEW_INDEX;
	}

	//Redirect from homepage
	@RequestMapping(value = "homepage", method = RequestMethod.POST)
	public String homeToNextDest(HttpServletRequest request){
		if(request.getParameter("week")!=null){
			VIEW_INDEX = "currentCycle";
		}
		else if(request.getParameter("day")!=null){
			VIEW_INDEX = "workoutOfToday";
		}
		else if(request.getParameter("food")!=null){
			VIEW_INDEX = "foodPlan";
		}

		return "redirect:/"+VIEW_INDEX;
	}

}














