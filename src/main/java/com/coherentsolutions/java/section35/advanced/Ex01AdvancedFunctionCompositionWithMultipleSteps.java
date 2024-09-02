package com.coherentsolutions.java.section35.advanced;

import com.coherentsolutions.java.section35.Transaction;

import java.util.function.Function;

/**
 * Demonstrates advanced function composition with multiple steps.
 * Shows how to build a pipeline of operations to transform a transaction.
 */
public class Ex01AdvancedFunctionCompositionWithMultipleSteps {

    public static void main(String[] args) {
        Transaction transaction = new Transaction(1000);

        // Define individual functions for tax, discount, and additional fee
        Function<Transaction, Double> taxCalculation = t -> t.getAmount() * 0.15;
        Function<Double, Double> discountCalculation = amount -> amount * 0.90; // 10% discount
        Function<Double, Double> feeAddition = amount -> amount + 50.0;

        // Compose the functions into a single operation pipeline
        Function<Transaction, Double> combinedOperation = taxCalculation
                .andThen(discountCalculation)
                .andThen(feeAddition);

        // Apply the composed function
        double finalAmount = combinedOperation.apply(transaction);
        System.out.println("Final Amount after applying all operations: " + finalAmount);
        // Output: Final Amount after applying all operations: 185.0 (calculated as 1000*0.15*0.90 + 50)
    }
}