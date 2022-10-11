package com.infosys.java11.setInterface;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
    Problem Statement
    The below code contains a list of users. There are duplicate entries for emailId.
    Two users are considered to be the same if their emails are the same. Observe
    the below code which uses Set to detect and remove the duplicates.
    Execute the code below and check are they really removing duplicates?
    Uncomment equals() and hashCode() and observe the output.
*/
public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Overriding equals method which compares username of users to check if they are
    // equal or not


    @Override
    public boolean equals (Object user){
        User tempuser = null;
        boolean flag = false;
        if(user instanceof  User){
            tempuser = (User) user;
            flag = this.email.equals(tempuser.email);
        }
        return flag;
    }

    @Override
    public int hashCode(){
        return username.length();
    }

    // Overrriding hashCode() method to return length of username
    @Override
    public String toString(){
        return this.username + " : " + this.email;
    }
}

class DupicateUser{
    public static void main(String[] args) {
        // Creating a list of users
        List<User> userList = new ArrayList<>();
        userList.add(new User("Max","fgc123","max@infy.com"));
        userList.add(new User("Mike","hdgsh@","imike@infy.com"));
        userList.add(new User("John","ucantseeme","jojo@infy.com"));
        userList.add(new User("Moby","fgc123","iammoby@infy.com"));
        userList.add(new User("Moby","fgc123","iammoby@infy.com"));

        // Creating user set from list
        Set<User> userSet = new LinkedHashSet<>();
        userSet.addAll(userList);

        // Printing all
        for(User user : userSet){
            System.out.println(user);
        }
    }
}
//Step1: execute the program, observe objects printed
//Step2: uncomment equals() and hashCode(), observe objects printed