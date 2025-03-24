package com.exception;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in);
                		FileOutputStream fos=new FileOutputStream("c:/a.txt")) {
            System.out.print("Enter your name: ");
            String name = scanner.next();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        } 
        
    }
}