package com.infosys.java8.Exercise;

public class SuperClass {
    private void displayName(){
        System.out.println("Super Class");
    }

    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        superClass.displayName();
    }
}

class SubClass extends SuperClass{
    private void displayName(){
        System.out.println("Subclass is a type of superclass");
    }
}

//output: Super Class