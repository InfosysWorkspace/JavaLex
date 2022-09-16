package com.infosys.java8.introToClassObjects;

public class Demo {
    public static void main(String[] args) {

        boolean a = true; //true
        boolean b = !true; //false
        boolean c = a|b; //true
        boolean d = a&b; //false
        boolean e = d? b:c;// if d = false, then b = false or c true

        System.out.println(d+ " " +e);


    }
}
