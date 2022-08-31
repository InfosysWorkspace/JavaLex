package com.infosys.objectOriented.interfaceClass;

public class MumbaiBranch implements IBank {
    public String createAccount(Customer customer) {
        return "Acc12345";
    }

    MumbaiBranch(){

    }
    public double issueVehicleLoan(String vehicleType, Customer customer) {
        if (vehicleType.equals("bike")) {
            return 100000;
        } else {
            return 500000;
        }
    }

    public double issueHouseLoan(Customer customer) {
        return 200000;
    }

    public double issueGoldLoan(Customer customer) {
        return 500000;
    }

    public boolean applyForCreditCard(Customer customer) {
        return true;
    }

}
