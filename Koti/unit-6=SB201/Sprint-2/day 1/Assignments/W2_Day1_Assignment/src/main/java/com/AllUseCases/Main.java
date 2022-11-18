package com.AllUseCases;

import java.util.Scanner;

import com.masai.Employee;
import com.masai.EmployeeDao;
import com.masai.EmployeeDaoImpl;
import com.masai.EmployeeException;

public class Main {
public static void main(String[] args) throws EmployeeException {
	EmployeeDao ed=new EmployeeDaoImpl();
	
	Scanner sc=new Scanner(System.in);
	System.out.println(); //for gap purpose
	System.out.println("------------- Welcome to Employees Details -------------");

	
	while(true) {
		 System.out.println("Please Enter Below Numbers For Employee Details : ");
		    System.out.println("1. for Register new Employee");
		    System.out.println("2. for geting employee Id");
		    System.out.println("3. for Delete Employee"); 
		    System.out.println("4. for update to Employee"); 
		    System.out.println("5. for close application");
		    
		    int n1=sc.nextInt();
	
	if(n1==1) {
		while(true) {
			System.out.println("Enter Employee Name");
			String name=sc.next();
			
			System.out.println("Enter Employee Address");
			String addres=sc.next();
			
			System.out.println("Enter Employee Salary");
			int salary=sc.nextInt();
			
			Employee employe=new Employee();
			employe.setName(name);
			employe.setAddress(addres);
			employe.setSalary(salary);
			
			Employee emp=ed.registerEmployee(employe);
			System.out.println(emp);
			System.out.println("Registered sucessfully");
			
			System.out.println("Do you want to conitunue service please press yes or no");
	 		String ch1=sc.next();
	 		if(ch1.equalsIgnoreCase("no")) {
	 			break;
	 		}
			
		}
	 }
	else if(n1==2) {
		System.out.println();
		System.out.println("Enter Employee Id to Track Address");
		int id=sc.nextInt();
		
		Employee emp=ed.getEmployeeById(id);
		if(emp!=null) {
			System.out.println("Employee Id is: "+emp.getAddress());
		}
		else {
			System.out.println("Employee Not Found");
		}
	}
	else if(n1==3) {
		System.out.println();
		System.out.println("Enter Employee Id to Delete Details");
		int id2=sc.nextInt();
		
		Employee emp=ed.deleteEmployeeById(id2);
		if(emp!=null) {
			System.out.println("Employee deleted Successfull ");
		}
		else {
			System.out.println("Employee Not Found");
		}
		
//		System.out.println();
//		System.out.println("Enter Employee Id to delete Employee");
//		int empid = sc.nextInt();
//		if (ed.deleteEmployeeById(empid) != null) {
//			System.out.println();
//			System.out.println("Employee deleted Successfull....");
//		} else {
//			System.out.println();
//			System.out.println("Employee not found...");
//		}
	}
	else if(n1==4) {
		System.out.println();
		System.out.println("Enter Employee Name: ");
		String ename=sc.next();
		
		System.out.println("Enter Employee Address: ");
		String eaddress=sc.next();
		
		System.out.println("Enter Employee Salary: ");
		int esalary=sc.nextInt();
		
		Employee emp2=new Employee();
		emp2.setName(ename);
		emp2.setAddress(eaddress);
		emp2.setSalary(esalary);
		
		Employee eUpdate=ed.updateEmployee(emp2);
		System.out.println(eUpdate);
		
		if(emp2!=null) {
			System.out.println("Updated Details Updated Sucessfully");
		}
		else 
			System.out.println("Employee Not Found");
		
	}
	else if(n1==5) {
		System.out.println("Application Closed Sucessfully....");
    	break;
    
    }else {
    	System.out.println("Invalid Entry pleased try again");
    }
	
   }
	sc.close();
  }
}





