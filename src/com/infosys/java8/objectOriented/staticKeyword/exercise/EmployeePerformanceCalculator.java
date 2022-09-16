package com.infosys.java8.objectOriented.staticKeyword.exercise;

import java.util.Random;

public class EmployeePerformanceCalculator {
    public static void main(String[] args) {
        Random rand = new Random();

        Employee E1 = new Employee(rand.nextInt(100) + 1);
        System.out.printf("Employee A's Points: %d", E1.getPoints());
        System.out.println("\nEmployee A's Rating: %d\n\n" +
                PerformanceRating.calculatePerformance(E1));

        Employee E2 = new Employee(rand.nextInt(100) + 1);
        System.out.printf("Employee B's Points: %d", E2.getPoints());
        System.out.println("\nEmployee B's Rating:  %d"  +
                PerformanceRating.calculatePerformance(E2));

        Employee E3 = new Employee(rand.nextInt(100) + 1);
        System.out.printf("Employee C's Points: %d", E3.getPoints());
        System.out.println("\nEmployee C's Rating: %d" +
                PerformanceRating.calculatePerformance(E3));
    }
}
