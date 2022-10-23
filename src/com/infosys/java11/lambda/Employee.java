package com.infosys.java11.lambda;

/*
Problem Statement

Let us take a look at how objects of a User Defined Class can be passed as arguments to
Built-In Functional Interfaces and Lambda Expressions with the following code.

Note: Comparator  (Comparable<T>) is a Built-In Functional Interface, which is used in
ordering a given collection. It does the custom ordering of collections by taking Lambda
Expressions as arguments, which provide the format for ordering.
*/


import java.util.Arrays;
import java.util.List;

/**
 * Comparable<T> interface is implemented by the class to Override
 * the compareTo() method. Overriding this methods helps in customizing
 * sorting of objects according to user's need.
 * (In this case, we need to sort Employee objects of names of Employees)
 */

class Employee implements Comparable<Employee>{
    private String empId;
    private String empName;
    private Integer salary;
    private String empRole;

     Employee(String empId, String empName, String empRole, Integer salary){
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    @Override
    public int compareTo(Employee object){
        /*
        compareTo() compare two string values lexicographically and return either 1, 0 or -1.
        0 if both the strings are same
        1 if str1 > str2 (in str1.compareTo(str2))
        -1 if str1 < str2 (in str1.compareTo(str2))
         */

        return this.empName.compareTo(object.empName);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("1001", "Buhari", "Manager", 50000),
                new Employee("1002", "Aisha", "Associate", 35000),
                new Employee("1003", "Maryam", "Consultant", 65000),
                new Employee("1004", "Fatima", "Manager", 40000)
        );
    }
}
