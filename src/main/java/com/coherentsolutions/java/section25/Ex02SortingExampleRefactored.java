package com.coherentsolutions.java.section25;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Refactors the sorting example to use a lambda expression for sorting the list.
 */
public class Ex02SortingExampleRefactored {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Sorting using a lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println(names); // Output: [Alice, Bob, Charlie]
    }
}
