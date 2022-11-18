package com.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Department {
/* ========================== Step 1: One to Many - Unidirectional ==========================*/
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int deptId;
//	private String dname;
//	private String location;
//	
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="dept_emp",joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name="eid"))
//	List<Employee> list=new ArrayList<>();  //we are wright list because one Department have many Employees
//
//	public int getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}
//
//	public String getDname() {
//		return dname;
//	}
//
//	public void setDname(String dname) {
//		this.dname = dname;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public List<Employee> getList() {
//		return list;
//	}
//
//	public void setList(List<Employee> list) {
//		this.list = list;
//	}
//
//	@Override
//	public String toString() {
//		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + ", list=" + list + "]";
//	}
//	
//	public Department() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Department(int deptId, String dname, String location, List<Employee> list) {
//		super();
//		this.deptId = deptId;
//		this.dname = dname;
//		this.location = location;
//		this.list = list;
//	}
	
/* ========================== Step 2:  Many to One - Unidirectional =================================*/	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int deptId;
//	private String dname;
//	private String location;
//	
//	public int getDeptId() {
//		return deptId;
//	}
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}
//	public String getDname() {
//		return dname;
//	}
//	public void setDname(String dname) {
//		this.dname = dname;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	@Override
//	public String toString() {
//		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
//	}

/* ========================== Step 3:  One to Many (bidirectional):- =================================*/	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int deptId;
//	private String dname;
//	private String location;
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "dept") //we use mappedBy = "dept" for not creating 3rd table
//	private List<Employee> emps=new ArrayList<>(); //one department have many employees
//	
//	public List<Employee> getEmps() {
//		return emps;
//	}
//	public void setEmps(List<Employee> emps) {
//		this.emps = emps;
//	}
//	public int getDeptId() {
//		return deptId;
//	}
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}
//	public String getDname() {
//		return dname;
//	}
//	public void setDname(String dname) {
//		this.dname = dname;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	@Override
//	public String toString() {
//		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
//	}	
	
/*================ Step 4: Many to Many Relationship ===============*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String dname;
	private String location;
	
	@ManyToMany(cascade = CascadeType.ALL) 
	private List<Employee> emps=new ArrayList<>(); //one department have many employees
	
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
	}	
	
}



















