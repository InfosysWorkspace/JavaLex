package com.infosys.introToClassObjects.problemStatement;

public class Student {
    private int studentId;
    private String name;
    private char residentialStatus;
    private float qualifyingExamMark;
    private int yearOfEngg;

    public Student(){

    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getRualifyingExamMark(){
        return qualifyingExamMark;
    }

    public void setQualifyingExamMark(float qualifyingExamMark){
        this.qualifyingExamMark = qualifyingExamMark;
    }

    public char getResidentialStatus(){
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus){
        this.residentialStatus = residentialStatus;
    }

    public int getYearOfEngg(){
        return yearOfEngg;
    }

    public void setYearOfEngg(int yearOfEngg){
        this.yearOfEngg = yearOfEngg;
    }



}
