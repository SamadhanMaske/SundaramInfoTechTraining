package com.polymorphism;

class Base1{
	public void show() {
		System.out.println("Base1 show()");
	}
}

class Derived1 extends Base1{
	public void show() {
		System.out.println("Derived1 show()");
	}
}

class Derived2 extends Base1{
	public void show() {
		System.out.println("Derived2 show()");
	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		Base1 obj;
		obj = new Derived1();
		obj.show();
		obj = new Derived2();
		obj.show();
	}

}
