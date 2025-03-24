package com.exception;

import java.util.Scanner;

public class StringValidator {
	static void validateInput(String input) throws IllegalArgumentException, RuntimeException {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty!");
        }
        if (input.length() < 5) {
            throw new RuntimeException("Input must be at least 5 characters long!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            validateInput(input);
            System.out.println("Valid input: " + input);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
        	System.out.println("Program ececuted successfully");
        	sc.close();
        }
        
    }

}
