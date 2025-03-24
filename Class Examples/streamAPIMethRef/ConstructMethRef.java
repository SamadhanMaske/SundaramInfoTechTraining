package com.streamapiMethRef;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructMethRef {

	public static void main(String[] args) {
		 Function<String, StringBuilder> func = StringBuilder::new;
	     StringBuilder sb = func.apply("Hello ");
	     sb.append("World!");
	     System.out.println(sb); // Output: Hello World!
	     
	     List<String> names = List.of("Aditi", "Unnati", "Purva");

	        // Using Stream + Constructor Reference
	        List<Employee> employees = names.stream()
	                .map(name -> new Employee(0, name, 25000)) // constructor with arguments
	                .collect(Collectors.toList());

	        employees.forEach(System.out::println);
	}

}
