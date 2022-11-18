package com.masai.cases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.models.Department;

public class AddDepartment {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		Department department = new Department();
		department.setDeptName("marketing");
		department.setLocation("Mumbai");
		dao.addDepartment(department);
		System.out.println("done...");
	}
}
