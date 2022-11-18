package com.masai.cases;

import java.util.List;

import com.masai.dao.TrainingDao;
import com.masai.exceptions.CourseException;
import com.masai.models.Student;

public class AllStudentsOfCourseName {
	public static void main(String[] args) {
		TrainingDao dao = new TrainingDao();
		String courseName = "Java";
		try {
			List<Student> students = dao.getAlltheStudentsByCourseName(courseName);
			System.out.println("All students in course : " + courseName + " are :");
			
			int i=1;
			for(Student std : students) {
				System.out.println((i++)+": " + std.getName());
			}
			
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}
	}
}
