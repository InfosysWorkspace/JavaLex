package com.infosys.java8.Exercise;

public class Loan {
    public static void main(String[] args) {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan();
        Loan loan3 = new Loan();
        Loan loan4 = new Loan();
        loan1 = loan3;
        loan2 = loan4;
        loan3 = null;

    }
}
