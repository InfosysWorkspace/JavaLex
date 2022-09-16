package com.infosys.java8.objectOriented.wrapperClass.exercise;

public class StudentRegistration {
    private String studentName;
    private double age;
    private int admissionNum;
    private int rollNumber;
    private static int counter = 1000;

    public StudentRegistration(String studentName, double age, int admissionNum){
        this.studentName = studentName;
        this.age = age;
        this.admissionNum = admissionNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAge() {
        return age;
    }

    public int getAdmissionNum() {
        return admissionNum;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void generaRollNumber(){
        rollNumber = ++counter;
    }

    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            return true;
        };
       return false;
    }

    public int hashCode() {
        return rollNumber;
    }
}

class RegistrationTester{
    public static void main(String[] args) {
        StudentRegistration sr = new StudentRegistration
                ("Buhari", 24, 5003);
        StudentRegistration sr2 = new StudentRegistration
                ("Aisha", 20, 5004);

        System.out.println("Student Details");
        System.out.println("************************************");

        System.out.println("Student Name: " +sr.getStudentName());
        System.out.println("Student Admission Number: " +sr.getAdmissionNum());
        sr.generaRollNumber();
        System.out.println("Student Roll Number: " +sr.hashCode());


        StudentRegistration sr3 = new StudentRegistration(
                "Buhari", 25, 50001);

        if(sr3.equals(sr)){
            System.out.println("Roll Number already generated.");
        }
    }
}
