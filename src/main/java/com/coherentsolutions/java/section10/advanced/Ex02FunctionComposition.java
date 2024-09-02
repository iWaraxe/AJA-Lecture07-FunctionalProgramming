package com.coherentsolutions.java.section10.advanced;

import java.util.function.Function;

/**
 * Demonstrates function composition using the andThen() and compose() methods.
 * Shows how to combine functions to create more complex operations.
 */
public class Ex02FunctionComposition {

    public static void main(String[] args) {
        // Function to convert a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // Function to add an exclamation mark
        Function<String, String> addExclamation = s -> s + "!";

        // Function composition using andThen()
        Function<String, String> shout = toUpperCase.andThen(addExclamation);
        System.out.println(shout.apply("hello")); // Output: HELLO!

        // Function composition using compose()
        Function<String, String> shoutWithCompose = addExclamation.compose(toUpperCase);
        System.out.println(shoutWithCompose.apply("hello")); // Output: HELLO!
    }
}
