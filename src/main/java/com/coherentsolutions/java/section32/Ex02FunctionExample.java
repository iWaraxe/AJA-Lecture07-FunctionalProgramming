package com.coherentsolutions.java.section32;

import java.util.function.Function;

/**
 * Demonstrates the use of the Function functional interface.
 * A Function takes a single input and returns a result of a different type.
 */
public class Ex02FunctionExample {

    public static void main(String[] args) {
        // Function to calculate the length of a string
        Function<String, Integer> stringLength = s -> s.length();

        // Apply the function to different inputs
        System.out.println(stringLength.apply("Hello")); // 5
        System.out.println(stringLength.apply("Hello, World!")); // 13
    }
}
