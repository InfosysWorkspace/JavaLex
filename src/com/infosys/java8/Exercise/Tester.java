package com.infosys.java8.Exercise;

public class Tester {
    public static void main(String[] args) {
        Base obj = new Derive();
        obj.method();
    }
}
class Base{
    public void method(){
        System.out.println("Base Method");
    }
}

class Derive extends Base{
    public void method(){
        System.out.println("Derived Method");
    }
}

// Output: Derived Method