package com.infosys.java8.Exercise;

abstract class Person1 {
    public final void display(){
        System.out.println("Display method in Person");
    }

    public static void main(String[] args) {
        Person1 person = new Student1(); // 6
        person.display(); // 7
    }
}

class Student1 extends Person1{
//    public void display(){ // 11
//        System.out.println("Display student");
//    }
}
// Output: compilation error line 11