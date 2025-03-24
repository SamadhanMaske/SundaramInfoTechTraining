package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConvertLocalDateExample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025,03,17);
		
		//Convert to LocalDateTime at start of day
		LocalDateTime dateTimeStart = date.atStartOfDay();
		System.out.println("DateTime at start of day: " + dateTimeStart);
		
		// Convert to LocalDateTime at specific time
        LocalDateTime dateTimeSpecific = date.atTime(14, 30, 45);
        System.out.println("DateTime at 14:30:45: " + dateTimeSpecific);
        
        // Or use LocalTime
        LocalTime time = LocalTime.of(9, 15);
        LocalDateTime combined = date.atTime(time);
        System.out.println("Combined DateTime: " + combined);
		
	}

}
