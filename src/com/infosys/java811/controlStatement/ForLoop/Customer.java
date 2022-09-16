package com.infosys.java811.controlStatement.ForLoop;

public class Customer {
    public static void main(String[] args) {
        // The below code generates customer Id
        int totalNoOfCustomers = 12;
        String customerId = "";
//        for(int counter = 1; counter <= totalNoOfCustomers; counter++){
//            if(counter <= 9){
//                customerId = "C0" + counter;
//            } else {
//                customerId = "C" + counter;
//                System.out.println("Customer Id for customer " +counter+ " is " +customerId);
//
//            }

            // Uncomment the below given code and execute it instead of
            // above for loop


            for(var counter = 1; counter <= totalNoOfCustomers; counter++){
                if(counter <= 9){
                    customerId = "C0" + counter;
                } else {
                    customerId = "C" + counter;
                    System.out.println("Customer Id for customer" +counter+ " is " +customerId);
                }
            }


            // The local variable used in the FOR LOOP is declared using
            // type of that variable will be inferred based on the value
            // initialized
        }
    }

