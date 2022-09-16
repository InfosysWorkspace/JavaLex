package com.infosys.java8.array;

public class Bank {
    public static void main(String[] args) {

        // Reference type array
        Customer [] customer = new Customer[2];
        Customer customer1 = new Customer("Buhari", "Acc12345");
        Customer customer2 = new Customer("Maryam", "Acc123456");

        // Storing in the array
        customer[0] = customer1;
        customer[1] = customer2;

        for(int i = 0; i < customer.length; i++){
            // retrieving customer object
            Customer customerObj = customer[i];
            String name = customerObj.displayCustomerName();
            System.out.println("The customer name is: " +name);
        }
    }
}
