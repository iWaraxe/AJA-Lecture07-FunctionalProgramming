package com.coherentsolutions.java.section22;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;

/**
 * Demonstrates different types of lambda expressions based on the number of parameters and the complexity of the body.
 */
public class Ex02LambdaExpressionTypes {

    public static void main(String[] args) {
        // Zero-argument lambda expression
        Runnable sayHello = () -> System.out.println("Hello, World!");
        sayHello.run(); // Output: Hello, World!

        // Single-argument lambda expression
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Square of 4: " + square.apply(4)); // Output: Square of 4: 16

        // Multi-argument lambda expression
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Product of 3 and 7: " + multiply.apply(3, 7)); // Output: Product of 3 and 7: 21

        // Lambda with a block of code
        BiFunction<Integer, Integer, Integer> max = (a, b) -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        };
        System.out.println("Max of 3 and 7: " + max.apply(3, 7)); // Output: Max of 3 and 7: 7
    }
}
