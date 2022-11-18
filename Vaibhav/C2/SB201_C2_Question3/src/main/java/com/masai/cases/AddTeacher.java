package com.masai.cases;

import com.masai.dao.TrainingDao;
import com.masai.models.Teacher;

public class AddTeacher {
	public static void main(String[] args) {
		TrainingDao dao = new TrainingDao();
		Teacher teacher = new Teacher();
		teacher.setTeacherName("Ramesh");
		teacher.setEmail("ramesh@gmail.com");
		teacher.setNoYearOfExperince(2);
		dao.registerTeacher(teacher);
		System.out.println("done...");
	}
}
