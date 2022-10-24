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
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

        /**
         * 		1. Adding 5000 to the salary of employees, who are "Manager":
         */
        for (Employee e : employeeList){
            // Displaying salary of all employees, who are "Manager"
            Consumer<Employee> beforeInc = emp -> System.out.println(e.getEmpName()
                    + "(" +e.getEmpRole() + ") " + "had salary before Increment: " + e.getSalary());
            beforeInc.accept(e);

            // Increment Salary of only Manager using "Function"
            Function<Employee, Integer> salaryIncrease = emp -> e.getEmpRole().equals("Manager") ?
                    e.getSalary() + 5000 : e.getSalary();
            e.setSalary(salaryIncrease.apply(e));

            // Displaying Salary of all Employees after Increment
            Consumer<Employee> afterInc = emp -> System.out.println(e.getEmpName() +
                    " (" +e.getEmpRole() + ") " + "has salary after Increment: " +e.getSalary());
            afterInc.accept(e);
        }

        /**
         * 		2. Sorting the List of Employee Objects on the basis of Employee Name:
         */
        System.out.println();
        System.out.println("Employee List before Sorting");
        //Displaying List before Sorting
        for (Employee e : employeeList){
            System.out.println(e.getEmpId() + "--" + e.getEmpName() + "--" +e.getEmpRole());
        }
        System.out.println();

        //Sorting List using list.sort() and Lambda Expression
        //list.sort uses Comparator Interface (Comparable<T>) for sorting
        employeeList.sort((empObj1, empObj2) -> empObj1.compareTo(empObj2));

        //Displaying List after sorting
        System.out.println("Employee list after sorting: ");
        for (Employee e : employeeList){
            System.out.println(e.getEmpId() + "--" + e.getEmpName() + "--" +e.getEmpRole());
        }
        System.out.println();

        /**
         * 		3. Verifying Employees who are "Consultant":
         */
        for (Employee e : employeeList){
            Predicate<Employee> checkConsultant =  (emp) -> emp.getEmpRole().equals("Consultant");
            System.out.println("is " + e.getEmpName() + " a Consultant? : "+ checkConsultant.test(e));
        }

    }
}
