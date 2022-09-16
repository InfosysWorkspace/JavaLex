package com.infosys.java8.objectOriented.inheritance.exercise;

public class ContrsctEmployee extends  Employee{

    private double wages;
    private int hour;

    ContrsctEmployee() {

    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    void displayDetails(){

        System.out.println("**************************");
        System.out.println("Name: " +this.getName());
        System.out.println("Emp Id: " +this.getEmpId());
        System.out.println("Wages: " +this.getWages());
        System.out.println("Hours: " +this.getHour());
    }

    void calculateSalary(){
        displayDetails();
        System.out.println("Contract Employee Salary is: " +(this.hour * this.wages));
    }
}
