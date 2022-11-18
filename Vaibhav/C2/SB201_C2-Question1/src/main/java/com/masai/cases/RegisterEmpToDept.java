package com.masai.cases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;

public class RegisterEmpToDept {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			int empid = 1;
			int deptid = 2;
			dao.registerEmployeeTODepartment(empid,deptid);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
	}
}
