package com.datetime;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		
		LocalTime specificTime = LocalTime.of(14, 30, 15); // 2:30:15 PM
        System.out.println("Specific Time: " + specificTime);

        // Parsing from String
        LocalTime parsedTime = LocalTime.parse("09:45:00");
        System.out.println("Parsed Time: " + parsedTime);
	}

}
