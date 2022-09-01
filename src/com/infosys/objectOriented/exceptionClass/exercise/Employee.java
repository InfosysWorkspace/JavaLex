package com.infosys.objectOriented.exceptionClass.exercise;

import java.util.ArrayList;
import java.util.Arrays;

class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empName, int empAge, double empSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }


}


class EmpSalaryException extends Exception{
    public EmpSalaryException(String message) {
        super(message);
    }
}


class EmployeeService {
    public void checkEmployeeSalary(Employee emp) throws EmpSalaryException{
        if (emp.getEmpSalary() < 1000) {
            throw new EmpSalaryException("Employee salary must not be less than 1000");
        }
    }
    public static void main(String[] args) throws EmpSalaryException {
        Employee e1 = new Employee("Joe Smith",20,5345);
        Employee e2 = new Employee("Lewis Jane",21,1345);
        Employee e3 = new Employee("Larry Page",22,245);
        Employee e4 = new Employee("Smith James",23,945);
        Employee e5 = new Employee("Elvis George",25,1425);
        EmployeeService employeeService = new EmployeeService();

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));


        try{
            for (Employee i: employees) {
                employeeService.checkEmployeeSalary(i);
            }
        }catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
