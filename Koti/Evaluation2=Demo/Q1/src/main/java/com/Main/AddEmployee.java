package com.Main;

import java.util.Scanner;

import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.Model.Address;
import com.Model.Department;
import com.Model.Employee;

public class AddEmployee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Details");
	EmpDao dao=new EmpDaoImpl();
	
	Employee emp=new Employee();
	System.out.println("Enter Emp Name: ");
	emp.setEmpName(sc.next());
	System.out.println("Enter Emp Salary: ");
	emp.setSalary(sc.nextInt());
	
	Address addr=new Address();
	System.out.println("Enter State: ");
	addr.setState(sc.next());
	System.out.println("Enter City: ");
	addr.setCity(sc.next());
	System.out.println("Enter Pincode: ");
	addr.setPincode(sc.next());
	
	emp.setAddress(addr);
	dao.addEmployee(emp);
}
}






