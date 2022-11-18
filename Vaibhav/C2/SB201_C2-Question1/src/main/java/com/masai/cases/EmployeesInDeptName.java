package com.masai.cases;

import java.util.List;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.models.Employee;

public class EmployeesInDeptName {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		String deptName = "marketing";
		try {
			List<Employee> employees = dao.getAllEmployeeWithDeptName(deptName);
			System.out.println("All employees in " + deptName + " are : ");
			int i=1;
			for(Employee emp : employees) {
				System.out.println((i++)+": " + emp.getEmpName());
			}
			
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
