package com.coherentsolutions.java.section34;

/**
 * Demonstrates creating a simple custom functional interface and using it with a lambda expression.
 */
@FunctionalInterface
public interface TransactionOperation {
    double apply(Transaction transaction); // Single abstract method
}