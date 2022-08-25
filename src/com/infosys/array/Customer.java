package com.infosys.array;

public class Customer {
    private String name;
    private String customerId;

    Customer(String uname, String ucustomerId){
        name = uname;
        customerId = ucustomerId;
    }

    public String displayCustomerName(){
        return name;
    }
}
