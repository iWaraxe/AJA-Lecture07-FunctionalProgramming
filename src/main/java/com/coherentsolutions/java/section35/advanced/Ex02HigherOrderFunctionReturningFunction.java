package com.coherentsolutions.java.section35.advanced;

import com.coherentsolutions.java.section35.Transaction;

import java.util.function.Function;

/**
 * Demonstrates a higher-order function that returns another function.
 * This allows creating customizable and reusable operations.
 */
public class Ex02HigherOrderFunctionReturningFunction {

    public static void main(String[] args) {
        // Create a transaction
        Transaction transaction = new Transaction(1000);

        // Get a customized operation function using a higher-order function
        Function<Transaction, Double> discountThenTax = createCustomOperation(0.10, 0.15);

        // Apply the customized operation
        double finalAmount = discountThenTax.apply(transaction);
        System.out.println("Final Amount after custom operation: " + finalAmount);
        // Output: Final Amount after custom operation: 850.0
    }

    // Higher-order function that returns a function applying a discount and then tax
    public static Function<Transaction, Double> createCustomOperation(double discountRate, double taxRate) {
        return t -> {
            double discountedAmount = t.getAmount() * (1 - discountRate);
            return discountedAmount * (1 + taxRate);
        };
    }
}
