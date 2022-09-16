package com.infosys.java8.objectOriented.generics;

public class Record <E>{
    private E records;
    public void display(E item){
        System.out.println(item);
    }
}

class Student {
    private int studentID;
    private String studentName;

    public Student (int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString(){
        return "student: Id = " + studentID + "Name = " +studentName;
    }
}

class GenericDemo{
    public static void main(String[] args) {
        Student s1 = new Student(101, "Robert");

        //integerRecord can be used to display only integers
        Record<Integer> IntegerRecord = new Record<>();
        IntegerRecord.display(12);
        //IntegerRecord.display(s1); will give an error as
        // we are trying to add a student class object

        Record<Student> studentRecord = new Record<>();
        studentRecord.display(s1);
        //studentRecord.display(15); will give an error as we are
        // trying to add an integer

    }
}