package com.coherentsolutions.java.section25;

/**
 * Refactors the Runnable example to use a lambda expression for creating a thread.
 */
public class Ex03RunnableExampleRefactored {

    public static void main(String[] args) {
        // Creating a thread with a Runnable using a lambda expression
        Thread thread = new Thread(() -> System.out.println("Thread is running... (Lambda expression)"));

        thread.start();
    }
}
