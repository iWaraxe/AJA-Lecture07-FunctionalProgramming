package com.coherentsolutions.java.section31;

/**
 * Demonstrates the basic concept of a functional interface in Java.
 * A functional interface contains exactly one abstract method, making it eligible for lambda expressions.
 */
@FunctionalInterface
interface MyFunctionalInterface {
    void execute(); // Single abstract method
}

// Example usage of the MyFunctionalInterface
public class Ex01FunctionalInterfaceBasic {

    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression
        MyFunctionalInterface myFunction = () -> System.out.println("Executing MyFunctionalInterface");
        myFunction.execute(); // Output: Executing MyFunctionalInterface
    }
}
