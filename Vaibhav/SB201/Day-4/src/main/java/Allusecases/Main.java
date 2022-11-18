package Allusecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.EmployeeException;
import com.masai.entities.Employee;

public class Main {

	public static void main(String[] args) throws EmployeeException {
		
		EmployeeDao empdao=new EmployeeDaoImpl();
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println(".........................Welcome to Employee Port.......................");
	    System.out.println();
	    System.out.println();
	    while(true) {
	    System.out.println("================================================================");	
	    System.out.println();
	    System.out.println();
	    System.out.println();
	  
	    System.out.println("Please Enter Choice for Service");
	    System.out.println();
	    System.out.println("1. for Register new Employee"); System.out.println();
	    System.out.println("2. for geting employee Id"); System.out.println();
	    System.out.println("3. for Delete Employee"); System.out.println();
	    System.out.println("4. for update to Employee"); System.out.println();
	    System.out.println("5. for close application"); System.out.println();
	    
	    int ch=sc.nextInt();
	    
	    if(ch==1) {
	    	
	    	while(true) {
		    	System.out.println("Enter Employee Name");
		    	String name=sc.next();
		    	System.out.println("Enter Employee Address (only City Nmae)");
		    	String address=sc.next();
		    	System.out.println("Enter Employee salary");
		    	int salary =sc.nextInt();
		    	
		    	Employee employee= new Employee();
		    	employee.setName(name);
		    	employee.setAddress(address);
		    	employee.setSalary(salary);
		    	
		 	Employee emp=empdao.registerEmployee(employee);
		 	System.out.println(emp);
		 	System.out.println("Emplyee Created Succesfully...");
		 	
		 		System.out.println("-----------------X------------------X----------------X");
		 		System.out.println("Do you want to conitunue service please press yes or no");
		 		String ch1=sc.next();
		 		if(ch1.equalsIgnoreCase("no")) {
		 			break;
		 		}
		 		
	    	}
	    	
	    	
	    }
	    else if(ch==2) {
	    	 System.out.println();
	    	System.out.println("Please Enter Employee Id for Tracking Address");
	    	int id=sc.nextInt();
	    	Employee emp=empdao.getEmployeeById(id);
	    	if(emp!=null)
	    	System.out.println("Employee Id is: "+emp.getEmpid());
	    	else System.out.println("Employee is not found");
	    }
	    else if(ch==3) {
	    	 System.out.println();
	    	System.out.println("Enter Employee Id to delete Employee");
			int empid=sc.nextInt();
			
			    Employee emp = empdao.deleteEmployeeById(empid) ;
			   if(emp!=null)
		    	System.out.println("Employee deleted Successfull....");
			   else System.out.println("Employee Not Found");
	    }
	    else if(ch==4) {
	    	System.out.println("Enter Employee Name");
	    	String name=sc.next();
	    	System.out.println("Enter Employee Address (only City Nmae)");
	    	String address=sc.next();
	    	System.out.println("Enter Employee salary");
	    	int salary =sc.nextInt();
	    	
	    	Employee employee= new Employee();
	    	employee.setName(name);
	    	employee.setAddress(address);
	    	employee.setSalary(salary); 
	    
	        Employee emp=empdao.updateEmployee(employee);
	        if(emp!=null)
		    	System.out.println("Employee updaed Successfull....");
			   else System.out.println("Employee Not Found");
	    		
	    		
	    }
	    else if(ch==5) {
	    
	    	System.out.println("Application Closed Sucessfully....");
	    	break;
	    
	    }else {
	    	System.out.println("Invalid Entry pleased try again");
	    }
       
			
	}
sc.close();
		
		
	}
}
