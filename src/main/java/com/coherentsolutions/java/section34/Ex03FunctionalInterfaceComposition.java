package com.coherentsolutions.java.section34;

/**
 * Demonstrates composing multiple custom functional interfaces to create complex operations.
 */
public class Ex03FunctionalInterfaceComposition {

    public static void main(String[] args) {
        Transaction transaction = new Transaction(1000);

        // Define individual operations using lambda expressions
        TransactionOperation taxCalculation = t -> t.getAmount() * 0.15;
        TransactionOperation discountCalculation = t -> t.getAmount() * 0.10;

        // Compose the operations
        TransactionOperation combinedOperation = t -> {
            double tax = taxCalculation.apply(t);
            double discount = discountCalculation.apply(t);
            return t.getAmount() + tax - discount;
        };

        double finalAmount = combinedOperation.apply(transaction);
        System.out.println("Final Amount after Tax and Discount: " + finalAmount);
        // Output: Final Amount after Tax and Discount: 1050.0
    }
}
