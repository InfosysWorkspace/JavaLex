package com.infosys.controlStatements;

/*  Control flow:

    A particular sequence in which statements get executed in a program
    is called the Control flow of that program.

    Loops and conditions enable us to manipulate this flow.
*/

public class Demo {
    public static void main(String[] args) {

        int choice = 0;
        choice = 2;

        switch (choice){
            case 1:
                System.out.println("Entry deposition");
                break;

            case 2:
                System.out.println("Display operation");
                break;

            case 3:
                System.out.println("Deposition operation");
                break;

            default:
                System.out.println("Invalid choice");



        }

    }

}
