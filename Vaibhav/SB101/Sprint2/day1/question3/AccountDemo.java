package com.Sprint2.day1.question3;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account ac=new Account("123456789",500);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Press option for services '1' for deposit and '2' for withdro");
		
		int opt=input.nextInt();
		if(opt==1) {
			System.out.println("Please Enter a Deposite Amount");
			Double amount=input.nextDouble();
			ac.deposit(amount);
			System.out.println("Your current balance is "+Account.balance);
			
		}else if(opt==2) {

			try {
			System.out.println("Please Enter a withdraw Amount");
			Double amount=input.nextDouble();
			ac.withdraw(amount);
			System.out.println("Your current balance is "+Account.balance);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}else{
			System.out.println("Please selcet right ans");
		}
		
		System.out.println(Account.balance);
		
		input.close();
		
		
	}
	
	
}
