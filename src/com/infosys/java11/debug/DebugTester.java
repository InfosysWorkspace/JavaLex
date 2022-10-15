package com.infosys.java11.debug;

public class DebugTester {
    public static void main(String[] args) {
        int number1 = -1;
        int number2 = 1;
        System.out.println("Fibonnaci Series:");
        for (int i = 0; i < 6; i++){
            int number3 = number1 + number2;
            System.out.println(number3 + " ");
            number1 = number2;
            number2 = number3;

        }
    }

}
