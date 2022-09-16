package com.infosys.java8.Exercise;

public class TesterBase2 {
    public static void main(String[] args) {
        Base3 obj = new Derive3();
        obj.method2(25);
    }
}
class Base3{
    public static void method2(int a){
        System.out.println("Base Method");
    }
}

class Derive3 extends Base3{
    public static void method2(int a){
        System.out.println("Derived Method");
    }
}

//Output: Base Method