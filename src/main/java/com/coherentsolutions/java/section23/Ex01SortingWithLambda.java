package com.coherentsolutions.java.section23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates sorting collections with lambda expressions in Java.
 * Compares sorting with an anonymous inner class versus a lambda expression.
 */
public class Ex01SortingWithLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Sorting a list using an anonymous inner class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted with anonymous class: " + names);

        // Sorting a list using a lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted with lambda expression: " + names);

        // Further simplification using a method reference
        Collections.sort(names, String::compareTo);
        System.out.println("Sorted with method reference: " + names);
    }
}
