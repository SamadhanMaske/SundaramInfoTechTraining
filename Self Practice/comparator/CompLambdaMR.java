package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompLambdaMR {

	public static void main(String[] args) {
		List<Employee> l= new ArrayList();
		l.add(new Employee(1,"Samadhan", 35000));
		l.add(new Employee(2, "Unnati", 50000));
		l.add(new Employee(3,"Jagannath",25000));
		l.add(new Employee(4,"Aditi",25000));
		l.add(new Employee(5,"Purva",40000));
		System.out.println("Using lambda expression:");
		System.out.println("Sorting by salary:");
		//Collections.sort(l, ((e1,e2)-> e1.getSalary()-(e2.getSalary()))); //int salary
		Collections.sort(l, ((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary())));
		//Using method referance
		Collections.sort(l, Comparator.comparingDouble(Employee::getSalary));
		for(Employee e:l) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println("\nSorting by name:");
		//Collections.sort(l, (e1,e2)-> e1.getName().compareTo(e2.getName()));
		Collections.sort(l, Comparator.comparing(Employee::getName));
		for(Employee e:l) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}


	}

}
