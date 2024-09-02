package com.coherentsolutions.java.section32.advanced;

import java.util.function.Function;

/**
 * Demonstrates advanced usage of the Function functional interface by composing multiple functions.
 * Function composition allows for chaining transformations in a sequence.
 */
public class Ex02AdvancedFunctionComposition {

    public static void main(String[] args) {
        // Function to trim whitespace
        Function<String, String> trim = String::trim;

        // Function to convert a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // Function to add a suffix
        Function<String, String> addSuffix = s -> s + "!!!";

        // Compose the functions to create a single operation
        Function<String, String> composedFunction = trim.andThen(toUpperCase).andThen(addSuffix);

        // Apply the composed function
        String result = composedFunction.apply("  hello world  ");
        System.out.println("Composed Result: " + result); // Output: HELLO WORLD!!!
    }
}
