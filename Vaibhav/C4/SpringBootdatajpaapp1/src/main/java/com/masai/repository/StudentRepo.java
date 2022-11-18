package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDTO;
//the Spring Data JPA f/w will provide the implementation of this interface
//and register that implementation class object with Spring container as a Spring bean
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
	public List<Student> findByMarks(Integer marks);
	
	public Student findByAddress(String address);
	
//	@Query("select s.name from Student s where s.roll=:r")        
//	public String getStudentNameByRoll(@Param("r") Integer roll);

	@Query("select s.name from Student s where s.roll=?1")        
	public String getStudentNameByRoll(Integer roll);

	@Query("select s.name,s.marks from Student s where s.address =?1")
	public List<String> getNameAndMarksByAddress(String address);
	
	
	@Query("select new com.masai.model.StudentDTO(s.name,s.marks) from Student s where s.address =?1")
	public List<StudentDTO> getNameAndMarksByAddress2(String address);
	
	
	
}
