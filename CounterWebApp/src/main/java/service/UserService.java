package service;

import persistence.entities.User;
import java.util.*;

import persistence.repositories.UserRepository;
import persistence.repositories.WorkoutRepository;

public class UserService{

	public UserRepository userRepository = new UserRepository();
	public Password pass = new Password();
	public WorkoutRepository workoutRepository = new WorkoutRepository();
	//Creates new user
	public void createNewUser(String name, String password, String email, String username,
	 						String age,String goal, String gender, String weight, String nextUpdate){
		try{
			String hashandsalt = pass.getSaltedHash(password);	

			User user = new User(name,hashandsalt,email,Integer.parseInt(age),username,goal,gender,Double.parseDouble(weight),nextUpdate);
			userRepository.createNewUser(user);
			workoutRepository.createCycle(username,nextUpdate);
		}catch(Exception e){
			System.out.println("pass villa :(");
		}
		
				
	}

	//Authenticates user trying to login
	public boolean authUser(String username, String password){
		
		Object user = userRepository.findUser(username);

		if(user instanceof User){
			User userToAuth = (User) user;
			try{
				if(pass.check(password,userToAuth.getPassword())){
					return true;
				}
			}catch(Exception e){
				System.out.println("einhver leiðindi í gangi");
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
			String email = userFound.getEmail();
			String goal = userFound.getGoal();
			int age = userFound.getAge();
			String gender = userFound.getGender();
			Double weight = userFound.getUserWeight();

			user.add(name);
			user.add(goal);
			user.add(email);
			user.add(age);
			user.add(gender);
			user.add(weight);
			return user;
		}

		return null;

	}

}