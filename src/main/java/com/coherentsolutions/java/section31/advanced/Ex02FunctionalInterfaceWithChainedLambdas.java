package com.coherentsolutions.java.section31.advanced;

import java.util.function.Function;

/**
 * Demonstrates the chaining of lambda expressions using functional interfaces.
 * This example shows how to combine multiple lambdas to perform complex operations.
 */
public class Ex02FunctionalInterfaceWithChainedLambdas {

    public static void main(String[] args) {
        // Function to trim whitespace
        Function<String, String> trim = String::trim;

        // Function to convert to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // Function to add a suffix
        Function<String, String> addSuffix = input -> input + "!!!";

        // Chain the functions together
        Function<String, String> chainedFunction = trim.andThen(toUpperCase).andThen(addSuffix);

        // Apply the chained function
        String result = chainedFunction.apply("   hello world   ");
        System.out.println("Chained Result: " + result); // Output: HELLO WORLD!!!
    }
}
