package com.coherentsolutions.java.section32;

import java.util.function.Predicate;

/**
 * Demonstrates the use of the Predicate functional interface.
 * A Predicate takes a single input and returns a boolean value.
 */
public class Ex01PredicateExample {

    public static void main(String[] args) {
        // Predicate to check if a string is longer than 5 characters
        Predicate<String> isLongerThanFive = s -> s.length() > 5;

        // Test the predicate with different inputs
        System.out.println(isLongerThanFive.test("Hello")); // false
        System.out.println(isLongerThanFive.test("Hello, World!")); // true
    }
}
