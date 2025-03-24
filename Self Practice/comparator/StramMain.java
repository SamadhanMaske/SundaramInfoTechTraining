package com.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StramMain {
	public static void main(String args[]) {
		List<Employee> l= new ArrayList();
		l.add(new Employee(1,"Samadhan", 35000));
		l.add(new Employee(2, "Unnati", 50000));
		l.add(new Employee(3,"Jagannath",25000));
		l.add(new Employee(4,"Aditi",25000));
		l.add(new Employee(5,"Purva",40000));
		
		List<Employee>sortByName = l.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println("\nSorting by name:");
		for(Employee e:sortByName) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		List<Employee> sortBySalary = l.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println("\nSorting by salary:");
		for(Employee e:sortBySalary) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		
	}
}
