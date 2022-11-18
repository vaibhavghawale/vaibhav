package com.Sprint2.day1.question5;

import java.util.Scanner;

public class UserRegistration {

	 void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		 if(userCountry.contentEquals("india")) {
			 System.out.println("User registration done successfully");
			 System.out.println("Thanks You");
		 }else {
			 String msg="User Outside India cannot be registered";
			 InvalidCountryException ce=new InvalidCountryException(msg);
			 throw ce;
		 }
		 
	}
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Student name");
		String username=input.nextLine();
		
		System.out.println("Enter Student country name");
		String  userCountry=input.nextLine();
		
		UserRegistration ur=new UserRegistration();
		try {
		ur.registerUser(username,userCountry);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
}
