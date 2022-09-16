package com.infosys.java8.objectOriented.inheritance.exercise;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee();
        pEmp.setName("Buhari");
        pEmp.setEmpId(101);
        pEmp.setBasicPay(10000);
        pEmp.setHra(1500);
        pEmp.setExperience(3);
        pEmp.calculateSalary();


        ContrsctEmployee cEmp = new ContrsctEmployee();
        cEmp.setName("Aisha");
        cEmp.setEmpId(102);
        cEmp.setWages(500);
        cEmp.setHour(10);
        cEmp.calculateSalary();

    }
}
