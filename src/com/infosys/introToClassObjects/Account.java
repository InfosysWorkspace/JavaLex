package com.infosys.introToClassObjects;

public class Account {

    private double balance = 500.00; //state/variable

    public double getBalance(int accountId) { // member method
        //logic here
        return balance;
    }

    public static void main(String[] args) { // main method
        Account account = new Account(); // Object creation
        double value = account.getBalance(123456); //method invocation
        System.out.println("The balance is: " +value);
    }
}
