package com.infosys.objectOriented.inheritance.exercise;

public class PermanentEmployee extends Employee{
    private double basicPay;
    private double hra;
    private int experience;

    PermanentEmployee() {

    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    double calculateVariable(int experience) {
        if (experience < 3) {
            return basicPay;
        } else if (experience >= 3 && experience < 5) {
            return (basicPay * 7) / 100;
        } else {
            return (basicPay * 12) / 100;
        }
    }
    private void displayDetail() {
        System.out.println("*************************");
        System.out.println("Name: " +this.getName());
        System.out.println("Emp Id: " +this.getEmpId());
        System.out.println("Basic Salary: " +this.getBasicPay());
        System.out.println("HRA: "+this.getHra());
        System.out.println("Experience: "+this.getExperience());

    }


        void calculateSalary(){
            displayDetail();

            double Salary = calculateVariable(this.experience) + this.basicPay
                    +this.hra;
            System.out.println("Permanent Employee Salary: "+Salary);
        }
}





