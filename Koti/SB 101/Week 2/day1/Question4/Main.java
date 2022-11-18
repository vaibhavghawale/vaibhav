package day1.Question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			int c = n1 / n2;
			System.out.println("The quotient of "+Math.floor(n1/n2));
		} catch (ArithmeticException ae) {
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
