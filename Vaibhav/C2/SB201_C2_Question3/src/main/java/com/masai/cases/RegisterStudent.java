package com.masai.cases;

import com.masai.dao.TrainingDao;
import com.masai.exceptions.CourseException;
import com.masai.models.Student;

public class RegisterStudent {
	public static void main(String[] args) {
		TrainingDao dao = new TrainingDao();
		Student student = new Student();
		student.setName("Rohan");
		student.setMobile(9191919);
		student.setEmail("rohan@gmail.com");
		try {
			dao.registerStudent(student, 1);
			System.out.println("done...");
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}
	}
}
