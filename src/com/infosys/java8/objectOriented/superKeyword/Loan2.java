package com.infosys.java8.objectOriented.superKeyword;

public class Loan2 {
    public double calculateEMI(double principal){
        double simpleInterest = (principal * 8.5 * 5) / 100;
        double emi = (simpleInterest + principal);
        return emi;
    }
}

class HomeLoan2 extends Loan2{
    public double calculateEMI(double principal){
        int additionalTax = 200;
        double emi = super.calculateEMI(principal); // calling super class method
        return emi + additionalTax;
    }
}

class ExecuteLoan2 {
    public static void main(String[] args) {
        Loan2 loan = null;
        loan = new HomeLoan2();
        double hloan = loan.calculateEMI(20000000);
        System.out.println("Home loan emi per year is: " +hloan);
    }
}