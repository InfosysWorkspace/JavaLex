package com.infosys.java11.controlStatement;

/* The code given below checks whether a given number is even or odd
    using if-else block. Execute the code by assigning different values
    to number variable.
*/

public class IfElse {
    public static void main(String[] args) {
        int number = 5;

        if(number % 2 == 0){
            System.out.println(number + " is even.");
        }else {
            System.out.println(number + " is odd.");
        }
    }
}
