package com.infosys.objectOriented.wrapperClass.exercise;

public class Palindrome {
    public static void palindrome(int i) {
        StringBuilder s = new StringBuilder(String.valueOf(i));
        if(s.toString().equals(s.reverse().toString())){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }

    public static void main(String[] args) {
        int i = 117711;
        int j = 274;

        Palindrome.palindrome(i);
        Palindrome.palindrome(j);
    }
}
