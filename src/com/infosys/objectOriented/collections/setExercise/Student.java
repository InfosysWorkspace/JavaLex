package com.infosys.objectOriented.collections.setExercise;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private int rollNo;

    public Student (String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Buhari", 101));
        students.add(new Student("Aisha", 102));
        students.add(new Student("Maryam", 103));
        students.add(new Student("Fatima", 101));

        for(Student s : students){
            System.out.println(s);
        }

    }

}
