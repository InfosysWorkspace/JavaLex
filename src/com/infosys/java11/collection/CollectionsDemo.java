package com.infosys.java11.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    We have seen that the Collections Framework implements several
    algorithms for manipulating collections. Collections is a class
    which contains various static methods to perform operations on
    collections. If any of the methods is given an empty collection
    to operate upon then it will throw NullPointerException.

    The code given below demonstrates sort(), reverse(), max(), min(),
    frequency(), swap() and shuffle() methods of Collections class.

 */

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(50);
        list1.add(15);
        list1.add(20);
        list1.add(1);

        // Sorting the collection
        Collections.sort(list1);
        System.out.println("The sorted list: "+list1);

        // Reversing the collection
        Collections.reverse(list1);
        System.out.println("The reverse list: "+list1);

        // Finding the mxaimum in the collection
        Integer max = Collections.max(list1);
        System.out.println(max);

        // Finding the minimum in a collection
        Integer min = Collections.min(list1);
        System.out.println(min);

        // Finding frequency of an element in a collection
        Integer freq = Collections.frequency(list1, 1);
        System.out.println(freq);

        // Swapping two elements in a collection
        Collections.swap(list1, 2, 4);
        System.out.println(list1);

        // Shuffling the elements in a collection
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
