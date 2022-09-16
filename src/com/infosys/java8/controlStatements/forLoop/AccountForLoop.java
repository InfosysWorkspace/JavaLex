package com.infosys.java8.controlStatements.forLoop;

public class AccountForLoop {
    public static void main(String[] args) {
        double balance = 6000;
        double rateOfInterest = 0.10;
        double interest = 0;
        double withdrawal = 500;
        double deposit = 600;

        System.out.println("\nOutput: \n");

        for(int i = 1; i <= 12; ++i){
            balance += deposit;
            balance -= withdrawal;
            interest = balance * rateOfInterest;
            balance += interest;

            System.out.println("The interest for the month "
                    + i + " is " +interest);
        }

        System.out.println("The balance at the end of the year is " +balance);
    }
}
