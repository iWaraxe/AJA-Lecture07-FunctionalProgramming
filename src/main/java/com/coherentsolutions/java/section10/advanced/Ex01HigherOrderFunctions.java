package com.coherentsolutions.java.section10.advanced;

import java.util.function.Function;

/**
 * Demonstrates the concept of higher-order functions in functional programming.
 * Shows how a function can take another function as an argument and return a function.
 */
public class Ex01HigherOrderFunctions {

    public static void main(String[] args) {
        // Higher-order function that returns a function to add a prefix
        Function<String, Function<String, String>> addPrefix = prefix -> name -> prefix + " " + name;

        // Using the higher-order function
        Function<String, String> addMr = addPrefix.apply("Mr.");
        System.out.println(addMr.apply("John Doe")); // Output: Mr. John Doe
    }
}
