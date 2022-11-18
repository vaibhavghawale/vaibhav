package com.masai.service;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

public interface StudentService {

	//here supplied student don't have the roll
	//and the returned studen object will have auto generated roll
	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll)throws StudentException;

	
	public List<Student> getAllStudents()throws StudentException;
	
	
	public Student deleteStudentByRoll(Integer roll)throws StudentException;
	
	
	public Student updateStudentDetails(Student student)throws StudentException;
	
	
	public Student updateStudentMarks(Integer roll, Integer graceMarks)throws StudentException;
	
	
	public List<Student> getStudentsByMarks(Integer marks)throws StudentException;
	
	public Student getStudentByAddress(String address)throws StudentException;
	
	public String getStudentNameByRoll(Integer roll)throws StudentException;
	
	
	public List<String> getNameAndMarksByAddress(String address)throws StudentException;
	
	public List<StudentDTO> getNameAndMarksByAddress2(String address)throws StudentException;
	
	
	
	
	
	
	
}
