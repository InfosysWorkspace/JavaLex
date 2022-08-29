package com.infosys.objectOriented.staticKeyword.exercise;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;

    private static int loanCounter;

    Loan(){
        loanCounter++;
    }

    public static int getLoanCounter() {
        return loanCounter;
    }

    public static void setLoanCounter(int loanCounter) {
        Loan.loanCounter = loanCounter;
    }

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    Loan(int accountNo, int customerNo, float loanAmount,
         int loanDuration, float interest){

        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter++;
    }
}
