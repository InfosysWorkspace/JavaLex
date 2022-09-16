package com.infosys.java8.Exercise;

public class MyImplementation implements MyInterface {
    public void method1(){
        System.out.println("My Method");
    }


}
class Testing1{
    public static void main(String[] args) {
        MyInterface obj = new MyImplementation();
        obj.method1();
    }
}

// Output: My Method