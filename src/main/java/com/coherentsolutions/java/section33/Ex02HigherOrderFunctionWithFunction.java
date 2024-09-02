package com.coherentsolutions.java.section33;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Demonstrates how functional interfaces enable higher-order functions.
 * Uses Function as an argument to transform a list of strings.
 */
public class Ex02HigherOrderFunctionWithFunction {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Higher-order function that applies a transformation function to each element in a list
        List<Integer> wordLengths = transformList(words, String::length);

        System.out.println("Word lengths: " + wordLengths); // Output: [5, 6, 6]
    }

    // A higher-order function that applies a given Function to each element of a list
    public static <T, R> List<R> transformList(List<T> list, Function<T, R> function) {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
