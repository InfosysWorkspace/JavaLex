package com.infosys.java8.Exercise;

class Employee19 {
    public static void display(){ // 2
        System.out.println(" Employee ");
    }
}

class Trainee19 extends Employee19 {
    public static void display(){ // 5
        System.out.println(" Trainee ");
    }

    public static void main(String[] args) {
        Employee19 emp = new Trainee19();
        emp.display(); // 9

//        Trainee15 tr = new Trainee15();
//        tr.display();
    }
}

// OUTPUT: Compilation error at line 10