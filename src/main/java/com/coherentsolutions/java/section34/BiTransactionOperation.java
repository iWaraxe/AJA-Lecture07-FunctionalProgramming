package com.coherentsolutions.java.section34;

/**
 * Demonstrates creating a more complex custom functional interface that takes two parameters.
 */
@FunctionalInterface
public interface BiTransactionOperation {
    Transaction apply(Transaction t1, Transaction t2); // Single abstract method
}