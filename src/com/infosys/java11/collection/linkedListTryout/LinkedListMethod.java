package com.infosys.java11.collection.linkedListTryout;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
    public static void main(String[] args) {

        // Creating a LinkedList
        List<String> cities = new LinkedList<>();

        // Add elements
        cities.add("Milan");
        cities.add("Vernice");
        cities.add("Munich");
        cities.add("Vienna");

        //Displaying elements
        System.out.println(cities);

        // Inserting elements
        cities.add(3, "Prague");
        System.out.println(cities);

        // Removing elements
        cities.remove(2);
        System.out.println(cities);

        // Replacing element
        cities.set(2, "Berlin");
        System.out.println(cities);

        // Displaying size
        System.out.println(cities.size());

        // Checkinh if an element is present
        System.out.println(cities.contains("Paris"));

        // Getting element at specfic position
        System.out.println(cities.get(0));

        // Clearing the elements from the LinkedListed
        cities.clear();
        System.out.println(cities);
    }
}
