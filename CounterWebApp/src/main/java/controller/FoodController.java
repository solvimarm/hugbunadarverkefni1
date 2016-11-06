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
public class FoodController extends HttpServlet{

	private static String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(FoodController.class);
	private static FoodService foodService = new FoodService();
	//private static UserService userService = new UserService();

	@RequestMapping(value = "foodPlan", method = RequestMethod.GET)
	public String publishSuggestedFoodsPost(){
		
		VIEW_INDEX = "foodPlan";
		return VIEW_INDEX;
	}

}