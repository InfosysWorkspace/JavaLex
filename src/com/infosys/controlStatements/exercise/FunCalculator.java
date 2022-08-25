package com.infosys.controlStatements.exercise;

import java.util.Scanner;

public class FunCalculator {
    public static void main(String[] args) {
        System.out.println("Select the choice below: "
                + "\n 1. Calculate Armstrong \n 2. Calculate Lucky Number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice from above");
        int Choice = sc.nextInt();
        System.out.println("Enter number: ");
        int number = sc.nextInt();


        switch (Choice) {
            case 1: {
                Armstrong(number);
                break;
            }
            case 2: {
                LuckyNumber(number);
                break;
            }
            default: {
                System.out.println("Oops Invalid");
            }

        }
    }

    public static void Armstrong(int number) {
        int n = number;
        int sum = 0;
        while (n > 0) {
            sum += Math.pow((n % 10), 3);
            n = n / 10;
        }

        if (sum == number) {
            System.out.println("The number " + number + " is An Amrstrong number");
        } else {
            System.out.println("The number " + number + " is not An Armstrong number");
        }

    }

        public static void LuckyNumber(int number){
            int num = number;
            int rev = 0;
            int count = 1;
            int sumEvenPlaces = 0;

            while(num != 0){
                rev = (rev * 10) + (num % 10);
                num /= 10;
            }
            num = rev;
            while (num != 0){
                if( count % 2 == 0){
                    sumEvenPlaces += num % 10;
                }
                num /= 10;
            }
            if(sumEvenPlaces % 9 == 0){
                System.out.println("The number " + number + " is the Lucky Number.");
            } else {
                System.out.println("The number " + number + " is not Lucky Number.");

        }
    }
}