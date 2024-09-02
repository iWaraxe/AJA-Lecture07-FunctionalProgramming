package com.coherentsolutions.java.section25;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Demonstrates how to handle a button click using an anonymous inner class and then refactors it using a lambda expression.
 */
public class Ex01ButtonClickExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        JButton button = new JButton("Click Me");

        // Adding ActionListener using an anonymous inner class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked! (Anonymous inner class)");
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
