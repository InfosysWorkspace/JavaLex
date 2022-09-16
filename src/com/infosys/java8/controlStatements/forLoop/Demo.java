package com.infosys.java8.controlStatements.forLoop;

public class Demo {
    public static void main(String[] args) {
        int s = 1;

        for (int x = 0; x <= 10 ; x++){
            System.out.println(x+ " " +s);
            s *= 2;
        }
    }
}
