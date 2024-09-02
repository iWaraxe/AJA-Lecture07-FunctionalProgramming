package com.coherentsolutions.java.section32;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Demonstrates the use of the Supplier functional interface.
 * A Supplier does not take any input but provides a result.
 */
public class Ex04SupplierExample {

    public static void main(String[] args) {
        // Supplier to generate a random number between 0 and 99
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        // Get random numbers from the supplier
        System.out.println(randomNumberSupplier.get()); // Random number between 0 and 99
        System.out.println(randomNumberSupplier.get()); // Another random number between 0 and 99
    }
}
