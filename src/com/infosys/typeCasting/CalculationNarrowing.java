package com.infosys.typeCasting;

// Narrowing conversion requires explicit type casting
public class CalculationNarrowing {

    public static void main(String[] args) {

        double d = 234567890.04;

        long l = (long)d; // explicit type

        int i = (int)l; // explicit type

        short s = (short) i; // explicit type

        System.out.println("double value: " +d);
        System.out.println("long value: " +l);
        System.out.println("int value: " +i);
        System.out.println("short value: " +s);

    }

}
