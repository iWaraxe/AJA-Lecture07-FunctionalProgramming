package com.coherentsolutions.java.section21;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Demonstrates how lambda expressions enhance readability and support functional programming.
 * Focuses on reducing clutter and emphasizing business logic.
 */
public class Ex03LambdaReadabilityAndFunctionalProgramming {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Mike", "Xavier", "John");

        // Using a lambda expression to transform and print the list
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Display the transformed list
        System.out.println("Uppercase Names: " + uppercaseNames);

        // Lambda expression to add an exclamation mark to each name
        Function<String, String> addExclamation = name -> name + "!";

        // Applying the function using map and printing the results
        List<String> excitedNames = names.stream()
                .map(addExclamation)
                .collect(Collectors.toList());
        System.out.println("Excited Names: " + excitedNames);
    }
}
