package com.coherentsolutions.java.section24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Demonstrates when to use lambda expressions versus other techniques.
 * Highlights the importance of using lambdas for short, simple logic, and named methods for reusable logic.
 */
public class Ex04WhenToUseLambdas {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Al", "Bob");

        // Using a named method for reusable logic
        names.stream()
                .filter(Ex04WhenToUseLambdas::isValidName)
                .forEach(System.out::println);
    }

    // Named method for reusable logic
    public static boolean isValidName(String name) {
        return name != null && name.length() > 2;
    }
}
