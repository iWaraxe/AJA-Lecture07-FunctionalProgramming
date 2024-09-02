package com.coherentsolutions.java.section32;

import java.util.function.Consumer;

/**
 * Demonstrates the use of the Consumer functional interface.
 * A Consumer takes a single input and performs an action without returning a result.
 */
public class Ex03ConsumerExample {

    public static void main(String[] args) {
        // Consumer to print a string in uppercase
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        // Accept different inputs
        printUpperCase.accept("hello"); // HELLO
        printUpperCase.accept("world"); // WORLD
    }
}
