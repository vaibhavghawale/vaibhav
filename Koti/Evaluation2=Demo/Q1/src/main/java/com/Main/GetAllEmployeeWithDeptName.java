package com.Main;

import java.util.List;
import java.util.Scanner;

import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.Exceptions.EmployeeException;
import com.Model.Employee;

public class GetAllEmployeeWithDeptName {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dept Name: ");
		String deptName=sc.next();
		
		try {
			List<Employee> emplist=dao.getAllEmployeeWithDeptName(deptName);
			for(Employee e: emplist) {
				System.out.println(e);
			}
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}
}
