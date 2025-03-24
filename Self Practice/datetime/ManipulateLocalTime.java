package com.datetime;

import java.time.LocalTime;

public class ManipulateLocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(9, 30);

        // Add 2 hours
        LocalTime newTime = time.plusHours(2);
        System.out.println("After adding 2 hours: " + newTime);

        // Subtract 15 minutes
        LocalTime minusTime = time.minusMinutes(15);
        System.out.println("After subtracting 15 minutes: " + minusTime);

        // Compare times
        boolean isBefore = time.isBefore(LocalTime.NOON);
        System.out.println("Is before noon? " + isBefore);
	}

}
