package com.infosys.objectOriented.staticKeyword;

public class Account {
    static int minbalance; // class variable
    static {
        minbalance = 500; // static block
    }

    public static int getMinbalance(){
        return minbalance; // cannot use instance variable in static method
                            // and block
    }

    public static void main(String[] args){
        System.out.println("The value: " +getMinbalance());
    }
}
