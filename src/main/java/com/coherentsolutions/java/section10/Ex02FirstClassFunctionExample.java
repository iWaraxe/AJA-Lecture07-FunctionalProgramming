package com.coherentsolutions.java.section10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Demonstrates the concept of first-class functions in functional programming.
 * Shows how to pass a lambda expression as a function argument.
 */
public class Ex02FirstClassFunctionExample {

    public static void main(String[] args) {
        // Original list of fruits
        List<String> originalList = Arrays.asList("apple", "banana", "cherry");

        // Function that adds an exclamation mark to each string
        Function<String, String> addExclamation = s -> s + "!";

        // Transforming the list using the function
        List<String> excitedList = originalList.stream()
                .map(addExclamation)
                .collect(Collectors.toList());

        // Printing the transformed list
        System.out.println("Excited List: " + excitedList);
    }
}
