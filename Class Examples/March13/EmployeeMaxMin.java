package com.March13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
    
}

public class EmployeeMaxMin {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 70000),
            new Employee("Bob", 85000),
            new Employee("Charlie", 65000),
            new Employee("David", 90000),
            new Employee("Eve", 72000)
        );
        
        Optional<Employee> highestPaid = employees.stream()
                .max((e1, e2) -> e1.getSalary() - e2.getSalary());

        Optional<Employee> lowestPaid = employees.stream()
                .min((e1, e2) -> e1.getSalary() - e2.getSalary());

System.out.println(highestPaid.get());
System.out.println(lowestPaid.get());

       
    

        // Find the highest-paid employee
        Optional<Employee> highestPaid1 = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary));

        // Find the lowest-paid employee
        Optional<Employee> lowestPaid1 = employees.stream()
                .min(Comparator.comparingInt(Employee::getSalary));

        // Print results
        System.out.println("Highest Paid: " + highestPaid1.map(Employee::getName).orElse("No employees"));
        System.out.println("Lowest Paid: " + lowestPaid1.map(Employee::getName).orElse("No employees"));
  
   
}
}


