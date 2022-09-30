package com.infosys.java811.collection;

import java.util.ArrayList;
import java.util.List;

/*
    Here are some useful methods like add(), set(), get(),
    size() of ArrayList discussed in the code given below.
    Execute the code, observe the result by changing its values.
*/
public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // adding the element to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // print the ArrayList
        System.out.println("My number List: " +numbers);

        // Adding the number 15 at a particular index (index: 2) in the ArrayList
        numbers.add(2, 13);
        System.out.println("Observe the second index: "+numbers);

        // Finding the size of the ArrayList
        System.out.println("The array size: " +numbers.size());

        // Retrievig the element at a specified index
        System.out.println("The number present at the fifth index is: " +numbers.get(5));

        // Modifying the element at a specified index
        numbers.set(2, 200);
        System.out.println("The number at the 2nd index is chamged from 13 to 200: " +numbers);
    }
}
