package com.infosys.java11.collection.arrayListTryout;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private int studentId;
    private String studentName;
    private boolean courseRegistered;

    public Students(int studentId, String studentName, boolean courseRegistered){
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseRegistered = courseRegistered;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean getCourseRegistered() {
        return courseRegistered;
    }

    public void setCourseRegistered(boolean courseRegistered) {
        this.courseRegistered = courseRegistered;
    }
}

class Tester{
    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students(1001, "Steve", true));
        studentsList.add(new Students(1002, "Rachel", false));
        studentsList.add(new Students(1003, "Monica", true));
        studentsList.add(new Students(1004, "David", true));


        List<String> studentNames = new ArrayList<>();
        // Iteration of the studentList using for each loop
        for(Students student : studentsList){
            studentNames.add(student.getStudentName());
            System.out.println("Student ID: " +student.getStudentId());
            System.out.println("Student Name: " +student.getStudentName());
            System.out.println("Course Registered: " +student.getCourseRegistered());
        }

        System.out.println("Student Names: " +studentNames);
    }

}