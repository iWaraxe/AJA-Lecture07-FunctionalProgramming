package com.coherentsolutions.java.section10;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Demonstrates Java's evolution towards functional programming.
 * Shows examples of lambda expressions, streams, and the Optional class.
 */
public class Ex04JavaEvolutionTowardsFunctionalProgramming {

    public static void main(String[] args) {
        // Example of a lambda expression using a Predicate
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println("Is 'banana' longer than 5? " + isLongerThan5.test("banana"));

        // Example of a Function that transforms a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println("Uppercase 'apple': " + toUpperCase.apply("apple"));

        // Example of using an Optional to avoid null references
        Optional<String> optionalString = Optional.of("hello");
        optionalString.ifPresent(s -> System.out.println("Optional contains: " + s));

        // Example of a Supplier that provides a default value
        Supplier<String> defaultSupplier = () -> "Default Value";
        System.out.println("Supplier provides: " + defaultSupplier.get());
    }
}
