package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Employee implements Comparable<Employee>{
	private int employeeID;
	private String employeeName;
	private double salary;
	public Employee(int employeeID, String employeeName, double salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		return this.getEmployeeID()-e.getEmployeeID();//Ascending arder
	}
	@Override
	public String toString() {
		return "Employee [age=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}		
}

class IdComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e1.getEmployeeID()-e2.getEmployeeID();
	}
	
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e1.getEmployeeName().compareTo(e2.getEmployeeName());
	}
	
}

public class ComparatorMain {
	private static final ArrayList<Employee> Collectons = null;

	public static void main(String[] args) {
		List<Employee> list = new ArrayList();
		list.add(new Employee(35,"Mayur Deshmukh",150000));
		list.add(new Employee(38,"Devanand Sinkar",150000));
		list.add(new Employee(31,"Ankit Nimbolkar",150000));
		list.add(new Employee(336,"Rahul Gundre",150000));
		
		System.out.println("Sorting by ID:");  
		  
		Collections.sort(list,new IdComparator());  
		Iterator itr1 = list.iterator();
		while(itr1.hasNext()) {
			Employee e = (Employee) itr1.next();
			System.out.println(e);
		}
		System.out.println("\nSorting by Name:");  
		Collections.sort(list,new NameComparator());  
		ListIterator lItr = list.listIterator();
		while(lItr.hasNext()) {
			Employee e = (Employee) lItr.next();
			System.out.println(e);
		}
	}

}
