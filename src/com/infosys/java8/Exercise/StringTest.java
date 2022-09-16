package com.infosys.java8.Exercise;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "A", s2 = "b", s3 = "a";
        s1.toLowerCase();
        s3.replace("b", "a");
        System.out.println((s1.equals(s2))+ ", " +(s2.equals(s3)));
    }
}

//output: false, false