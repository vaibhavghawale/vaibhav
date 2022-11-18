package com.Sprint1.day0.DateTimeApI;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String args[]){
		// the current date (yyyy-MM-dd) format
		LocalDate date = LocalDate.now();
		System.out.println("the current date is :"+ date);
		// the current time hh:mm:ss.nanosec
		LocalTime time = LocalTime.now();
		System.out.println("the current time is "+ time);
}
}
