package com.masai.Servce;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;
import com.masai.Repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService{
     @Autowired
     EmployeeDAO employeeDAO;
    @Override
    public boolean saveEmployee(Employee emp) {
        return employeeDAO.insertEmployeeDetails(emp);
    }

    @Override
    public List getAllEmployee() {
       return employeeDAO.getAllEmployeeDetails();
    }

    @Override
    public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee employee =employeeDAO.findEmployee(empId);
      if(employee!=null){
          return employee;
      }else throw new EmployeeException("Employee not found "+empId);
    }

    @Override
    public String deleteEmployeeById(int empId) throws EmployeeException  {

       String str= employeeDAO.deleteEmployeeDetailsById(empId);
       if(str==null) throw new EmployeeException("Employee doesn't exist");
       else return str;
    }
}
