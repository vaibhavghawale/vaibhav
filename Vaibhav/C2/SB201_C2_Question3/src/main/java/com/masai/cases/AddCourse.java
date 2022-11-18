package com.masai.cases;

import com.masai.dao.TrainingDao;
import com.masai.models.Course;

public class AddCourse {
	public static void main(String[] args) {
		TrainingDao dao = new TrainingDao();
		
		Course course = new Course();
		course.setCourseName("Java");
		course.setDuration(100);
		course.setFee(20000);
		dao.addCourse(course);
		
	}
}
