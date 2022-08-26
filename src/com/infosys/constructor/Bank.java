package com.infosys.constructor;

public class Bank {
    private String bankName;
    private  String area;
    private String phoneNo;

    Bank(){
        bankName = "BsoftBank";
        area = "DMV area";
        phoneNo = "8005461234";
    }

    Bank(String bName, String bArea, String bPhoneNo){
        bankName = bName;
        area = bArea;
        phoneNo = bPhoneNo;
    }

    void displayBankDetails(){
        System.out.println("Bank Name: " +bankName);
        System.out.println("Area of bank: " +area);
        System.out.println("Phone number of the bank: " +phoneNo);
    }

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank("iBank", "Wash-Baltimore", "8009761234");

        bank1.displayBankDetails();
        System.out.println("\n ******************************\n");
        bank2.displayBankDetails();
    }
}
