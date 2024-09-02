package com.coherentsolutions.java.section24;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the use of method references to improve readability and reduce verbosity in lambda expressions.
 */
public class Ex02UseMethodReferences {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // Using a lambda expression with forEach
        names.forEach(name -> System.out.println(name));

        // Using a method reference to simplify the lambda expression
        names.forEach(System.out::println);
    }
}
