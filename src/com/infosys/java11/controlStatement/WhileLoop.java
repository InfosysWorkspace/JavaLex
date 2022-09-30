package com.infosys.java11.controlStatement;

/*
    Below try out to calculate the sum of all digits in a given number
    using while loop.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int intNumber = 7865;
        int sumOfDigits = 0;
        int temp = 0;

        while(intNumber > 0){
            temp = intNumber % 10;
            sumOfDigits += temp;
            intNumber = intNumber / 10;
        }
        System.out.println("Sum of digits are: " +sumOfDigits);
    }
}
