package com.March13;

import java.util.*;
import java.util.stream.*;

public class StreamDemo1 {
public static void main(String args[])
{
	List<Integer> l=Arrays.asList(4,5,6,7,8);
	//Stream<Integer>s=l.stream();
	//s.forEach(x->System.out.println(x));
	//s.forEach(System.out::println);
//	l.stream().forEach(x->System.out.println(x));
//	l.stream().forEach(System.out::println);
	int s=l.stream().filter(x->x>4).mapToInt(x->x).sum();
	System.out.println("sum is"+s);
	System.out.println("Even numbers: ");
	l.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
	System.out.println("Even numbers using method referance: ");
	l.stream().filter(x->x%2==0).forEach(System.out::println);
	
	// Storing filtered even numbers in a new list
    List<Integer> evenNumbers = l.stream()
                                 .filter(x -> x % 2 == 0)
                                 .collect(Collectors.toList());
    // Printing the new list
    System.out.println("\n"+evenNumbers);
    
    List<String> l2 = Arrays.asList("ZAnn","Ben","Ken");
    l2.stream().map(x->x.toUpperCase()).filter(x->x.contains("E")).forEach(System.out::println);
    
    long countE = l.stream().filter(x->x%2==0).count();
    Map<String,Long> m = new HashMap();
    m.put("Even", countE);
    long countO = l.stream().filter(x->x%2!=0).count();
    m.put("Odd", countO);
        //System.out.println("count = " + count1);
    
    System.out.println("Sorting in reverse order: ");
    l2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    
    int sum = l.stream().reduce(0, (a,b)->a+b);
    System.out.println("Sum using reduce: "+sum);
    
    //To convert a array to a stream use Arrays.stream(list) or Stream.of(list)
//    String[] ls = {"Benn", "Den", "Ann"};
//    List<String> namesStream = (List<String>) Arrays.stream(ls);
    
//    Stream<String> l21 = Stream.of("Java", "C++", "Python");
//    System.out.println(l21.noneMatch(x->x.contains("e")));
//    System.out.println(l21.allMatch(x->x.contains("e")));
//    System.out.println(l21.anyMatch(x->x.contains("e")));
    
    //Collect
    
//    List<String> lis = ls.map(x->x.toUpperCase()).collect(Collectors.toList());
//    lis.stream().forEach(System.out::println);
	
    List<Integer> list2=Arrays.asList(4,5,6,7,8);
    Optional<Integer> o = list2.stream().findFirst();
    if(o.isPresent()) {
    	System.out.println("First using findFirst: "+o.get());
    }
    System.out.println("Max element: "+list2.stream().max(Integer::compare).get());
    System.out.println("Min element: "+list2.stream().min(Integer::compare).get());
}
}