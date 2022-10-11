package com.infosys.java11.setInterface;

import java.util.*;

/*
* Problem Statement
* The code given below demonstrates how to initialize the iterator and its use.
*/
public class DemoIteratorSet {
    public static void main(String[] args) {
        //Creating a list using asList() of Arrays class
        List<Integer> numList = Arrays.asList(5, 3, 8);

        //Converting list to HashSet
        Set<Integer> hset = new HashSet<>(numList);

        // Creating iterator object over a set using iterator() method
        Iterator<Integer> it = hset.iterator();

        // Using hasNext() method to find if the next element is present
        while (it.hasNext()){
            //using next() to get the next element
            System.out.println(it.next());
        }

    }
}
