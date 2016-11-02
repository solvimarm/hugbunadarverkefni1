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
	private static addToXml groovyXml=new addToXml();



	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
			VIEW_INDEX = "login";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request) {
			
			groovyXml.addPerson(request.getParameter("person_id"));

			VIEW_INDEX = "login";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "getname", method = RequestMethod.GET)
	public String getUsername(){
		VIEW_INDEX = "getUsername";
		return VIEW_INDEX;
	}

	@RequestMapping(value = "getname", method = RequestMethod.POST)
	public String getUsernamePost(HttpServletRequest request, ModelMap model){
				System.out.println(request.getParameter("personID"));
				model.addAttribute("Username",groovyXml.getUserName(request.getParameter("person_id")) );
				VIEW_INDEX = "pub";
				
			

			return VIEW_INDEX;
	}
	


}