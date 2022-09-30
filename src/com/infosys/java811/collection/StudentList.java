package com.infosys.java811.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentList {

    private int studentId;
    private String studentName;
    private boolean courseRegistered;

    public StudentList(int studentId, String studentName, boolean courseRegistered){
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

class Teste{

    public static void main(String[] args) {

        List<StudentList> students = new ArrayList<>();

        students.add(new StudentList(1001, "Steve", true));
        students.add(new StudentList(1002, "Rachel", false));
        students.add(new StudentList(1003, "Monica", true));
        students.add(new StudentList(1004, "David", true));

        ListIterator<StudentList> itr = students.listIterator();

        System.out.println("Display the student names");

        while(itr.hasNext()){
            System.out.println(itr.next().getStudentName());
        }

        System.out.println("Display the student names in reverse order");
        while (itr.hasPrevious()){
            System.out.println(itr.previous().getStudentName());
        }

    }




}
