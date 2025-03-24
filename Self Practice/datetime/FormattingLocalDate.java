package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDate {

	public static void main(String[] args) {
		//To format or parse dates in a custom style, you use 
		//DateTimeFormatter.

		LocalDate date = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String formatedDate = date.format(formatter);
		System.out.println(formatedDate);
		
		String dateStr = "25-12-2025";
		LocalDate paresedDate = LocalDate.parse(dateStr,formatter);
		
	}

}
