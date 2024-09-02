package com.coherentsolutions.java.section35;

public class Ex01HigherOrderFunctionWithDiscount {

    public static void main(String[] args) {
        Transaction transaction = new Transaction(1000);

        // Define a discount calculation operation
        TransactionOperation discountCalculation = t -> t.getAmount() * 0.10;

        // Apply the discount operation to the transaction using a higher-order function
        double discount = applyTransactionOperation(transaction, discountCalculation);

        System.out.println("Discount: " + discount); // Output: Discount: 100.0
    }

    // Higher-order function that takes a TransactionOperation and applies it to a Transaction
    public static double applyTransactionOperation(Transaction transaction, TransactionOperation operation) {
        return operation.apply(transaction);
    }
}
