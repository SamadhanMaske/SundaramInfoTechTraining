package com.March13;

interface inter
{
	public void show(String msg);
	
}

class app12
{
	public void disp(String msg)
	{
		System.out.println(msg.toUpperCase());
	}
	public void disp(String msg,String f)
	{
		System.out.println(msg.toLowerCase()+" "+f.toLowerCase());
	}
}
public class InstanceMethodReference {

	public static void main(String[] args) {
		//using lambda expression
		app12 obj=new app12();
		/*
		inter obj1=(msg)-> obj.disp(msg);
		obj1.show("hello");
		*/
		//using method reference
		inter obj2=obj::disp;
		obj2.show("hello");

	}

}
