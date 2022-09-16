package com.infosys.java8.typeCasting;

public class Exercise {

    public static void main(String[] args) {

        int billId = 1001;
        int customerId = 101;
        int discount = 2;
        double billAmount = 199.99;
        double discountedBillAmount = 0;


        int billId2 = 1002;
        int customerId2 = 102;
        int discount2 = 4;
        double billAmount2 = 210.5;
        double discountedBillAmount2;

        discountedBillAmount = (billAmount - billAmount *(discount/100));

        System.out.println("The discount amount for customer 1 is: "
                +discountedBillAmount);

        discountedBillAmount2 = (billAmount2 - billAmount2 *(discount2/100));
        System.out.println("The discount amount for customer 2 is: "
                +discountedBillAmount2);
    }

}
