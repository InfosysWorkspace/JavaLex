package com.infosys.java8.Exercise;

public class TesterBase {
    public static void main(String[] args) {
        Base2 obj = new Derive2();
        obj.method2(23);
    }
}
class Base2{
    public void method2(int a){
        System.out.println("Base Method");
    }
}

class Derive2 extends Base2{
    public void method2(){
        System.out.println("Derived Method");
    }
}

// Output: Base Method

