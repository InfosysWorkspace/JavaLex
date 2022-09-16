package com.infosys.java8.dataTypes;

public class ScopeOfVariable {
    int i = 34; // instance variable

    static int z; // class variable

    static {
        z = 10;
        System.out.println("Inside Static block: " +z);
    }

    void test(){
        int k = 200; // local variable
        System.out.println("Local Variable: " +(k + i));
    }

    public static void main(String[] args) {
        ScopeOfVariable obj = new ScopeOfVariable();
        obj.test();
        System.out.println("Instance Variable: " +obj.i);
    }
}
