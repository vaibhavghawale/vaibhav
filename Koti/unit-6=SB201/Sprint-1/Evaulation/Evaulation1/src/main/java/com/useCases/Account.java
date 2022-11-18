package com.useCases;

public class Account {
	private int id;
	private String email;
	private String address;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int id, String email, String address, double balance) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + "]";
	}
	
	
}
