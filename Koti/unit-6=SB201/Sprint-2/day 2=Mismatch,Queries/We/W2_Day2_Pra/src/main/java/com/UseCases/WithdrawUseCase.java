package com.UseCases;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.model.Account;

public class WithdrawUseCase {
	public static void main(String[] args) {

		AccountDao dao=new AccountDaoImpl();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Account number");
		int ano=sc.nextInt();

		Account acc= dao.findAccount(ano);

		if(acc == null)
			System.out.println("Account does not exist..");
		else{

			System.out.println("Enter the withdrawing amount");
			int amt=sc.nextInt();

			if(amt <= acc.getBalance()){

				acc.setBalance(acc.getBalance()-amt);
				boolean f=dao.updateAccount(acc);
				if(f)
					System.out.println("please collect the cash...");
				else
					System.out.println("Technical Error...");


			}else
				System.out.println("Insufficient Amount..");
		}
	}
}
