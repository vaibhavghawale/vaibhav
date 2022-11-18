package com.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

@Entity //It is Child Entity
public class Employee {
/* ===================== Step 1: One to Many - Unidirectional===========================*/
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int empId;
//	private String name;
//	private int salary;
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
//	}
	
/* ================================= Step 2:  Many to One - Unidirectional =================================*/	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int empId;
//	private String name;
//	private int salary;
//	
//    @ManyToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name="did") //for changing name
//	private Department dept;
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	public Department getDept() {
//		return dept;
//	}
//
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
//	}
	
/* ======================= Step 3: One to Many (bidirectional):- =================================*/	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int empId;
//	private String name;
//	private int salary;
//	
//    @ManyToOne(cascade = CascadeType.ALL)
//	private Department dept;
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	public Department getDept() {
//		return dept;
//	}
//
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
//	}
	
	/* ======================= Step 4: Many to Many :- =================================*/	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private int salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
    private List<Department> deptList=new ArrayList<Department>();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", deptList=" + deptList + "]";
	}

	

	
	
}



















