package com.coherentsolutions.java.section24.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Demonstrates advanced use of method references in lambda expressions.
 * Shows how to use method references for static methods, instance methods, and constructors.
 */
public class Ex01AdvancedMethodReferences {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Static method reference
        Function<String, Integer> stringToLength = String::length;
        names.stream()
                .map(stringToLength)
                .forEach(System.out::println); // Outputs the lengths of the names

        // Instance method reference on an arbitrary object
        Function<String, String> toUpperCase = String::toUpperCase;
        names.stream()
                .map(toUpperCase)
                .forEach(System.out::println); // Outputs names in uppercase

        // Constructor reference
        List<String> numbers = Arrays.asList("1", "2", "3");
        numbers.stream()
                .map(Integer::new) // Converts strings to integers
                .forEach(System.out::println);
    }
}
