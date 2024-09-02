package com.coherentsolutions.java.section22;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Demonstrates the basic syntax and structure of lambda expressions in Java.
 * Shows how to use lambda expressions with no parameters, one parameter, and multiple parameters.
 */
public class Ex01LambdaBasicSyntax {

    public static void main(String[] args) {
        // Example 1: Lambda expression with no parameters
        Runnable task = () -> System.out.println("Task executed!");
        task.run(); // Output: Task executed!

        // Example 2: Lambda expression with one parameter
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        greet.accept("Alice"); // Output: Hello, Alice!

        // Example 3: Lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(5, 10)); // Output: Sum: 15
    }
}
