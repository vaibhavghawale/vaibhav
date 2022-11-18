package com.masai.cases;

import com.masai.dao.TrainingDao;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.TeacherException;

public class AssignTeacherToCourse {
	public static void main(String[] args) {
		TrainingDao dao = new TrainingDao();
		int teacId = 4;
		int courseId = 1;
		try {
			dao.assignTeacherWithCourse(teacId,courseId);
		} catch (TeacherException e) {
			System.out.println(e.getMessage());
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}
	}
}
