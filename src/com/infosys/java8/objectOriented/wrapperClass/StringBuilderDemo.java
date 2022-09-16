package com.infosys.java8.objectOriented.wrapperClass;

public class StringBuilderDemo {

    public static void main(String[] args) {

        String firstName = "Buhari";
        String lastName = "Maiwada";
        String fullName = firstName+" "+lastName;
        // "+" operator concatenates the string but creates a new object in the
        // heap memory
        System.out.println(fullName);

        StringBuilder sb = new StringBuilder(firstName);
        // toString method converts StringBuilder to String
        String fName = sb.append( " "+lastName).toString();
        //StringBuilder is mutabke, it append to a single object
        System.out.println(fName);
    }



}
