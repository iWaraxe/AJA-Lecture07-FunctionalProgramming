package com.coherentsolutions.java.section21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates how lambda expressions can be used to simplify code, particularly for sorting.
 * Compares sorting a list using an anonymous class versus a lambda expression.
 */
public class Ex02LambdaExpressionForSorting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Mike", "Xavier", "John");

        // Sorting a list using an anonymous class
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
    }
}
