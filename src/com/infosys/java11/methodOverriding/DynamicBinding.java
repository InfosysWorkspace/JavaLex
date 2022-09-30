package com.infosys.java11.methodOverriding;

public class DynamicBinding {
    public static void main(String[] args) {
        RegularCustomer regularCustomer1 = new RegularCustomer();
        RegularCustomer regularCustomer2 = new RegularCustomer();
        PremiumCustomer premiumCustomer = new PremiumCustomer();

        showCustomerDetails(regularCustomer1);
        showCustomerDetails(premiumCustomer);
        showCustomerDetails(regularCustomer2);
    }

    public static void showCustomerDetails(Customer customer){
        customer.display();
    }
}

class Customer{
    public void display(){
        System.out.println("Customer is coming....");
    }
}

class RegularCustomer extends Customer{
    @Override
    public void display(){
        System.out.println("A regular customer has come. ");
    }
}

class PremiumCustomer extends Customer{
    @Override
    public void display(){
        System.out.println("A premium customer has come.");
    }
}