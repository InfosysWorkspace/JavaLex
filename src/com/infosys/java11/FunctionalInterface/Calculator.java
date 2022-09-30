package com.infosys.java11.FunctionalInterface;

public interface Calculator {

    // Verifying abstract method
    int doOperation(int num1, int num2);

    // defining default method
    default boolean checkValues(int num1, int num2){
        return (num1 > 0 && num2 > 0);
    }
}

// defining class implementing interface
class Testie implements Calculator{

    // implementing abstract method
    @Override
    public int doOperation(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Testie();

        // executing default method
        System.out.println(calculator.checkValues(5, 6));

        // executing implemented abstract method
        System.out.println(calculator.doOperation(5, 6));
        }

}