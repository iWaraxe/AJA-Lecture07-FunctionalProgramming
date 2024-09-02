package com.coherentsolutions.java.section32;

import java.util.function.BiFunction;

/**
 * Demonstrates the use of the BiFunction functional interface.
 * A BiFunction takes two inputs and returns a result.
 */
public class Ex05BiFunctionExample {

    public static void main(String[] args) {
        // BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> add = Integer::sum;

        // Apply the BiFunction to different pairs of inputs
        System.out.println(add.apply(5, 3)); // 8
        System.out.println(add.apply(10, 20)); // 30
    }
}
