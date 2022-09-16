package com.infosys.java8.objectOriented.polymorphism.methodOverriding;

public class Loan {
    public double calculateEMI(double principal){
        double simpleInterest = (principal * 8.5 * 5) / 100;
        return (simpleInterest + principal);
    }
}

 class HomeLoan extends Loan{
    // Method Overridden
     public double calculateEMI(double principal){
         int additionalTax = 200;
         double simpleInterest = (principal * 7.5 * 20) / 100;
         double emi = (simpleInterest + principal) /20;

         return emi + additionalTax;
     }
 }

 class VehicleLoan extends Loan{
    // Method Overidden
     public double calculateEMI(double principal) {
         int additionalTax = 200;
         double simpleInterest = (principal * 9.5 * 10) / 100;
         double emi = (simpleInterest + principal) / 10;
         return emi + additionalTax;
     }
 }

 class ExecuteLoan{
     public static void main(String[] args) {
         Loan loan = null;
         loan = new HomeLoan();
         double hloan = loan.calculateEMI(2000000);
         loan = new VehicleLoan();
         double vloan = loan.calculateEMI(100000);

         System.out.println("Home loan emi per year is: " +hloan);
         System.out.println("Vehicle loan emi per year is: " +vloan);


     }



 }