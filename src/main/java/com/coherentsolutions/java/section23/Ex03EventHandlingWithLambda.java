package com.coherentsolutions.java.section23;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demonstrates handling events with lambda expressions in Java.
 * Compares handling a button click event with an anonymous inner class versus a lambda expression.
 */
public class Ex03EventHandlingWithLambda {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        JButton button = new JButton("Click Me");
        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Handling a button click using an anonymous inner class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked! (Anonymous inner class)");
            }
        });

        // Handling a button click using a lambda expression
        button.addActionListener(e -> System.out.println("Button clicked! (Lambda expression)"));

        // To close the window automatically after 5 seconds
        new javax.swing.Timer(5000, e -> System.exit(0)).start();
    }
}
