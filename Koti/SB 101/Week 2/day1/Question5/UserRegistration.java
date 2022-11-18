package day1.Question5;

import java.io.InvalidClassException;
import java.util.Scanner;

public class UserRegistration {
	
	public void registerUser(String username, String userCountry) throws InvalidClassException {

		if (!userCountry.equals("India"))

			throw new InvalidClassException("User Outside India cannot be registered");
		else

			System.out.println("User registration done successfully");
		System.out.println("Thank you!");

	}

	public static void main(String[] args) {

		UserRegistration registration = new UserRegistration();
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Name");
			String name=sc.next();
			
			System.out.println("Enter Your Country");
			String country=sc.next();

			registration.registerUser(name,country);
			
		} catch (InvalidClassException e) {

			System.out.println(e.getMessage());	
			System.out.println("Thank you!");
			}
	}

}
