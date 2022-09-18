package com.infosys.java8.Exercise;

public class Employee33 {

    public void display(){
        System.out.println(" display ");
    }
    public void print(int age){
        System.out.println(" Employee ");
    }
}

class Trainee33 extends Employee33{
    public void display(String name){
        System.out.println(name);
    }

    public void print(int age){
        System.out.println("Trainee");
    }

    public static void main(String[] args) {
        Trainee33 train = new Trainee33();
        train.display();
        train.display(" Bob");
        train.print(10);
    }
}

//Output:
    //display
    // Bob
    // Employee