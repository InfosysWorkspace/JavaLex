//package com.infosys.java811.finalVariable;
//
//
//
//public class FinalMethod {
//    public static void main(String[] args) {
//        Employee1 e = new Employee1();
//        PermanentEmployee1 pe = new PermanentEmployee1();
//    }
//}
//
//final class Employee1{
//    Employee1(){
//        System.out.println("Inside final parent constructor.");
//    }
//}
//
//class PermanentEmployee1 extends Employee1{
//    PermanentEmployee1(){
//        System.out.println("Inside child of final parent constructor.");
//    }
//}
//// This class will throw compilation error saying "PermanentEmployee
//// cannot subclass the final class Employee"