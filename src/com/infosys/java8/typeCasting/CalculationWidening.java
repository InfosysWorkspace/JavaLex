package com.infosys.java8.typeCasting;

public class CalculationWidening {
    public static void main(String[] args) {
        int i = 300;
        long l = i;
        float f = l;


        System.out.println("int value: " +i);
        System.out.println("long value: " +l);
        System.out.println("float value: " +f);


    }
}
