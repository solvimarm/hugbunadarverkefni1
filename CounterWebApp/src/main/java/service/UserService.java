package com.mkyong.controller;

import persistence.entities.User;
import java.util.*;

public class UserService{

	public UserRepository userRepository = new UserRepository();

	//Creates new user
	public void createNewUser(String name, String password, String email, String username,
	 						String age,String goal, String gender, String weight, String nextUpdate){
		
		User user = new User(name,password,email,Integer.parseInt(age),username,goal,gender,Double.parseDouble(weight),nextUpdate);
		userRepository.createNewUser(user);		
	}

	//Authenticates user trying to login
	public boolean authUser(String username, String password){
		
		Object user = userRepository.findUser(username);

		if(user instanceof User){
			User userToAuth = (User) user;

			if(password.equals(userToAuth.getPassword())){

				return true;
			}
		}
		return false;
	}

	//Finds user from the dateabase
	public ArrayList findUser(String username){

		Object userToFind = userRepository.findUser(username);

		if(userToFind instanceof User){
			User userFound = (User) userToFind;

			ArrayList user = new ArrayList();
			String name = userFound.getName();
			String goal = userFound.getGoal();
			String email = userFound.getEmail();

			user.add(name);
			user.add(goal);
			user.add(email);

			return user;
		}

		return null;

	}

}