package com.coherentsolutions.java.section10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates the difference between imperative and functional programming styles.
 * Shows how to filter and transform a list using both styles.
 */
public class Ex03ImperativeVsFunctionalStyle {

    public static void main(String[] args) {
        // Original list of fruits
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // Imperative style: filtering and transforming the list
        List<String> filteredFruitsImperative = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() > 5) {
                filteredFruitsImperative.add(fruit.toUpperCase());
            }
        }
        System.out.println("Filtered Fruits (Imperative): " + filteredFruitsImperative);

        // Functional style: filtering and transforming the list
        List<String> filteredFruitsFunctional = fruits.stream()
                .filter(f -> f.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered Fruits (Functional): " + filteredFruitsFunctional);
    }
}
