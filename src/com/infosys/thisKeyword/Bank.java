package com.infosys.thisKeyword;

public class Bank {

    // Instance variable
    private String bankName;
    private String area;
    private String phoneNumber;

    // Parameterized constructor
    Bank(String bankName, String area, String phoneNumber){
        // "This" keyword is used to assign the value
        // for instance variable
        this.bankName = bankName;
        this.area = area;
        this.phoneNumber = phoneNumber;
    }

    void displayBankDetails(){
        System.out.println("Bank name: " +bankName);
        System.out.println("Area of bank: " +area);
        System.out.println("Phone number of the bank: " +bankName);
    }

    public static void main(String[] args) {

        // call the parameterized constructor
        Bank bank = new Bank("Bsoft Bank",
                "Wash-Baltimore Area", "8001234567");

        bank.displayBankDetails();

    }
}
