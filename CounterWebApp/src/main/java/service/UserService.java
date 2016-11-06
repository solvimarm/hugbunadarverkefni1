package com.mkyong.controller;

public class UserService{

	public UserRepository userRepository = new UserRepository();

	public void createNewUser(String name, String password, String email, String username,
	 						String age,String goal, String gender, String weight){

	}
	public boolean authUser(String username, String password){
		return true;
	}

}