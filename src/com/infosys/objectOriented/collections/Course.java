package com.infosys.objectOriented.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Course {
    String courseName;

    public Course (String courseName){
        this.courseName = courseName;
    }

    @Override
    public String toString(){
        return courseName;
    }
}

class ListInterface{
    public static void main(String[] args) {
        LinkedList<Course> courseList = new LinkedList<>();
        courseList.add(new Course("Java"));
        courseList.add(new Course("Hibernate"));
        courseList.add(new Course("AngularJS"));

        // Accessing the list of courses using Iterator
        System.out.println("*********** Using while loop ************");
        Iterator<Course> courseIterator = courseList.iterator();
        while (courseIterator.hasNext()){
            Course course = courseIterator.next();
            System.out.println(course);
        }

        // Accessing the list using for loop
        System.out.println("********** Using for loop ***********");
        for(int i = 0; i < courseList.size(); i++){
            System.out.println(courseList.get(i));
        }

        // Accessing using for enhanced loop
        System.out.println("*********** Using for enhanced loop ************");
        for(Course c : courseList){
            System.out.println(c);
        }
    }
}