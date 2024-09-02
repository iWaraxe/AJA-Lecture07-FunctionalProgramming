package com.coherentsolutions.java.section31.advanced;

/**
 * Demonstrates the flexibility of functional interfaces by using multiple lambdas
 * to implement different behaviors for the same functional interface.
 */
@FunctionalInterface
interface StringOperation {
    String operate(String input); // Single abstract method
}

// Example usage of the StringOperation functional interface with multiple lambdas
public class Ex01FunctionalInterfaceWithMultipleLambdas {

    public static void main(String[] args) {
        // Lambda to convert a string to uppercase
        StringOperation toUpperCase = input -> input.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.operate("hello")); // Output: HELLO

        // Lambda to reverse a string
        StringOperation reverse = input -> new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reverse.operate("hello")); // Output: olleh

        // Lambda to concatenate a suffix
        StringOperation addSuffix = input -> input + " World!";
        System.out.println("With Suffix: " + addSuffix.operate("Hello")); // Output: Hello World!
    }
}
