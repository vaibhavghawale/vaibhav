package com.masai.Repository;

import com.masai.Model.Employee;

import java.util.List;

public interface EmployeeDAO {
    public boolean insertEmployeeDetails(Employee emp);
    public List getAllEmployeeDetails();
    public Employee findEmployee(int empId);
    public String deleteEmployeeDetailsById(int empId);
}
