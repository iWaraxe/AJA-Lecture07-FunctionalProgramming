package com.coherentsolutions.java.section22.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Demonstrates advanced lambda features, such as using lambdas with built-in functional interfaces
 * like Predicate, and combining multiple predicates.
 */
public class Ex01AdvancedLambdaFeatures {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");

        // Using Predicate with a lambda expression
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> lengthGreaterThanThree = s -> s.length() > 3;

        // Combining predicates
        Predicate<String> complexCondition = startsWithA.or(lengthGreaterThanThree);

        // Filtering list with combined condition
        names.stream()
                .filter(complexCondition)
                .forEach(System.out::println); // Output: Anna
    }
}
