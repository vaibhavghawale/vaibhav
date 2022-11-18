package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerResponse.SseBuilder;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.repository.StudentRepo;
@Service
public class StudentDaoImpl implements StudentService{

	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public Student registerStudent(Student student) {
		
		Student savedStudent= sRepo.save(student);
		
		return savedStudent;
		
	}

	@Override
	public Student getStudentByRoll(Integer roll)throws StudentException {
	
//		 Optional<Student> opt= sRepo.findById(roll);
//		
//		 if(opt.isPresent()) {
//			 Student student= opt.get();
//			 return student;
//		 }
//		 else
//			 throw new StudentException("Student does not exist with Roll :"+roll);
		
		
		return sRepo.findById(roll)
				.orElseThrow(() -> new StudentException("Student does not exist with Roll "+roll));
		
		
		
		
	}

	@Override
	public List<Student> getAllStudents() throws StudentException {
		
		List<Student> students= sRepo.findAll();
		
		if(students.size() == 0)
			throw new StudentException("No Students are there");
		else
			return students;
		
		
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> opt= sRepo.findById(roll);
		
		if(opt.isPresent()) {
			
			
			Student existingStudent= opt.get();
			sRepo.delete(existingStudent);
			
			return existingStudent;
			
			
		}else
			throw new StudentException("Student does not exist with Roll :"+roll);
		
		
		
		
		
		
		
		
	}

	@Override
	public Student updateStudentDetails(Student student) throws StudentException {
		
		
		Optional<Student> opt= sRepo.findById(student.getRoll());
		
		if(opt.isPresent()) {
			
			Student updatedStudent= sRepo.save(student);
			return updatedStudent;
			
		}else
			throw new StudentException("Invalid Student details..");
		
		
		
		
		
	}

	
	
	
	@Override
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException {
		
		
		Student existingStudent= sRepo.findById(roll)
				.orElseThrow(() -> new StudentException("Student does not exist with Roll "+roll));
		
		existingStudent.setMarks(existingStudent.getMarks()+graceMarks);
		
		return  sRepo.save(existingStudent);
		
		
		
	}

	@Override
	public List<Student> getStudentsByMarks(Integer marks) throws StudentException {
		
		
		
		List<Student> students= sRepo.findByMarks(marks);
		
		
		if(students.size() == 0)
			throw new StudentException("No Student Found..");
		else
			return students;
		
		
		
		
		
	}

	@Override
	public Student getStudentByAddress(String address) throws StudentException {
		
		
		Student student= sRepo.findByAddress(address);
		
		if(student != null)
			return student;
		else
			throw new StudentException("Student not found with Address :"+address);
		
		
	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		
		
		String name= sRepo.getStudentNameByRoll(roll);
		
		if(name != null)
			return name;
		else
			throw new StudentException("Student not found with Roll :"+roll);
		
		
		
		
		
	}

	@Override
	public List<String> getNameAndMarksByAddress(String address) throws StudentException {
		
		List<String> results= sRepo.getNameAndMarksByAddress(address);
		
		if(results.size() == 0)
			throw new StudentException("No Student details found..");
		else
			return results;
		
		
	}
	
	@Override
	public List<StudentDTO> getNameAndMarksByAddress2(String address) throws StudentException {
		
		List<StudentDTO> results= sRepo.getNameAndMarksByAddress2(address);
		
		if(results.size() == 0)
			throw new StudentException("No Student details found..");
		else
			return results;
		
		
	}
	
	
	
	
	
	
	

}
