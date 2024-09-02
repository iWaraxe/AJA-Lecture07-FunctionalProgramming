package com.coherentsolutions.java.section24.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Demonstrates how to handle exceptions in lambda expressions.
 * Shows how to wrap lambda expressions that may throw checked exceptions.
 */
public class Ex02HandlingExceptionsInLambdas {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", null);

        // Example of handling exceptions within a lambda
        Consumer<String> printWithExceptionHandling = name -> {
            try {
                if (name == null) {
                    throw new IllegalArgumentException("Name cannot be null");
                }
                System.out.println(name);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        };

        names.forEach(printWithExceptionHandling);
    }
}
