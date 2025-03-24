package com.exception;

import java.io.FileNotFoundException;

public class ThrowsDemo {
static void meth()throws ArithmeticException, FileNotFoundException
{
	System.out.println("welcome to meth");	
	throw new FileNotFoundException("demo");
		
	}
	public static void main(String args[])
	{
		try {
			meth();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
	}
}