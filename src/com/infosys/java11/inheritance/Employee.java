package com.infosys.java11.inheritance;

/*
    Problem Statement
    The code given below demonstrates Inheritance of Employee Class to PermanentEmployee and TemporaryEmployee, where the attributes like designation, hikePercent and servicePeriod are specific to the child classes. Calculate the hike in the salary of the employee based on base salary and hike percent or service period given, and display the employee details.

    Note: Employee hike is calculated as shown below,

    Permanent Employee: Hike Percent - 12%

    Temporary Employee: 2 times the service period percentage of the base salary
*/
public class Employee {

    private Integer employeeId;
    private String employeeName;
    private Double baseSalary;

    // Parameterized constructor
    Employee(int empId, String empName, Double bSalary){
        this.employeeId = empId;
        this.employeeName = empName;
        this.baseSalary = bSalary;
    }

    public Integer getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(Integer empId){
        this.employeeId = empId;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String empName){
        this.employeeName = empName;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(Double bSalary){
        this.baseSalary = bSalary;
    }

    public void display(){
        System.out.println("Employee details");
        System.out.println("Employee Id: " +employeeId);
        System.out.println("Employee Name: " +employeeName);
        System.out.println("Base Salary: " +baseSalary);
    }
}

class PermanentEmployee extends Employee{
    private String designation;
    private Integer bikePercent;

    PermanentEmployee(int employeeId, String employeeName, Double baseSalary, String designation){
        super(employeeId, employeeName, baseSalary);
        this.designation = designation;
        this.bikePercent = 12;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getBikePercent() {
        return bikePercent;
    }

    public void setBikePercent(Integer bikePercent) {
        this.bikePercent = bikePercent;
    }

    public void calculateSalaryHike(){
        Float salaryHike = (float) (this.getBikePercent() * (this.getBikePercent()*0.01));
        System.out.println("Salary Hike: " +salaryHike);
    }
}

class TemporaryEmployee extends Employee{
    private Float servicePeriod;

    TemporaryEmployee(int employeeId, String employeeName, Double baseSalary, Float servicePeriod){
        super(employeeId, employeeName, baseSalary);
        this.servicePeriod = servicePeriod;
    }

    public Float getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(Float servicePeriod) {
        this.servicePeriod = servicePeriod;
    }

    public void calculateSalaryHike(){
        Float salaryHike = (float)(this.getBaseSalary() * (this.getServicePeriod() * 0.02));
        System.out.println("Salary Hike: " +salaryHike);
    }
}

class Tester{
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "John", 20000.0, "Lead");
        permanentEmployee.display();
        System.out.println("Designation: " +permanentEmployee.getDesignation());
        permanentEmployee.calculateSalaryHike();

        System.out.println("-------------------");
        TemporaryEmployee tempEmp = new TemporaryEmployee(210,"Ross", 20000.0, 2.5f);
        tempEmp.display();
        System.out.println("Service Duration (in years): " +tempEmp.getServicePeriod());
        tempEmp.calculateSalaryHike();
    }
}
