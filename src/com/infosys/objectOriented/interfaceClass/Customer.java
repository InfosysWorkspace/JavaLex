package com.infosys.objectOriented.interfaceClass;


public class Customer {
    private String name;
    private String customerID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}

class Execute{
    public static void main(String[] args) {
        IBank bank = new MumbaiBranch();
        Customer customer = new Customer();
        customer.setCustomerID("cust1001");
        customer.setName("Ajay");
        String accountNumber = bank.createAccount(customer);
        System.out.println("Account number is: " +accountNumber);
        double gloan = bank.issueGoldLoan(customer);
        System.out.println("Gold Loan amount is: " +gloan);
        double hloan = new bank.issueHouseLoan(customer);
        System.out.println("House Loan amount is: " +hloan);
        double vloan = new bank.issueVehicleLoan(customer);
        System.out.println("Vehicle loan is: " +vloan);
        System.out.println("Caution money is: "+IBank.CAUTION_MONEY);

        IBankNew bankNew = new MumbaiBranch();
        boolean credit = bankNew.applyForCreditCard(customer);
        System.out.println("Credit card request: " +credit);

    }
}