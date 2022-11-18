package com.masai.PresentationLayer;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;
import com.masai.Servce.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Scanner;

public class PresentationBean {
    @Autowired
    private EmpService empService;
    Scanner scanner=new Scanner(System.in);
    public void insertEmployee() {
        System.out.println("Plese Enter how many Employees you want to save");
      int x=  scanner.nextInt();
        for(int i=0;i<x;i++){
            Employee employee=new Employee();
            scanner.nextLine();
            System.out.println("please Enter Employee name");
            employee.setEmpName(scanner.nextLine());
            System.out.println("please Enter Employee Address");
            employee.setEmpAddress(scanner.nextLine());
            System.out.println("please Enter Employee Salary");
            employee.setSalary(scanner.nextInt());
            empService.saveEmployee(employee);
        }
    }
    public void printAllEmployee(){
      List<Employee> employeeList= empService.getAllEmployee();
       for(Employee e:employeeList){
           System.out.println(e.getEmpId());
           System.out.println(e.getEmpName());
           System.out.println(e.getEmpAddress());
           System.out.println(e.getSalary());
       }

    }
    public void searchEmployee(){
        System.out.println("Enter Enployee ID you want search");
        try {
           Employee employee= empService.getEmployeeById(scanner.nextInt());
            System.out.println(employee);
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteEmployee(){
        System.out.println("Enter Enployee ID you want Delete");
        try {
            System.out.println(empService.deleteEmployeeById(scanner.nextInt()));
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
         }

}
