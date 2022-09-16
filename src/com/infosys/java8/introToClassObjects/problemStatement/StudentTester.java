package com.infosys.java8.introToClassObjects.problemStatement;

public class StudentTester extends Student{

    public static void main(String[] args) {

        Student std1 = new Student();
        Student std2 = new Student();

        std1.setName("Jacob");
        std1.setStudentId(10001);
        std1.setQualifyingExamMark(80);
        std1.setYearOfEngg(3);
        std1.setResidentialStatus('H');

        System.out.println("Student Name        : " +std1.getName());
        System.out.println("Student Id          : " +std1.getStudentId());
        System.out.println("Qualifying Marks    : " +std1.getRualifyingExamMark());
        System.out.println("Year of Engineering : " +std1.getYearOfEngg());
        System.out.println("Residential Status  : " +std1.getResidentialStatus() +"\n");

        System.out.println("Second Student" +"\n");

        std2.setName("Peter");
        std2.setStudentId(10002);
        std2.setQualifyingExamMark(83);
        std2.setYearOfEngg(5);
        std2.setResidentialStatus('D');

        System.out.println("Student Name            : " +std2.getName());
        System.out.println("Student Id              : " +std2.getStudentId());
        System.out.println("Qualifying Marks        : " +std2.getRualifyingExamMark());
        System.out.println("Year of Engineeering    : " +std2.getYearOfEngg());
        System.out.println("Residential Status      : " +std2.getResidentialStatus());



    }
}
