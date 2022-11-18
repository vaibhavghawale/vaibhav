package com.masai.cases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.DepartmentException;
import com.masai.models.Department;

public class DeptOfEmp {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		int empid = 1;
		try {
			Department department = dao.getDepartmentDetailsByEmployeeId(empid);
			System.out.println("Department details of Employee id : " + empid);
			System.out.println("1-> Department id : " + department.getDeptId());
			System.out.println("2-> Department name : " + department.getDeptName());
			System.out.println("3-> Department location : " + department.getLocation());
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
	}
}
