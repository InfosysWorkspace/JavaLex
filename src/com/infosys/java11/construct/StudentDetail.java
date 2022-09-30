package com.infosys.java11.construct;

public class StudentDetail {
    private String name;
    private Integer rollNumber;

    // Constructor used when no name is specified
    StudentDetail(){
        name = "N.A";
        rollNumber = -1;
    }

    // Constructor use when rollNumber and name are specified
    StudentDetail(String username, Integer rollNo){
        name = username;
        rollNumber = rollNo;
    }

    // Constructor when name is specified
    StudentDetail(String studentName){
        // this() will invoke the default constructor StudentDetail
        // which wll initialize name to N. A and rollNumber to -1
        this();
        name = studentName;
        // The above statement will re-initialize rollNumber from -1 to rollno
    }

    StudentDetail(Integer rollNo){
        // this() will invoke the default constructor StudentDetail
        // which wll initialize name to N. A and rollNumber to -1
        this();
        rollNumber = rollNo;
        // The above statement will re-initialize rollNumber from -1 to rollno
    }

    public void displayStudentDetail(){
        System.out.println("Student Details:- ");
        System.out.println("Name:- " +name);
        System.out.println("Roll Number:- " +rollNumber);
    }

    public static void main(String[] args) {
        StudentDetail student1 = new StudentDetail();
        student1.displayStudentDetail();
        System.out.println();

        StudentDetail student2 = new StudentDetail("Joe", 41);
        student2.displayStudentDetail();
        System.out.println();

        StudentDetail student3 = new StudentDetail("Tommy");
        student3.displayStudentDetail();
        System.out.println();

        StudentDetail student4 = new StudentDetail(70);
        student4.displayStudentDetail();
        System.out.println();
    }
}
