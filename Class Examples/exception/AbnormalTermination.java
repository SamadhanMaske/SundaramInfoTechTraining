package com.exception;

import java.util.Scanner;

public class AbnormalTermination {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try {
		int d=42/a;
		System.out.println(d);
		int arr[]= {1,2,3};
		System.out.println(arr[4]);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array"+e);
			
		}
		catch(Exception e) {
			System.out.println("Array"+e);
			
		}
		
		System.out.println("hello");
	}

}
