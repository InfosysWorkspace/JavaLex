package com.infosys.java8.objectOriented.exceptionClass;

public class Except {
    public static void divide(int x, int y){
        int z = x/y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        divide(10, 0);
    }
}
