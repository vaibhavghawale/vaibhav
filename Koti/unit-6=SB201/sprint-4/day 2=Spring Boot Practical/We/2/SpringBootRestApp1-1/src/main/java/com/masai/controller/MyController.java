package com.masai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

/*========================== Step1: ============================ */
//@Controller
//public class MyController {
//
//	// http://localhost:8080/welcome
//	
//	// from 10 to 13 lines it is resource and each resource has Addressable URI (URI = /welcome)
//	@RequestMapping("/welcome") //Addressable URI
//	@ResponseBody
//	public String myWelcomeService() {
//		return "Welcome to Spring Boot "; //First It is treated as logical name of jsb
//		                           // To Prevent that use @ResponseBody. After It Treated as Raw data 
//	}
//}

/*========================== Step2: ============================ */
               
//                 //@RestController=@Controller + @ResponseBody
//@RestController // when it is used we don't want to give @ResponseBody Every time
//public class MyController {
//
//	@RequestMapping("/welcome") 
//	public String myWelcomeService() {
//		return "Welcome to Spring Boot "; //It will be Treated as Raw data 
//	}
//	
//	@RequestMapping("/hello") 
//	public String myHelloService() {
//		return "hello "; //It will be Treated as Raw data 
//	}
//}

/*========================== Step2: ============================ */

//@RestController=@Controller + @ResponseBody
@RestController // when it is used we don't want to give @ResponseBody Every time
public class MyController {

	@RequestMapping("/welcome")
	public String myWelcomeService() {
		return "Welcome to Spring Boot "; // It will be Treated as Raw data
	}

	@RequestMapping("/hello")
	public String myHelloService() {
		return "hello "; // It will be Treated as Raw data
	}
	
	@RequestMapping("/getStudent")
	public Student getStudentService() {
		Student stu=new Student(10,"Ram","Delhi",780);
		
		return stu;
	}
}







