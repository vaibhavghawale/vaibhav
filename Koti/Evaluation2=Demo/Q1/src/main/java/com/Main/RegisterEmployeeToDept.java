package com.Main;

import java.util.List;
import java.util.Scanner;

import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.Exceptions.DepartmentException;
import com.Exceptions.EmployeeException;
import com.Model.Employee;

public class RegisterEmployeeToDept {
	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Id: ");
		int empId=sc.nextInt();
		System.out.println("Enter Department Id: ");
		int depId=sc.nextInt();
		
		try {
			dao.registerEmployeeTODepartment(empId, depId);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
			
		} catch (DepartmentException re) {
			System.out.println(re.getMessage());
		}finally {
			sc.close();
		}
		
	}
}
