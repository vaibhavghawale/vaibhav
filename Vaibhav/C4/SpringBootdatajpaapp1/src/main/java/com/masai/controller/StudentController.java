package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.service.StudentService;




@RestController
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student) {
		
		Student savedStudent= sService.registerStudent(student);
		
		
		return new ResponseEntity<Student>(savedStudent, HttpStatus.CREATED);
			
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll) throws StudentException{
		
		Student student= sService.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>>  getAllStudentHandler() throws StudentException {
		
		List<Student> students= sService.getAllStudents();
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		
		
		
	}
	
	
	
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable("roll") Integer roll) throws StudentException{
		
		Student deletedStudent= sService.deleteStudentByRoll(roll);
		
		return new ResponseEntity<Student>(deletedStudent,HttpStatus.OK);
		
	}
	
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) throws StudentException{
		
		Student updatedStudent= sService.updateStudentDetails(student);
		
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/students/{roll}")
	public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable("roll") Integer roll, @RequestParam(value ="gMarks") Integer gMarks) throws StudentException{
		
		Student updatedStudent= sService.updateStudentMarks(roll, gMarks);
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);

		
		
	}
	
	@GetMapping("/getstudents/{marks}")
	public ResponseEntity<List<Student>> getStudentsByMarksHandler(@PathVariable("marks") Integer marks) throws StudentException{
		
		
		List<Student> students= sService.getStudentsByMarks(marks);
		
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		
	}
	
	
	

	@GetMapping("/getstudentbyaddress/{address}")
	public ResponseEntity<Student> getStudentsByAddressHandler(@PathVariable("address") String address) throws StudentException{
		
		
		Student student= sService.getStudentByAddress(address);
		
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getName/{roll}")
	public ResponseEntity<String> getStudentNameByRollHandler(@PathVariable("roll") Integer roll) throws StudentException{
		
		String name= sService.getStudentNameByRoll(roll);
		
		return new ResponseEntity<String>(name, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/getNameMarks/{address}")
	public ResponseEntity<List<String>> getNameAndMarksbyAddressHandler(@PathVariable("address") String address) throws StudentException{
		
		
		List<String> results= sService.getNameAndMarksByAddress(address);
		
		
		return new ResponseEntity<List<String>>(results,HttpStatus.OK);
		
	}
	
	@GetMapping("/getNameMarksdto/{address}")
	public ResponseEntity<List<StudentDTO>> getNameAndMarksbyAddressHandler2(@PathVariable("address") String address) throws StudentException{
		
		
		List<StudentDTO> results= sService.getNameAndMarksByAddress2(address);
		
		
		return new ResponseEntity<List<StudentDTO>>(results,HttpStatus.OK);
		
	}
	
	
	

}
