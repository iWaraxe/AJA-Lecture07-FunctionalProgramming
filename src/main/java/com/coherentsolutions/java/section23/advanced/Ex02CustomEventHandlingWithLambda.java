package com.coherentsolutions.java.section23.advanced;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demonstrates custom event handling with lambda expressions in Java.
 * Shows how to handle more complex events using lambda expressions.
 */
public class Ex02CustomEventHandlingWithLambda {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Event Handling Example");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Handling button click to read and print text field content
        button.addActionListener(e -> {
            String text = textField.getText();
            System.out.println("Text entered: " + text);
        });

        // To close the window automatically after 10 seconds
        new javax.swing.Timer(10000, e -> System.exit(0)).start();
    }
}
