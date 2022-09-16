package com.infosys.java8.controlStatements.whileLoop;

import java.util.Scanner;

public class AccountWhileLoop {
    public static void main(String[] args) {

        double balance = 0,
                minbal = 500,
                depositAmt =0;

        Scanner sc  = new Scanner(System.in);

        while(depositAmt < minbal){
            System.out.println("Enter amount to be deposited");
            depositAmt = sc.nextInt();

        }
        balance = depositAmt;
        System.out.println("Your deposit was successful");
    }
}
