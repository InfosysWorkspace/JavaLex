package com.infosys.java8.Exercise;

abstract class BaseAbsClass {
    public void method(int a){
        System.out.println(" BaseAbsClass");
    }
    public abstract void method2();
}

class Derived extends BaseAbsClass{
    public void method2(){
        System.out.println(" Derived Method ");
    }
}

class Testing{
    public static void main(String[] args) {
        BaseAbsClass obj = new Derived();
        obj.method2();
    }
}
