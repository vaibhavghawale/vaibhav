package com.Sprint2.day1.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a any two number");
		int a=input.nextInt();
		int b=input.nextInt();
		try {
			System.out.println("dividation of both number"+Math.floorDiv(a, b));
		}catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		}
		
		System.out.println("Inside finally block");
		input.close();
	}
}
