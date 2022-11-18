package com.useCases;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImple;

public class Main {

	public static void main(String[] args) {
		AccountDao a=new AccountDaoImple();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter choice");
			
			System.out.println("1.Account find");
			System.out.println("2.Account save");
			System.out.println("3.Account delete");
			System.out.println("4.Account withdraw");
			System.out.println("5.Account deposit");
		}
	}
}
