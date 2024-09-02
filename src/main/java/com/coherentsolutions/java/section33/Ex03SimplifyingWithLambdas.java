package com.coherentsolutions.java.section33;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates how functional interfaces combined with lambda expressions simplify code.
 * Refactors a Comparator using lambda expressions.
 */
public class Ex03SimplifyingWithLambdas {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Sorting using a lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names); // Output: [Alice, Bob, Charlie]
    }
}
