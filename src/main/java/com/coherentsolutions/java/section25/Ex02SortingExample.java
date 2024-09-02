package com.coherentsolutions.java.section25;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates how to sort a list using an anonymous inner class and then refactors it using a lambda expression.
 */
public class Ex02SortingExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Sorting using an anonymous inner class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(names); // Output: [Alice, Bob, Charlie]
    }
}
