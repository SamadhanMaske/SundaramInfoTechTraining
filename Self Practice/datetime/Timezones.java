package com.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Timezones {

	public static void main(String[] args) {
		//LocalDate and LocalDateTime don't contain timezone info. To work with timezones, 
		//use ZonedDateTime + ZoneId.
		// Current date & time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local DateTime: " + localDateTime);
        
        // Convert to ZonedDateTime with specific TimeZone
        ZoneId z = ZoneId.of("America/New_York");
        ZonedDateTime zdt = localDateTime.atZone(z);
        System.out.println("ZonedDateTime for ZoneId: "+zdt);
        // Convert to another timezone
//        ZonedDateTime inParis;
//		try {
//			inParis = ZonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        System.out.println("ZonedDateTime (Paris): " + inParis);
        
	}

}
