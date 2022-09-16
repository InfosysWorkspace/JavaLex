package com.infosys.java8.Exercise;

abstract class Employee05 {
    private void display(){
        System.out.println(" Employee ");
    }
}

class Trainee extends Employee05 {
    protected void display(){ // 5
        System.out.println(" Trainee ");
    }

    public static void main(String[] args) {
        Employee05 emp = new Trainee();
        //emp.display(); // 10

//        Trainee05 tr = new Trainee05();
//        tr.display();
    }
}

// OUTPUT: Compilation error at line 10