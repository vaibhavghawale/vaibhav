package com.Sprint1.day3.question1;

import java.util.Scanner;

public class Main {
	

	public static void main(String args[])
	{ 
		System.out.println("start of main..");
	
		Scanner sc = new Scanner(System.in);
	 
		try {
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();

		System.out.println("Enter num2");
	    int num2 = sc.nextInt();

	    String message = null;

	    int num3 = num1 / num2;
		    
	    if(num3 > 10)
	    {
	    	message = "Welcome to Exception Handling ";
	    }
	
	    System.out.println("Message is :"+message.toUpperCase());
	    
	    }catch (ArithmeticException ae) {
			System.out.println("num 2 should not be 0");
		}catch (NullPointerException npe) {
			System.out.println("String value is null");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	    System.out.println("end of main");
	    sc.close();
	}
	

}
