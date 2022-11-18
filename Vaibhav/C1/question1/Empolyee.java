package com.Evaluation.C1.question1;

import java.util.Objects;

public class Empolyee {
	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, empId, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empolyee other = (Empolyee) obj;
		return Objects.equals(address, other.address) && empId == other.empId && Objects.equals(name, other.name);
	}



	private int empId;
	private String name;
	private String address;
	
	
	
	public Empolyee() {
		super();
	}



	public Empolyee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}



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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
