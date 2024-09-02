package com.coherentsolutions.java.section10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates the principle of immutability in functional programming.
 * Shows how to create a new list instead of modifying the original list.
 */
public class Ex01ImmutabilityExample {

    public static void main(String[] args) {
        // Original list of fruits
        List<String> originalList = Arrays.asList("apple", "banana", "cherry");

        // Creating a new list by transforming the original list to uppercase
        List<String> newList = originalList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Printing the original and new lists
        System.out.println("Original List: " + originalList);
        System.out.println("New List (Uppercase): " + newList);
    }
}
