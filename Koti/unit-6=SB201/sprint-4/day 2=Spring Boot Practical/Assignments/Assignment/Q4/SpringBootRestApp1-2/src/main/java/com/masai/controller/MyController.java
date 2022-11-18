package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

//@RestController=@Controller + @ResponseBody
@RestController // when it is used we don't want to give @ResponseBody Every time
public class MyController {
	
	@RequestMapping("/hello")
	public String myHelloService() {
		return "hello "; // It will be Treated as Raw data
	}
	
	@RequestMapping("/employee")
	public Employee getEmployeeDetails() {
		Employee emp=new Employee(1,"Ram","Manager");
		
		return emp;
	}
	
	@RequestMapping("/employees")
	public List<Employee> getListOfEmployees(){
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(5,"Shiva","Sales"));
		empList.add(new Employee(6,"Bramha","Production"));
		empList.add(new Employee(7,"Koti","Inspection"));
		empList.add(new Employee(8,"Raj","Sales"));
		empList.add(new Employee(9,"Rahul","Account"));
		
		return empList;
	}
	
}







