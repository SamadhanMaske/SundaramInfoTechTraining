package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
		//Add "Hello", 42, 3.14, true, and "World"
		s.add("Hello");
		s.add(42);
		s.add(3.14);
		s.add(true);
		s.add("World");
		
		System.out.println("List elements with their data types:");
        for (Object o : s) {
            System.out.println("ELement: " +o+ "   Data type: " + o.getClass().getSimpleName());
        }
        
        if(s.contains(42)) {
        	System.out.println("42 is present");
        	
        s.remove("World");
        
        System.out.println("\n List elements with their data types:");
        for (Object o : s) {
            System.out.println("ELement: " +o+ "   Data type: " + o.getClass().getSimpleName());
        }
        
        }
	}

}
