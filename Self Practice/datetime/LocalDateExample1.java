package com.datetime;

import java.time.LocalDate;

public class LocalDateExample1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate specificDate = LocalDate.of(2025, 03, 15);
		System.out.println(specificDate);
		
		LocalDate parsedDate = LocalDate.parse("2025-03-15");
		System.out.println(parsedDate);
		
		System.out.println(specificDate.compareTo(parsedDate));
		
		System.out.println(parsedDate.isAfter(today));
		System.out.println(parsedDate.isBefore(today));
		
		LocalDate birthDay = LocalDate.of(2000, 8, 20);
		System.out.println(birthDay);	
		
	}
}
