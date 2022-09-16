package com.infosys.java8.controlStatements.ifElse;

public class AccountIfElse {
    public static void main(String[] args) {
        double balance = 600;
        System.out.println("Amount to withdraw");

        double amount = 500;
        //Condition
        if(amount <= 0){
            System.out.println("Withdrawal has failed as the Amount is Negative");// if result is true
        } else if (amount > balance) {
            System.out.println("Withdrawal has failed as the balance is low");
        } else {
            balance -= amount; // if result is false

            System.out.println("Withdrawal has succeeded your balance is: "
                    +balance);
        }
    }
}
