package ComparableAndComparator;

import java.util.*;

class Student1 implements Comparable<Student1>{  
	int rollno;  
	String name;  
	int age;  
	Student1(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		return name.compareTo(o.name);
	} 
}  

class ComparableDemo{  
public static void main(String args[]){  
	ArrayList<Student1> al=new ArrayList();  
	al.add(new Student1(101,"Vijay",23));  
	al.add(new Student1(106,"Ajay",27));  
	al.add(new Student1(105,"Jai",21));  
  
	Collections.sort(al);  
	//printing using enhanced forloop
	//for(Student1 st:al){  
	//System.out.println(st.rollno+" "+st.name+" "+st.age);  
	//} 
	//System.out.println("printing the list using iterator in forward direction only");
	//   Iterator<Student1>it=al.iterator();
	//   while(it.hasNext())
	//   {
	//	   Student1 obj=it.next();
	//	   System.out.println(obj);
	//   }
	//   
		System.out.println("traversing list iusing listiterator forwards and backward");
		ListIterator<Student1> lt=al.listIterator();
		while(lt.hasNext())
		{
			Student1 obj=lt.next();
			System.out.println(obj);
		}
		System.out.println("printing backwards");
		while(lt.hasPrevious())
		{
			Student1 obj=lt.previous();
			System.out.println(obj);
		}
	}  
} 
