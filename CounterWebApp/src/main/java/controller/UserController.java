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
	public String registerPost(HttpServletRequest request) {
			String name = request.getParameter("name");
			System.out.print(name);
			VIEW_INDEX = "homepage";
		return "redirect:/"+VIEW_INDEX;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginGet(){
		VIEW_INDEX = "login";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request){
				VIEW_INDEX = "homepage";	
			return  "redirect:/"+VIEW_INDEX;
	}

	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public String getHomepage(){
		VIEW_INDEX = "homepage";
		return VIEW_INDEX;
	}

}














