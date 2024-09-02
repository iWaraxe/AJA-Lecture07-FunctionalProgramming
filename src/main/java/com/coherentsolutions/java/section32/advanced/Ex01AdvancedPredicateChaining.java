package com.coherentsolutions.java.section32.advanced;

import java.util.function.Predicate;

/**
 * Demonstrates advanced usage of the Predicate functional interface by chaining multiple predicates.
 * Predicate chaining allows for combining multiple conditions into a single logic check.
 */
public class Ex01AdvancedPredicateChaining {

    public static void main(String[] args) {
        // Predicate to check if a string is longer than 5 characters
        Predicate<String> isLongerThanFive = s -> s.length() > 5;

        // Predicate to check if a string starts with 'H'
        Predicate<String> startsWithH = s -> s.startsWith("H");

        // Combining predicates using and()
        Predicate<String> combinedPredicate = isLongerThanFive.and(startsWithH);

        // Test the combined predicate
        System.out.println(combinedPredicate.test("Hello")); // false (not longer than 5)
        System.out.println(combinedPredicate.test("Hello, World!")); // true (longer than 5 and starts with 'H')
        System.out.println(combinedPredicate.test("Hi there!")); // true (longer than 5 and starts with 'H')
    }
}
