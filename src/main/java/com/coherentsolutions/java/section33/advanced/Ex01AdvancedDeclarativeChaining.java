package com.coherentsolutions.java.section33.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Demonstrates advanced usage of declarative programming by chaining multiple Predicates.
 * Filters a list using complex conditions.
 */
public class Ex01AdvancedDeclarativeChaining {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Catherine");

        // Chaining multiple predicates
        Predicate<String> startsWithC = name -> name.startsWith("C");
        Predicate<String> longerThan5 = name -> name.length() > 5;

        // Combining predicates using and()
        List<String> filteredNames = names.stream()
                .filter(startsWithC.and(longerThan5))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'C' and longer than 5 characters: " + filteredNames);
        // Output: [Catherine, Charlie]
    }
}
