package com.coherentsolutions.java.section25;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Refactors the button click example to use a lambda expression for handling the button click event.
 */
public class Ex01ButtonClickExampleRefactored {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        JButton button = new JButton("Click Me");

        // Adding ActionListener using a lambda expression
        button.addActionListener(e -> System.out.println("Button clicked! (Lambda expression)"));

        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
