package com.infosys.java8.controlStatements.exercise;

import java.util.Scanner;

public class ReverseCalculator {

    public static void main(String[] args) {
        int number = 27;
        int remainder, revNumber = 0;

        System.out.println("\n======== While Loop =========\n");

        while (number > 0)

        {
            remainder = number % 10; // 7
            number = number /10; // 2
            revNumber = (revNumber * 10) + remainder;

        }

        System.out.println("The reverse number using while is: " + revNumber);

        System.out.println("\n======== For Loop =========\n");

        String str = "", rstr = "";
        int n;
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n = sc.nextInt();
        str = String.valueOf(n);

        for(int i = str.length()-1; i >=0; i--){
            ch = str.charAt(i);
            rstr += ch;
        }
        System.out.println("The reverse number using for is: " +rstr);

    }





}
