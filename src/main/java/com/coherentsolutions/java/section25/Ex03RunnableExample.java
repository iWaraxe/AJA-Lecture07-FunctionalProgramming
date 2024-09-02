package com.coherentsolutions.java.section25;

/**
 * Demonstrates how to create a thread using an anonymous inner class to implement Runnable, and then refactors it using a lambda expression.
 */
public class Ex03RunnableExample {

    public static void main(String[] args) {
        // Creating a thread with a Runnable using an anonymous inner class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running... (Anonymous inner class)");
            }
        });

        thread.start();
    }
}
