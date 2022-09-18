package com.infosys.java811.regEx;

/*
    Problem Statement

    The regex API (java.util.regex) provides classes and interfaces to work with regular expressions.
    The String class uses this API to support regex method matches().
*/
public class Test {
    public static void main(String[] args) {
        String str = new String("We are going to learn Regular Expression in Java");

        //Declaring Regular Expression for comparisons
        String regex1 = "[A-Z].*";
        String regex2 = ".*to.*";

        /*
        * Different uses of matches() method:
        * Note: matches() return Boolean value (True/False) as result.
        */

        //1. CHecking the given String starts with an Uppercase Letter:
        System.out.println("Does the string start with an Uppercase Letter? : "+str.matches(regex1));

        //2. Checking the given String contains a particular Substring in it:
        System.out.println("Does the string contain the word 'to'? : " +str.matches(regex2));


        String str2 = "Thomas34";

        // Declaring the pattern as a Regular Expression
        /*
        * The requireed pattern is:
        *   1. First letter of String should be uppercasw [A-Z]
        *   2. Atleast one letter in lowercase ([a-z]+)
        *   3. Should end with any two digits number \\d{2}
        * */
        String regex3 = "[A-Z]([a-z]+)\\d{2}";

        //3. Checking the given String follows a given pattern:
        System.out.println("Does ("+str2+") match the required pattern? : "+str2.matches(regex3));
    }
}
