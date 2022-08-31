package com.infosys.objectOriented.enumKeyword;

public enum Designation {
    CEO(2), GeneralManager(4),
    RegionalManager(20);
    private int noOfEmployees;

    Designation(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }
}

class Bank{
    public void reportees(Designation designation){
        System.out.println(designation.getNoOfEmployees());
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.reportees(Designation.CEO);
    }
}


