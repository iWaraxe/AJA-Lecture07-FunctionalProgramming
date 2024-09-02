package com.coherentsolutions.java.section22;

import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Demonstrates how lambda expressions can replace anonymous inner classes.
 * Focuses on reducing boilerplate code and enhancing readability.
 */
public class Ex03ReplacingAnonymousClassWithLambda {

    public static void main(String[] args) {
        // Example 1: Replacing an anonymous inner class for an ActionListener

        // Before lambda (Anonymous inner class)
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // With lambda
        button.addActionListener(e -> System.out.println("Button clicked!"));

        // Example 2: Replacing an anonymous inner class in a Timer

        // Before lambda (Anonymous inner class)
        Timer timerOld = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Current time: " + new Date());
            }
        });
        timerOld.start();

        // With lambda
        Timer timerLambda = new Timer(1000, e -> System.out.println("Current time: " + new Date()));
        timerLambda.start();

        // Keeping the program running to observe timer output
        try {
            Thread.sleep(5000); // Run for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
