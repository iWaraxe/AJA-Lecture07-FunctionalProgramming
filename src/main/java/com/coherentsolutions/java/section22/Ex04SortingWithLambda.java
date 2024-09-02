package com.coherentsolutions.java.section22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates how lambda expressions can be used to simplify sorting logic.
 * Shows the difference between using an anonymous inner class and a lambda expression.
 */
public class Ex04SortingWithLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");

        // Sorting with an anonymous inner class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted with anonymous class: " + names);

        // Sorting with a lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted with lambda expression: " + names);
    }
}
