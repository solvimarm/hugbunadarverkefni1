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
public class UserController extends HttpServlet{

	private static String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
	private static UserService userService = new UserService();
	private static VerifyService verifyService = new VerifyService();


	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexGet() {
			VIEW_INDEX = "index";
		return VIEW_INDEX;
	}

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


	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerGet() {
			VIEW_INDEX = "register";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerPost(HttpServletRequest request, ModelMap model) {
		String name = request.getParameter("name");
		String password	= request.getParameter("password");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String goal = request.getParameter("goal");
		String gender = request.getParameter("gender");
		String weight = request.getParameter("weight");
		String nextUpdate = request.getParameter("nextUpdate");
		ArrayList error = new ArrayList();
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
		else{
			userService.createNewUser(name,password,email,username,age,goal,gender,weight,nextUpdate);
			VIEW_INDEX = "homepage";
			return "redirect:/"+VIEW_INDEX;
		}
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

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginGet(){
		VIEW_INDEX = "login";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request){
		String password	= request.getParameter("pw");
		String username = request.getParameter("person_id");

		if(userService.authUser(username, password)){
			VIEW_INDEX = "homepage";	
			return  "redirect:/"+VIEW_INDEX;
		}
		else{
			
			return null;
		}

	}

	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public String getHomepage(){
		VIEW_INDEX = "homepage";
		return VIEW_INDEX;
	}

}














