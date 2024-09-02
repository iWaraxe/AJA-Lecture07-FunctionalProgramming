package com.coherentsolutions.java.section21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demonstrates the basics of lambda expressions in Java.
 * Compares the traditional anonymous class approach with a lambda expression.
 */
public class Ex01LambdaExpressionBasics {

    public static void main(String[] args) {
        // Traditional anonymous class implementation of an ActionListener
        JButton button = new JButton("Click Me");
        ActionListener listenerOld = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked! (Old way)");
            }
        };
        button.addActionListener(listenerOld);

        // Lambda expression implementation of an ActionListener
        ActionListener listenerLambda = e -> System.out.println("Button clicked! (Lambda)");
        button.addActionListener(listenerLambda);

        // Simulate a button click for demonstration purposes
        button.doClick();
    }
}
