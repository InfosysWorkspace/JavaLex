package com.infosys.java8.objectOriented.inheritance;

public class HomeLoan extends Loan {
    // Multilevel inheritance
    HomeLoan(){
        // Reusing super class member variables
        tenure = 5;
        principal = 20000;
        interestRate = 8.5f;
        accountNo = "Acc12345";

    }

    public static void main(String[] args) {
        HomeLoan hloan = new HomeLoan();
        double amount = hloan.calculateEMI();

        // sub class object invoking super class method
        System.out.println("EMI per year is: " +amount);
    }

}
