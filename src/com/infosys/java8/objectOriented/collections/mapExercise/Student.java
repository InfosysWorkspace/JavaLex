package com.infosys.java8.objectOriented.collections.mapExercise;


import java.util.*;

public class Student {
    private String name;
    private int rollNumber;



    private List<Integer> totalMarks;

    public Student(String name, int rollNumber, List<Integer> totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<Integer> getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(List<Integer> totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", totalMarks=" + totalMarks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(name, student.name) && Objects.equals(totalMarks, student.totalMarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber, totalMarks);
    }

    public static void main(String[] args) {
        HashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student("Diego", 1, new ArrayList<>(Arrays.asList(10,9,8,9,9,10))));
        students.add(new Student("James", 2, new ArrayList<>(Arrays.asList(8,5,6,9,7,10))));
        students.add(new Student("Diego", 1, new ArrayList<>(Arrays.asList(10,7,7,9,9,10))));
        students.add(new Student("Angel", 4, new ArrayList<>(Arrays.asList(6,0,0,10,8,5))));
        System.out.println("Students and their marks\n" + students);
//        Calculate the grade for a student based on the total marks, as per the below mentioned
//        conditions. Store it in a TreeMap containing roll number as the key and grade as the value.

        Iterator<Student> studentIterator = students.iterator();
        Integer total = 0;
        TreeMap<Integer, String> totalGrades = new TreeMap<>();
        while (studentIterator.hasNext()){
            Student i = studentIterator.next();

            for (Integer grades:   i.totalMarks) {
                total = total + grades;
            }

            if (total >=60){
                totalGrades.put(i.getRollNumber(), "A");
            } else if (total < 60 && total > 40) {
                totalGrades.put(i.getRollNumber(), "B");

            }else if (total <=40){
                totalGrades.put(i.getRollNumber(), "C");

            }

            total =0;
        }
        System.out.println("Student roll number + their respective grade.");
        System.out.println(totalGrades);


    }
}