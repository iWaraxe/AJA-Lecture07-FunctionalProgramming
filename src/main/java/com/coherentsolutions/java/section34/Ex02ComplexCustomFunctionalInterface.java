package com.coherentsolutions.java.section34;



public class Ex02ComplexCustomFunctionalInterface {

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(1000);
        Transaction transaction2 = new Transaction(500);

        // Using a lambda expression to implement the BiTransactionOperation interface
        BiTransactionOperation mergeTransactions = (t1, t2) -> {
            double combinedAmount = t1.getAmount() + t2.getAmount();
            return new Transaction(combinedAmount);
        };

        Transaction combinedTransaction = mergeTransactions.apply(transaction1, transaction2);
        System.out.println("Combined Transaction: " + combinedTransaction);
        // Output: Combined Transaction: Transaction{amount=1500.0}
    }
}
