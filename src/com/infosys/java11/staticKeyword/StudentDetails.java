package com.infosys.java11.staticKeyword;

public class StudentDetails {
    String name;

    // Static variables
    static String department;
    static int rollCOunt;

    // Static block is used to initialize static variable
    static {
        System.out.println("Inside Static Block");
        department = "CS";
    }

    // Medthod to change the value of static variable
    static void change(){
        rollCOunt++;
    }

    // Constructor to initialize the variable
    StudentDetails(String studentName){
        change();
        name = studentName;
    }

    //Method to display values
    void display(){
        System.out.println(rollCOunt+" "+department);
    }
}

// Test class to create and display the values of object

class Student{
    public static void main(String[] args) {

        StudentDetails student1 = new StudentDetails("Tom");
        student1.display();

        StudentDetails student2 = new StudentDetails("Chris");
        student2.display();

        StudentDetails student3 = new StudentDetails("Morris");
        student3.display();

        // We can chamge the value of the static variable department as shown below
        // Display student4 with ECE department
        StudentDetails student4 = new StudentDetails("Cherry");
        StudentDetails.department = "ECE";
        student4.display();
    }
}
