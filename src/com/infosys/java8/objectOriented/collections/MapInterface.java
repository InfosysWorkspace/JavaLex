package com.infosys.java8.objectOriented.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {

        Set<Courses> courseSet1 = new HashSet<>();
        courseSet1.add(new Courses("Java"));
        courseSet1.add(new Courses("DBMS"));

        Set<Courses> courseSet2 = new HashSet<>();
        courseSet2.add(new Courses("PHP"));
        courseSet2.add(new Courses("HTML"));
        courseSet2.add(new Courses("CSS"));

        Map<Integer, Set<Courses>> studentCourses = new HashMap<>();
        studentCourses.put(1001, courseSet1);
        studentCourses.put(1002, courseSet2);

        // Retrieving the set of Course by StudentID using get() method
        Set<Courses> courseSet = studentCourses.get(1001);
        System.out.println("Retrieving the set of courses by StudentID: ");
        System.out.println(courseSet);

        // Iterating over the set of keys using for each loop
        Set<Integer> setOfKeys = studentCourses.keySet();
        System.out.println("Iterating over the set of keys using for each loop: ");
        for(Integer i : setOfKeys){
            System.out.println(studentCourses.get(i));
        }

        // Iterating over the collection using values() method
        System.out.println("Iterating over the collection using values() method: ");
        for(Set<Courses> courses : studentCourses.values()){
            System.out.println(courses);
        }
    }
}

class Courses{
    String courseName;
    public Courses(String courseName){
        this.courseName = courseName;
    }

    @Override
    public String toString(){
        return courseName;
    }
}