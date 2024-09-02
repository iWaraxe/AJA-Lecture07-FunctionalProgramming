package com.coherentsolutions.java.section34.advanced;

@FunctionalInterface
interface TransactionOperation {
    double apply(Transaction transaction);

    // Default method for chaining operations
    default TransactionOperation andThen(TransactionOperation after) {
        return t -> this.apply(t) + after.apply(t);
    }
}

class Transaction {
    private double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class Ex01ChainingCustomFunctionalInterfaces {

    public static void main(String[] args) {
        Transaction transaction = new Transaction(1000);

        // Define individual operations using lambda expressions
        TransactionOperation taxCalculation = t -> t.getAmount() * 0.15;
        TransactionOperation discountCalculation = t -> t.getAmount() * 0.10;

        // Chain operations using the andThen default method
        TransactionOperation combinedOperation = taxCalculation.andThen(discountCalculation);

        double finalAmount = transaction.getAmount() + combinedOperation.apply(transaction);
        System.out.println("Final Amount after Tax and Discount: " + finalAmount);
        // Output: Final Amount after Tax and Discount: 1250.0
    }
}
