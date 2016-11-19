package com.mkyong.controller;
import persistence.entities.User;
//Not fully implemented
public class VerifyService{

	public UserRepository userRepository = new UserRepository();

	public Boolean verifyName(String name){
		if(name.length() <= 2 || name.length() > 30)return false;

		if(name.matches(".*\\d.*"))return false;

		return true;
	}

	public Boolean verifyUsername(String username){

		if(username.length() < 1)return false;

		Object user = userRepository.findUser(username);
		if(user instanceof User)return false;

		return true;
	}

	public Boolean verifyPass(String password){
		return true;	
	}

	public Boolean verifyEmail(String email){
		return true;
	}

	public Boolean verifyWeight(String weight){
		return true;
	}
	
}