package com.streamapiMethRef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.comparator.EmployeeMain1;
class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
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
