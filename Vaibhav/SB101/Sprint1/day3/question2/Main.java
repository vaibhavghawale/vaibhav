package com.Sprint1.day3.question2;

import java.util.Scanner;

public class Main {
	
	public static void DOB(String date,String month,String year) {
		
		int d= Integer.parseInt(date);
		int m= Integer.parseInt(month);
		int y= Integer.parseInt(year);
		int age=2022-y;
		 String message = null;
		try {
		if(age>0) {
			
			System.out.println("Your current age is "+age);
			 message = "Code Run Succesfully";
		}
		
		System.out.println(message.toUpperCase());
		
//		}catch (NullPointerException npe) {
//			System.out.println("Birth is not valid");
//			
//		}catch (ArithmeticException ae) {
//			System.out.println("Birth is not valid");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		    Scanner sc=new Scanner(System.in); 
			
			System.out.println("Date of birth");
			
			System.out.println("Please Enter a Date");
			String date = sc.nextLine();
			
			System.out.println("Please Enter a Month");
			String month = sc.nextLine();
			
			System.out.println("Please Enter a Year");
			String year = sc.nextLine();
			

		DOB(date,month,year);
		
		sc.close();
	}
	

}
