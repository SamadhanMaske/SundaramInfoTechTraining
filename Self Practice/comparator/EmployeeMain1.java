package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

//Sort the list of employees by salary in ascending order
class SalaryComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		return (int) (e1.getSalary()-e2.getSalary());
	}
	
}
//Sort the list of employees by name alphabetically using
class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e1.getName().compareTo(e2.getName());
	}

	@Override
	public String toString() {
		return "NameComparator [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

public class EmployeeMain1 {
	public static void main(String[] args) {
		List<Employee> l= new ArrayList();
		l.add(new Employee(1,"Samadhan", 35000));
		l.add(new Employee(2, "Unnati", 50000));
		l.add(new Employee(3,"Jagannath",25000));
		l.add(new Employee(4,"Aditi",25000));
		l.add(new Employee(5,"Purva",40000));
		System.out.println("Sorting by salary:");
		Collections.sort(l, new SalaryComparator());
		for(Employee e:l) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println("\nSorting by name:");
		Collections.sort(l, new NameComparator());
		for(Employee e:l) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println("\nSorting by salary (descending):");
		Collections.sort(l, new SalaryComparator().reversed());
		for(Employee e:l) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
	}
}
