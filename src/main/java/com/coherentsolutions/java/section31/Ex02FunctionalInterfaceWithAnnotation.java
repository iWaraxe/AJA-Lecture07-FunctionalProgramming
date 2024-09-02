package com.coherentsolutions.java.section31;

/**
 * Demonstrates the use of the @FunctionalInterface annotation in Java.
 * This annotation is used to indicate that an interface is intended to be a functional interface.
 */
@FunctionalInterface
interface Calculator {
    int add(int a, int b); // Single abstract method
}

// Example usage of the Calculator functional interface
public class Ex02FunctionalInterfaceWithAnnotation {

    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression
        Calculator calculator = (a, b) -> a + b;
        int result = calculator.add(5, 3);
        System.out.println("Result of addition: " + result); // Output: Result of addition: 8
    }
}
