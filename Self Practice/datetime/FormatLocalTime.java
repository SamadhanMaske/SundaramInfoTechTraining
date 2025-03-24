package com.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = time.format(formatter);
        System.out.println("time"+time);
        System.out.println("Formatted Time: " + formattedTime);

	}

}
