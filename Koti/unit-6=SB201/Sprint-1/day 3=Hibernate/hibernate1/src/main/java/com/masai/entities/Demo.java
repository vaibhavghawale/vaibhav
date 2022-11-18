package com.masai.entities;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDao empdao = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Employee Part");
		while (true) {
			System.out.println("=================================");
			System.out.println();

			System.out.println("Please Enter Choice for Service");
			System.out.println();
			System.out.println("1. for Appoint new Employee");
			System.out.println();
			System.out.println("2. for Tracking Address of Employee");
			System.out.println();
			System.out.println("3. for Delete (Terminate) Employee");
			System.out.println();
			System.out.println("4. for Give Bonus to Employee");
			System.out.println();
			System.out.println("5. for close application");
			System.out.println();

			int ch = sc.nextInt();

			if (ch == 1) {

				while (true) {

					System.out.println("please enter employee Id should be unique");
					int id = sc.nextInt();
					System.out.println("Enter Employee Name");
					String name = sc.next();
					System.out.println("Enter Employee Address (only City Nmae)");
					String address = sc.next();
					System.out.println("Enter Employee salary");
					int salary = sc.nextInt();

					Employee employee = new Employee(id, name, address, salary);

					empdao.save(employee);
					System.out.println("-----------------X------------------X----------------X");
					System.out.println("Do you want to conitunue service please press yes or no");
					String ch1 = sc.next();
					if (ch1.equalsIgnoreCase("no")) {
						break;
					}

				}

			} else if (ch == 2) {
				System.out.println();
				System.out.println("Please Enter Employee Id for Tracking Address");
				int id = sc.nextInt();
				String address = empdao.getAddressOfEmployee(id);
				System.out.println();
				System.out.println(address);

			} else if (ch == 3) {
				System.out.println();
				System.out.println("Enter Employee Id to delete Employee");
				int empid = sc.nextInt();
				if (empdao.deleteEmployee(empid)) {
					System.out.println();
					System.out.println("Employee deleted Successfull....");
				} else {
					System.out.println();
					System.out.println("Employee not found...");
				}

			} else if (ch == 4) {
				System.out.println();
				System.out.println("Enter Employee Id to delete Employee");
				int empid = sc.nextInt();
				System.out.println("Enter Bonus amonut to give  Employee");
				int bonus = sc.nextInt();

				String employee = empdao.giveBonusToEmployee(empid, bonus);
				System.out.println();
				System.out.println(employee);

			} else if (ch == 5) {

				System.out.println("Application Closed Sucessfully....");
				break;

			} else {
				System.out.println("Invalid Entry pleased try again");
			}

		}
		sc.close();
	}
}
