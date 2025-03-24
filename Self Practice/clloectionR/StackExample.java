package com.clloectionR;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack); // [Apple, Banana, Cherry]

        // Peek top element
        System.out.println("Top: " + stack.peek()); // Cherry

        // Pop element
        System.out.println("Popped: " + stack.pop()); // Cherry

        // Check if empty
        System.out.println("Is empty? " + stack.empty()); // false

        // Search element
        System.out.println("Position of Banana: " + stack.search("Banana")); // 1 (1-based index)
    }
}

