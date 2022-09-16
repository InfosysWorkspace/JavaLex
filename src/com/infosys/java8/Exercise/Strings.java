package com.infosys.java8.Exercise;

public class Strings {
    public static void main(String[] args) {
        String firstString = "String";
        StringBuilder secondString = new StringBuilder("String");

        System.out.println(firstString.contains(secondString)); // this
        System.out.println(secondString.equals(firstString));
        System.out.println(firstString.equals(secondString));

    }


}
