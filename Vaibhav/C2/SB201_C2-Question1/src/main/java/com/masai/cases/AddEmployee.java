package com.masai.cases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.models.Address;
import com.masai.models.Employee;

public class AddEmployee {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee employee = new Employee();
		employee.setEmpName("Rohan");
		employee.setSalary(10000);
		
		Address address = new Address();
		address.setState("WestBengal");
		address.setCity("Kolkata");
		address.setPincode("787");
		
		employee.setAddress(address);
		
		dao.addEmployee(employee);
		
		System.out.println("done...");
	}
}
