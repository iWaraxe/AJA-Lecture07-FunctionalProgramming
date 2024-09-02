package com.coherentsolutions.java.section35;

import java.util.function.Function;

/**
 * Demonstrates function composition using the Function interface to apply tax and discount.
 */
/**
 * Demonstrates function composition using the Function interface to apply tax and discount.
 */
public class Ex02FunctionCompositionWithTaxAndDiscount {

    public static void main(String[] args) {
        Transaction transaction = new Transaction(1000);

        // Define individual functions for tax and discount
        Function<Transaction, Double> taxCalculation = t -> t.getAmount() * 0.15;
        Function<Transaction, Double> discountCalculation = t -> t.getAmount() * 0.10;

        // Compose the functions to first apply tax, then apply the discount
        Function<Transaction, Double> combinedOperation = taxCalculation
                .andThen(taxAmount -> taxAmount - discountCalculation.apply(transaction));

        // Apply the composed function
        double finalAmount = transaction.getAmount() + combinedOperation.apply(transaction);

        System.out.println("Final Amount after Tax and Discount: " + finalAmount);
        // Output: Final Amount after Tax and Discount: 1050.0
    }
}
