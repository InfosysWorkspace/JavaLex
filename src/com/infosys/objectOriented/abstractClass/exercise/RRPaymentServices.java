package com.infosys.objectOriented.abstractClass.exercise;

public abstract class RRPaymentServices {
    private double balance;
    private int customerID;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerId(int customerID) {
        this.customerID = customerID;
    }

    public RRPaymentServices(double balance, int customerID){
        this.balance=balance;
        this.customerID = customerID;
    }

    public abstract void payBill(double amount);
}

class ShoppingPayment extends RRPaymentServices{
    private static int counter;
    private String paymentID;

    public ShoppingPayment(double balance, int customerID){
        super(balance, customerID);
        paymentID = "C" + ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ShoppingPayment.counter = counter;
    }

    public String getPaymentID() {
        return paymentID;
    }

    static {
        counter = 1000;
    }
    public void payBill(double amount){
        if(amount == getBalance()){
            paymentID = "S" + counter--;

            System.out.println("Congratulation!! your payment of Rs."
            +amount+ " is successful with payment id: " +getPaymentID());
        }else if(amount > getBalance()){
            System.out.println("Excess amount entered!! please try again.");
        }else if(amount < getBalance()){
            System.out.println("Insuffcient amount entered!! please try again.");
        }
    }
}

class CreditCardPayment extends RRPaymentServices{
    private static int counter;
    private String paymentID;
    private double cashBack;
    private double balance;

    public String getPaymentID() {
        return paymentID;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalance() {
        return balance;
    }

    static {
        counter = 10000;
    }

    public CreditCardPayment(double balance, int customerID){
        super(balance, customerID);
        paymentID = "C" + ++counter;
    }

    public void payBill(double amount){
        if(amount > getBalance()){
            cashBack = amount - getBalance();
            System.out.println("Congratulations! made of payment of "
            +amount+ " payment detail are: \n" + "CustomerID is: "
                    +getCustomerID()+ "\n" + "paymentID: "+paymentID
            +" previous due: "+getBalance());
        }
    }

}

class Tester{
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment(10000.23, 5001);

        c.payBill(15000);
        c.payBill(00.00);

        ShoppingPayment s = new ShoppingPayment(5000.0, 5001);

        s.payBill(5000.0);
        s.payBill(6000);
        s.payBill(4000.0);
    }
}