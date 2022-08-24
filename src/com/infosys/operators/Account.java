package com.infosys.operators;

public class Account {
    public static void main(String[] args) {
        double balance = 2000;
        System.out.println("Amount to withdraw");

        double amount = 500, limit = 10000, minbal = 500;

        if(amount <= limit && (balance - amount)  > minbal){
              // if 500 is less than 10000 AND (2000 - 500) is greater than 500
            balance -= amount;
            // balance = 2000 - 500 = 1500

            System.out.println("Withdrawal has succeeded");
        }
    }
}
