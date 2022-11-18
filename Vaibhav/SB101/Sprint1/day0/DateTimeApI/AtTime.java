package com.Sprint1.day0.DateTimeApI;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AtTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, 1, 13);
		LocalDateTime datetime = date.atTime(1,50,9);
		System.out.println(datetime);
		}
	
}
