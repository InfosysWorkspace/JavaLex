package com.infosys.java8.objectOriented.inheritance;

public class Loan {
    int tenure;
    double principal;
    float interestRate;
    String accountNo;

    public double calculateEMI(){
        double simpleInterest =(principal * interestRate * tenure) / 100;
        return (simpleInterest + principal) / tenure;
    }
}
