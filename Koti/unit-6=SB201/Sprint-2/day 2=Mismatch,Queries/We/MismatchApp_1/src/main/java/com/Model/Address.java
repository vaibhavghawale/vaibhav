package com.Model;

import java.util.Objects;

import javax.persistence.Embeddable;

//@Embeddable // 1st method for creating table if it is not possible use Embedded in Employee class
public class Address {
	String city;
	String country;
	String pincode;
	
	public Address() {
		
	}

	public Address(String city, String country, String pincode) {
		super();
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}
}

	
	




