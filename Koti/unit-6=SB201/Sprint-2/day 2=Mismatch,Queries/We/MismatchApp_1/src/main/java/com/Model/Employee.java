package com.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	 
/*============================= Step 1: for Single address =========================*/
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int eid;
//	private String ename;
//	private int salary;
//	@Embedded
//	private Address addr;
	
//--if we try to take 2 address (one for home and another for office ) and then try to persist the 
//	employee obj we will get exception "repeated column" 
//	
//	@Embedded
//	private HomeAddress addr;
//	
//	@Embedded
//	private OfficeAddress addr;
//
//--we can solve this problem by overriding the column names of Embedded obj 
//	by using "@AttributeOverrides" annotation.
	
///*======= No Need of Constructor functions because we are using @Entity and @GeneratedValue ====== */
//	
//	
//	public int getEid() {
//		return eid;
//	}
//
//	public Address getAddr() {
//		return addr;
//	}
//
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}
//
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//
//	public String getEname() {
//		return ename;
//	}
//
//	public void setEname(String ename) {
//		this.ename = ename;
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
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
//	}

/*============================= Step 2: for Multiple address ->It is Not Working =========================*/	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int eid;
//	private String ename;
//	private int salary;
//
//	@Embedded
//	@AttributeOverrides({
//
//		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
//		@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
//		@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))
//
//	})
//	private Address homeAddr;
//
//	@Embedded
//	@AttributeOverrides({
//
//		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
//		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
//		@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
//
//	})
//	private Address officeAddr;
//
//	public int getEid() {
//		return eid;
//	}
//
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//
//	public String getEname() {
//		return ename;
//	}
//
//	public void setEname(String ename) {
//		this.ename = ename;
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
//	public Address getHomeAddr() {
//		return homeAddr;
//	}
//
//	public void setHomeAddr(Address homeAddr) {
//		this.homeAddr = homeAddr;
//	}
//
//	public Address getOfficeAddr() {
//		return officeAddr;
//	}
//
//	public void setOfficeAddr(Address officeAddr) {
//		this.officeAddr = officeAddr;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", homeAddr=" + homeAddr
//				+ ", officeAddr=" + officeAddr + "]";
//	}
//	
	
	
	
/*====================== Step 3: for Multiple address maximum we used this method =====================*/	
	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;

	@ElementCollection
	@Embedded
	@JoinTable(name="empaddress",joinColumns=@JoinColumn(name="emp_id")) //changeing name of table and column name
	private List<Address> address=new ArrayList<Address>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}

	

		
}


















