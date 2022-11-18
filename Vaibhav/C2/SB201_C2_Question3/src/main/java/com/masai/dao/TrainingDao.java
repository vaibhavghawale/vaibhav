package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.TeacherException;
import com.masai.models.Course;
import com.masai.models.Student;
import com.masai.models.Teacher;
import com.masai.util.EMUtil;

public class TrainingDao {
	public void addCourse(Course course) {
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		System.out.println("done...");
	}
	public void registerStudent(Student student,int courseId)throws CourseException{
		EntityManager em = EMUtil.provideEntityManager();
		Course course = em.find(Course.class, courseId);
		if(course != null) {
			course.getStudents().add(student);
			student.getCourses().add(course);
			em.getTransaction().begin();
			em.persist(course);
			em.getTransaction().commit();
		}
		else throw new CourseException("Course not found");
	}
	
	public void registerTeacher(Teacher teacher) {
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(teacher);
		em.getTransaction().commit();
		System.out.println("done...");
	}
	
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException{
		EntityManager em = EMUtil.provideEntityManager();
		Course course = em.find(Course.class, courseId);
		if(course != null) {
			Teacher teacher = em.find(Teacher.class, teacherId);
			if(teacher != null) {
				teacher.getCourses().add(course);
				course.setTeacher(teacher);
				em.getTransaction().begin();
				em.persist(course);
				em.getTransaction().commit();
				System.out.println("done...");
			}
			else throw new TeacherException("Teacher not found");
		}
		else throw new CourseException("Course not found");
	}
	
	public List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException{
		List<Student> students = null;
		EntityManager em = EMUtil.provideEntityManager();
		String jpql = "from Course where courseName = ?1";
		TypedQuery<Course> q = em.createQuery(jpql,Course.class);
		q.setParameter(1, courseName);
		Course course = q.getSingleResult();
		if(course != null) students = course.getStudents();
		else throw new CourseException("No course found");
		return students;
	}
}