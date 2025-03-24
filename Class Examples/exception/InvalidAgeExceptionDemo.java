package com.exception;

class InvalidAgeExceptionDemo
{
	static void checkAge(int age) throws InvalidAgeException
	{
		
		if(age<18)
		{
			throw new InvalidAgeException("sorry!!invalid age");
		}
		else
		{
			System.out.println("valid age");
		}
		
	}
	public  static void main(String args[]) throws InvalidAgeException
	{
		checkAge(17);
	}
			
}
class InvalidAgeException extends Exception {
	 InvalidAgeException (String s)
	 {
		 System.out.println(s);
	 }
}