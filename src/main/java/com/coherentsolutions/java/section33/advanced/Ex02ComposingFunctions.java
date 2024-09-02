package com.coherentsolutions.java.section33.advanced;

import java.util.function.Function;

/**
 * Demonstrates the composition of functions using the Function interface.
 * Combines multiple functions to create a complex transformation.
 */
public class Ex02ComposingFunctions {

    public static void main(String[] args) {
        // Function to convert a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // Function to add a prefix
        Function<String, String> addPrefix = s -> "Prefix_" + s;

        // Compose the functions
        Function<String, String> composedFunction = addPrefix.andThen(toUpperCase);

        // Apply the composed function
        String result = composedFunction.apply("hello");
        System.out.println("Composed Result: " + result); // Output: PREFIX_HELLO
    }
}
