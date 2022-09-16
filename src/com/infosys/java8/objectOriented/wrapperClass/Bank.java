package com.infosys.java8.objectOriented.wrapperClass;

public class Bank {
    public static void main(String[] args) {
        String username = "Buhari";
        int size = username.length();
        if(size > 5 && size < 15){
            char arr[] = username.toCharArray();
            int count = 0;
            for( char c : arr){
                if(Character.isLetter(c)){
                    ++count;
                }
            }
            if(count == size){
                System.out.println("valid username");
            }
        }
    }
}
