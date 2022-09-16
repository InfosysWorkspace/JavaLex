package com.infosys.java811.keywordAndDatatype;

public class DataTypes {
    public static void main(String[] args) {
        int price = 100;
        double discount = 25.5;
        String size = "Medium"; // non-prmitive data type

        System.out.println("Prize after discount: "+price*(1-discount)/100);

        // variable declared using var keyword
        var customerName = "Rob Jones"; // infer String
        System.out.println(customerName + " ordered a " +size+" pizza");

    }
}
