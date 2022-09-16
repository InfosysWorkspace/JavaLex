package com.infosys.java8;

public class Account {

    // Instance Variable
    private double balance = 500.00; //state/variable

    // Static Variable
    static int minimumBalance = 200;

    public double getBalance() { // member method

        // Local Variable
        int withdrawal = 500;

        return balance - withdrawal;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public static void main(String[] args) { // main method
        Account account = new Account(); // Object creation
        account.setBalance(123456); //method invocation
        System.out.println(account.balance);
        System.out.println("The balance is: " +account.getBalance());
    }
}
