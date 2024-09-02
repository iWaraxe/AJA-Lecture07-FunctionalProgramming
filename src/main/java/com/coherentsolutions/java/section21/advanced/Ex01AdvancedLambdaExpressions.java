package com.coherentsolutions.java.section21.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Demonstrates advanced usage of lambda expressions, including composing functions
 * and using higher-order functions.
 */
public class Ex01AdvancedLambdaExpressions {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Mike", "Xavier", "John");

        // Advanced Function Composition
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addExclamation = name -> name + "!";

        // Compose functions using andThen (applies toUpperCase first, then addExclamation)
        Function<String, String> shout = toUpperCase.andThen(addExclamation);

        // Applying the composed function to the list
        List<String> shoutedNames = names.stream()
                .map(shout)
                .collect(Collectors.toList());
        System.out.println("Shouted Names: " + shoutedNames);

        // Higher-order function example: BiFunction to combine two names
        BiFunction<String, String, String> combineNames = (first, second) -> first + " & " + second;

        // Demonstrate combining names
        String combined = combineNames.apply("Anna", "Elsa");
        System.out.println("Combined Names: " + combined); // Output: Anna & Elsa
    }
}
