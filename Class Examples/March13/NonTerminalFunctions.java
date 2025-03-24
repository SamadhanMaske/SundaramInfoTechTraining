package com.March13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonTerminalFunctions {

	public static void main(String[] args) {
		//System.out.println("Implementation of filter() and map():");
		List<Integer> l = Arrays.asList(1,2,11,3,4,13,5,6);
//		List<Integer> evens = l.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println("Even numbers "+evens);
//		System.out.println("Odd numbers "+l.stream().filter(x->x%2!=0).toList());
//		
//		System.out.println("\nSquares: "+ l.stream().map(x->x*x).toList());
//		Map<Integer,Integer> squaresMap = l.stream().collect(Collectors.toMap(x->x,x->x*x));
//		System.out.println("Square map:"+squaresMap);
		
//		System.out.println("Implementattion of flatMap()");
//		List<List<Integer>> nl = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
//		List<Integer> fl = nl.stream().flatMap(list->list.stream()).collect(Collectors.toList());
//		System.out.println("Original list:"+nl);
//		System.out.println("Flattened list using flatMap():"+fl);
//		
//		List<Integer> l2 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//		List<Integer> dl2 = l2.stream().distinct().collect(Collectors.toList());
//		System.out.println("Distinct: "+dl2);
		
//		System.out.println("Implementattion of sorted() and sorted(Comparators.reverseOrder)");
		
//		List<Integer> sortedNumbers = l.stream()
//                .sorted()
//                .collect(Collectors.toList());
//		System.out.println("ASc Sorted list:"+sortedNumbers); 
		List<Integer> sortedDescending = l.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
//		System.out.println("Dsc Sorted list:"+sortedDescending);
		
//		System.out.println("Implementattion of peek()");
//		List<Integer> result = l.stream()
//                .peek(n -> System.out.println("Processing: " + n))
//                .map(n -> n * 2)
//                .collect(Collectors.toList());
		
		System.out.println("Implementattion of limit(n) and skip(n):");
		List<Integer> firstThree = l.stream()
                .limit(3)
                .collect(Collectors.toList());
		System.out.println("First Three:"+firstThree);  // Output:	[1, 2, 11]	
		List<Integer> afterSkippingTwo = l.stream()
		                      .skip(2)
		                      .collect(Collectors.toList());
		System.out.println(afterSkippingTwo);  // Output: [11, 3, 4, 13, 5, 6]

	}

}
