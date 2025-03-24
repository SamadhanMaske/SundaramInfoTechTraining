package com.exception;

import java.util.Scanner;

public class NumberValidator {
	
	static void validateNumber(int number) throws IllegalArgumentException, ArithmeticException {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number not allowed!");
        } else if (number == 0) {
            throw new ArithmeticException("Zero is not a valid input!");
        }
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        try {
            validateNumber(number);
            System.out.println("Valid number entered: " + number);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
        	System.out.println("Finnally I will always get executed");
        	sc.close();
        }
    }

}
