package com.coherentsolutions.java.section21.advanced;

import java.util.function.Function;

/**
 * Demonstrates the use of lambda expressions with a custom functional interface.
 * Shows how to create, use, and benefit from custom functional interfaces.
 */
public class Ex02LambdaWithCustomFunctionalInterface {

    public static void main(String[] args) {
        // Using a lambda expression to implement a custom functional interface
        StringOperation addExclamation = s -> s + "!";

        // Applying the custom functional interface
        String result = addExclamation.operate("Hello");
        System.out.println("Result: " + result); // Output: Hello!

        // Another example with the same interface
        Function<String,String> reverseString = s -> new StringBuilder(s).reverse().toString();
        System.out.println("Reversed Result: " + reverseString.apply("Hello")); // Output: olleH
    }

    @FunctionalInterface
    interface StringOperation {
        String operate(String s);
    }
}
