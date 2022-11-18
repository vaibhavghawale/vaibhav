package com.Sprint1.day0.DateTimeApI;

import java.time.LocalDate;

public class Tommarow {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Today date: "+date);
		System.out.println("Yesterday date: "+yesterday);
		System.out.println("Tomorrow date: "+tomorrow);

	
}
}
