package com.coherentsolutions.java.section33;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Demonstrates how functional interfaces promote declarative programming.
 * Uses Predicate to filter a list in a declarative manner.
 */
public class Ex01DeclarativeProgrammingWithPredicate {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Declarative style using Predicate
        Predicate<String> startsWithC = name -> name.startsWith("C");

        // Filtering the list based on the predicate
        List<String> filteredNames = names.stream()
                .filter(startsWithC)
                .collect(Collectors.toList());

        System.out.println("Names starting with 'C': " + filteredNames); // Output: [Charlie]
    }
}
