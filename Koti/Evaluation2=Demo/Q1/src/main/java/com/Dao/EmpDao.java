package com.Dao;

import java.util.List;

import com.Exceptions.DepartmentException;
import com.Exceptions.EmployeeException;
import com.Model.Department;
import com.Model.Employee;

public interface EmpDao {
	public void addDepartment(Department dept);
	public void addEmployee(Employee emp);
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException;
	 List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException;
	 Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException;
}
