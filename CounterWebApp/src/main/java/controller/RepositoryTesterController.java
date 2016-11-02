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
import java.text.SimpleDateFormat;
import java.util.Map;
import org.json.*;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;



@Controller
public class RepositoryTesterController extends HttpServlet{

	
	private static String VIEW_INDEX = "index";
	//private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
	private static UserRepository groovyXml=new UserRepository();



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
		//ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		//String json = ow.writeValueAsString(user);
		//toMap(json);
		//JSONArray array = (JSONArray)json;
		//Map<String, String> map = gson.fromJson(json, new TypeToken<Map<String, String>>(){}.getType());
		//HashMap<String, String> res = new ObjectMapper().readValue(json, HashMap.class);
		//System.out.println(map);
		//System.out.println(json.name);
		//model.addAttribute("name",user.name);
		//model.addAttribute("username",user.password;
		//model.addAttribute("age",user.getAge());
		//model.addAttribute("goal",user.getGoal());
		//model.addAttribute("gender",user.getGender());
		//model.addAttribute("weight",user.getUserWeight());
		//model.addAttribute("nextUpdate",user.getNextUpdate());		
		
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

}
