package com.infosys.java8.Exercise;

public class Vehicle {
    Vehicle(){
        System.out.println(" Vehicle is created ");
    }
}

class Bikes extends Vehicle{
    Bikes(){
        super();
        System.out.println(" Bike is Created ");
    }

    public static void main(String[] args) {
        Bikes obj = new Bikes();
    }
}

// Output: Vehicle is created Bike is Created