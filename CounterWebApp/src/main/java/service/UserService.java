package com.mkyong.controller;

import persistence.entities.User;

public class UserService{

	public UserRepository userRepository = new UserRepository();

	public void createNewUser(String name, String password, String email, String username,
	 						String age,String goal, String gender, String weight, String nextUpdate){
		
		User user = new User(name,password,email,Integer.parseInt(age),username,goal,gender,Double.parseDouble(weight),nextUpdate);
		userRepository.createNewUser(user);		
	}
	public boolean authUser(String username, String password){
		
		Object user = userRepository.findUser(username);

		if(user instanceof User){
			User userToAuth = (User) user;
		}
		if(password == userToAuth.password){
			return true;
		}
		return false;
	}

}