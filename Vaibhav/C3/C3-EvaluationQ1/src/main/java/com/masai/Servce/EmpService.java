package com.masai.Servce;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;

import java.util.List;

public interface EmpService {
    public boolean saveEmployee(Employee emp);
    public List getAllEmployee();
    public Employee getEmployeeById(int empId)throws EmployeeException;
    public String deleteEmployeeById(int empId) throws EmployeeException;
}
