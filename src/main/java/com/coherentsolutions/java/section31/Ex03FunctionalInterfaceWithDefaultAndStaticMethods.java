package com.coherentsolutions.java.section31;

/**
 * Demonstrates that a functional interface can have default and static methods in addition to its single abstract method.
 */
@FunctionalInterface
interface AdvancedCalculator {
    int subtract(int a, int b); // Single abstract method

    // Default method
    default int multiply(int a, int b) {
        return a * b;
    }

    // Static method
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Example usage of the AdvancedCalculator functional interface
public class Ex03FunctionalInterfaceWithDefaultAndStaticMethods {

    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression
        AdvancedCalculator calculator = (a, b) -> a - b;
        int subtractionResult = calculator.subtract(10, 5);
        System.out.println("Result of subtraction: " + subtractionResult); // Output: Result of subtraction: 5

        // Using the default method
        int multiplicationResult = calculator.multiply(10, 5);
        System.out.println("Result of multiplication: " + multiplicationResult); // Output: Result of multiplication: 50

        // Using the static method
        int divisionResult = AdvancedCalculator.divide(10, 2);
        System.out.println("Result of division: " + divisionResult); // Output: Result of division: 5
    }
}
