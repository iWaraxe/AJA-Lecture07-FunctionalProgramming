package com.coherentsolutions.java.section34;


public class Ex01SimpleCustomFunctionalInterface {

    public static void main(String[] args) {
        Transaction transaction = new Transaction(1000);

        // Using a lambda expression to implement the TransactionOperation interface
        TransactionOperation taxCalculation = t -> t.getAmount() * 0.15;

        double tax = taxCalculation.apply(transaction);
        System.out.println("Tax: " + tax); // Output: Tax: 150.0
    }
}
