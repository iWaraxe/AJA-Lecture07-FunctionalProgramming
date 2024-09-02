package com.coherentsolutions.java.section23;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates iterating over collections with lambda expressions in Java.
 * Shows how to use the forEach method with both lambda expressions and method references.
 */
public class Ex02IteratingWithLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Iterating over a list using a traditional for-each loop
        System.out.println("Using traditional for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterating over a list using a lambda expression with forEach
        System.out.println("\nUsing lambda expression with forEach:");
        names.forEach(name -> System.out.println(name));

        // Iterating over a list using a method reference with forEach
        System.out.println("\nUsing method reference with forEach:");
        names.forEach(System.out::println);
    }
}
