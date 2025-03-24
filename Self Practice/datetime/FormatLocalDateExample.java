package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String formattedDate = date.format(formatter);
		System.out.println("Local date: "+date);
		System.out.println("Formatted date: "+formattedDate);
		
		// Parsing String back to LocalDate
        String dateStr = "25-12-2025";
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed Date: " + parsedDate);
        
        
	}

}
