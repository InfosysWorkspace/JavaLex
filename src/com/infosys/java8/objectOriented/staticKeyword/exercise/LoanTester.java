package com.infosys.java8.objectOriented.staticKeyword.exercise;

public class LoanTester {
    public static void main(String[] args) {
        Loan loan = new Loan();
        System.out.println("No of loans " + Loan.getLoanCounter());
        Loan ln = new Loan();
        System.out.println("Loan details: " +Loan.getLoanCounter());
    }
}
