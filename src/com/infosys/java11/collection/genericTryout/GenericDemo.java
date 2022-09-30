package com.infosys.java11.collection.genericTryout;

import java.util.ArrayList;
import java.util.List;

/*
    The code given below contains a demo on Generics which helps in
    finding the longest string  from a given list of strings.
*/

public class GenericDemo {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Harrison");
        nameList.add("Sirius");
        nameList.add("James");
        nameList.add("Lily");
        nameList.add("Cho");
        nameList.add("Hermione");
        findLongestString(nameList);
    }

    public static void findLongestString(List<String> list){
        String longest = "";
        for (String object : list){
            if(object.length() > longest.length()){
                longest = object;
            }
        }
        System.out.println("The string having the maximum length is "+longest);
    }
}
