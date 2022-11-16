package com.infosys.java11.keywordAndDatatype.exercise;


// A program to convert temperatures from Fahrenheit to Celsius
// To do: Add code to convert the temperature to Kelvin

public class DataTypeDemo {

    public static void main(String[] args) {

        double fahrenheit = 212.0;
        double celsius;
        double kelvin;

        // Farenheit to Celsius
        celsius = ((5 * (fahrenheit - 32)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " +celsius+ " in Celsius.");

        // Farenheit to Kelvin
        kelvin = ((5 *(fahrenheit + 495.67)) / 9.0);

        // round to two decimal places
        kelvin = Math.round(kelvin * 100.0) / 100.0;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " +kelvin+ " in Kelvin.");





    }

}
