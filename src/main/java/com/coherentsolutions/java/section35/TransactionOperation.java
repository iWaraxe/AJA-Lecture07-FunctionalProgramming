package com.coherentsolutions.java.section35;

/**
 * Demonstrates a simple higher-order function that takes a TransactionOperation
 * as an argument and applies it to a Transaction.
 */
@FunctionalInterface
public interface TransactionOperation {
    double apply(Transaction transaction);
}
