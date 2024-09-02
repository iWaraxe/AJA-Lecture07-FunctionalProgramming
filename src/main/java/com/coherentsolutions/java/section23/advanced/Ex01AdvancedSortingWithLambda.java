package com.coherentsolutions.java.section23.advanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates advanced sorting techniques using lambda expressions.
 * Shows how to sort using custom comparators and chained comparisons.
 */
public class Ex01AdvancedSortingWithLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");

        // Sorting by length first, then by alphabetical order
        Collections.sort(names, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));
        System.out.println("Sorted by length, then alphabetically: " + names);

        // Sorting in reverse order using a lambda expression
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted in reverse order: " + names);
    }
}
