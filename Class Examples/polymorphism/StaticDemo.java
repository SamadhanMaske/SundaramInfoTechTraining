package com.polymorphism;

class App1{
	int i,j;
	static int k;
	App1(){
		i++;
		j++;
		k++;
	}
	static
	{
		System.out.println("I am static block. Block executes as soon as instance is created");
		//Generally it used to initialize static variables
	}
}

public class StaticDemo {
	public static void main(String args[]) {
		System.out.println("Object is not created yet");
		App1 obj1 = new App1();
		System.out.println("i= "+obj1.i+" j= "+obj1.j+" k= "+obj1.k);
		App1 obj2 = new App1();
		System.out.println("i= "+obj2.i+" j= "+obj2.j+" k= "+App1.k);
		App1 obj3 = new App1();
		System.out.println("i= "+obj3.i+" j= "+obj3.j+" k= "+App1.k);

	}
	
}
