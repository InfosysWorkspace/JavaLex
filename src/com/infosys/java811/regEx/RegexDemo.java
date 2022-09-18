package com.infosys.java811.regEx;

/*
    Problem Statement

    Leeroy wants to validate the personal details which should be in the following format:

    Name:  It can only contain characters and spaces.
    Email  Id:  <firstname>.<lastname>@<any>.<com/in>
    User Id:  <firstname>#<any 2 digits><lastname>
    Account Serial Id:  WoW-<any 7 alphabetic code><any 5 digits><Same 7 alphabetic code>_<any 5 alphanumeric code>
    On successful execution of code it will return the result as "true" or "false", let's see how we can achieve this using Regex.

*/

public class RegexDemo {
    public static void main(String[] args) {

        // Perrsonal details
        String name = "Leeroy  Jenkins";
        String emailId = "leeroy.jenkins@wow.com";
        String userId = "leeroy#78jenkins";
        String accSerialId = "WoW-ABi10pZ00523ABi10pZ_a00Z9";

        // Splitting Full Name Into an Array
        String[] nameSplit = name.toLowerCase().split(" ");

        /*
        *   Regular Expression for each field according to the requirements:
        */

        // Regular Expression for name validation:
        String nameRegex = "([A-Za-z]+)";

        // Regular Expression for email Id validation:
        String emailIdRegex = nameSplit[0]+ ", "+nameSplit[1]+"[@]([a-z]+)[.](com/in)";

        // Regular Expression for user id validation
        String userIdRegex = nameSplit[0]+ "[#]([0-9](2))" +nameSplit[1];

        // Regular Expression for Account Serial Id validation
        String accSerialRegex = "(WoW)[-]([A-Za-z]{7})(\\d{5})\\2[_]([A-Za-z0-9]{5})";

        /*
        *   Matching the Personal Details with the pattern specified
        */

        // Validating Name:
        System.out.println("Does the name ("+name+") matches the pattern? : " +name.matches(nameRegex));

        // Validating Email Id
        System.out.println("Does the emailId ("+emailId+") match the pattern? : " +emailId.matches(emailIdRegex));

        // Validating User Id
        System.out.println("Does the user ID ("+userId+") match the pattern? : " +userId.matches(userIdRegex));

        // Validating Account Serial Id:
        System.out.println("Does the account serial ID ("+accSerialId+") match the pattern? : " +accSerialId.matches(accSerialRegex));
    }
}
