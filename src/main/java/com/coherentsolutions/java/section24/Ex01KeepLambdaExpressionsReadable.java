package com.coherentsolutions.java.section24;

import java.util.Comparator;

/**
 * Demonstrates best practices for keeping lambda expressions concise and readable.
 * Shows how to refactor complex lambda expressions into simpler, more readable code.
 */
public class Ex01KeepLambdaExpressionsReadable {

    public static void main(String[] args) {
        // Example of a complex lambda expression
        Comparator<Employee> complexComparator = (e1, e2) -> {
            if (!e1.getDepartment().equals(e2.getDepartment())) {
                return e1.getDepartment().compareTo(e2.getDepartment());
            } else if (e1.getSalary() != e2.getSalary()) {
                return Integer.compare(e1.getSalary(), e2.getSalary());
            } else {
                return e1.getName().compareTo(e2.getName());
            }
        };

        // Refactored version for readability
        Comparator<Employee> departmentComparator = Comparator.comparing(Employee::getDepartment);
        Comparator<Employee> salaryComparator = Comparator.comparingInt(Employee::getSalary);
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);

        Comparator<Employee> refactoredComparator = departmentComparator
                .thenComparing(salaryComparator)
                .thenComparing(nameComparator);

        // Example usage
        // List<Employee> employees = ...;
        // Collections.sort(employees, refactoredComparator);
    }
}

// Dummy Employee class for demonstration purposes
class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
