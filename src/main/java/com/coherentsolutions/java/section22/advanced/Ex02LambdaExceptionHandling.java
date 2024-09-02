package com.coherentsolutions.java.section22.advanced;

import java.util.function.Consumer;

/**
 * Demonstrates how to handle exceptions within lambda expressions.
 * Shows the common approach of wrapping lambdas that throw checked exceptions.
 */
public class Ex02LambdaExceptionHandling {

    public static void main(String[] args) {
        // Example of a lambda that could throw an exception
        Consumer<String> printWithExceptionHandling = s -> {
            try {
                if (s == null) {
                    throw new IllegalArgumentException("Input cannot be null");
                }
                System.out.println(s);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        };

        // Test the lambda with valid and invalid input
        printWithExceptionHandling.accept("Hello, world!"); // Output: Hello, world!
        printWithExceptionHandling.accept(null);            // Output: Error: Input cannot be null
    }
}
