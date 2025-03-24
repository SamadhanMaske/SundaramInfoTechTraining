package com.hStrings;

import java.util.Scanner;

class ColourCodeValidator {

	public static int validateHexCode(String code) {
        // Regex to match the format #A1BC23
        if (code.matches("#[A-Fa-f0-9]{6}")) {
            return 1; 
        }
        return -1; 
    }

    public static int validateDecimalCode(String code) {
        // Regex to match the format rgb(x,y,z) where x, y, and z are between 0 and 255
        if (code.matches("rgb\\((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]),){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\)")) {
            return 1;
        }
        return -1; 
    }
}
public class DecimalHexadecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.println("Enter hexadecimal colour code:");
            String hexCode = sc.nextLine();
            int result = ColourCodeValidator.validateHexCode(hexCode);
            if (result == 1) {
                System.out.println("Valid Code");
            } else {
                System.out.println("Invalid Code");
            }
        } else if (choice == 2) {
            System.out.println("Enter decimal colour code:");
            String decimalCode = sc.nextLine();
            int result = ColourCodeValidator.validateDecimalCode(decimalCode);
            if (result == 1) {
                System.out.println("Valid Code");
            } else {
                System.out.println("Invalid Code");
            }
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
	}
}
