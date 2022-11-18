package com.Main;

import java.util.List;
import java.util.Scanner;

import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.Exceptions.DepartmentException;
import com.Exceptions.EmployeeException;
import com.Model.Department;
import com.Model.Employee;

public class GetDepartmentDetailsByEmployeeId {
	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Id: ");
		int empId=sc.nextInt();
		
		
			Department dep;
			try {
				dep = dao.getDepartmentDetailsByEmployeeId(empId);
				System.out.println(dep);
			} catch (DepartmentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
	}
}
