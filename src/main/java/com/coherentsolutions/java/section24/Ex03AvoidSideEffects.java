package com.coherentsolutions.java.section24;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates best practices for avoiding side effects in lambda expressions.
 * Shows how to keep lambdas pure and side-effect free.
 */
public class Ex03AvoidSideEffects {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Example of a lambda expression with a side effect
        int[] counter = {0};
        names.forEach(name -> counter[0]++);
        System.out.println("Number of names: " + counter[0]);


        // Better approach: Use a pure function
        long count = names.stream().count();
        System.out.println("Number of names: " + count);
    }
}
