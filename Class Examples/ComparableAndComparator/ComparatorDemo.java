package ComparableAndComparator;

import java.util.*;
class Student12{  
	int rollno;  
	String name;  
	int age;  
	Student12(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	}  
	
class AgeComparator2 implements Comparator{  
	public int compare(Object o1,Object o2){  
		Student12 s1=(Student12)o1;  
		Student12 s2=(Student12)o2;  
		return s1.age-s2.age; 
	}  
}  
	
	
class NameComparator2 implements Comparator{  
	public int compare(Object o1,Object o2){  
		Student12 s1=(Student12)o1;  
		Student12 s2=(Student12)o2;  
		  
		return s1.name.compareTo(s2.name);  
	}  
}  

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();  
		al.add(new Student12(101,"Vijay",23));  
		al.add(new Student12(106,"Ajay",27));  
		al.add(new Student12(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator2());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			Student12 st=(Student12)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator2());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
			Student12 st=(Student12)itr2.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		  
	  }  
}