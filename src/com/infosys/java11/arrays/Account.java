package com.infosys.java11.arrays;

public class Account {
    String name;
    long accountNumber;

    void setData(String custName, int accNum){
        this.name = custName;
        this.accountNumber = accNum;
    }

    void display(){
        System.out.println("Name: " +name);
        System.out.println("Account Number " +accountNumber);
    }
}

class Tester1{
    public static void main(String[] args) {
        // creating array of type Account having size 3
        Account accArray[] = new Account[3];

        // first create object of Account
        // and then set the data for each object

        accArray[0] = new Account();
        accArray[0].setData("Ella", 345234);

        accArray[1] = new Account();
        accArray[1].setData("Scarlet", 345270);

        accArray[2] = new Account();
        accArray[2].setData("Harper", 345097);

        System.out.println("Account holder's information");
        System.out.println();
        for(Account account : accArray){
            account.display();
            System.out.println();
        }
    }
}