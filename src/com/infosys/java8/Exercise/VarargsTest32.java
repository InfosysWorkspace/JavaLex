package com.infosys.java8.Exercise;

public class VarargsTest32 {
    public static void main(String[] args) {
        displayRegn("Hockey");
        displayRegn("Kho-Kho",1, 2, 3);
    }
    public static void displayRegn(String nameOfSport, int... iDs){

        System.out.println("Registration for " +nameOfSport+": ");
        for (int iD : iDs) {
            System.out.println(iD + " ");
        }
    }
}

// Output:
// Registration for Hockey:
//Registration for Kho-Kho:
//1
//2
//3