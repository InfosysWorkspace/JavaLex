package com.infosys.java11.setInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {
    public static void main(String[] args) {
        // Creating HashSet
        Set<String> food = new HashSet<>();

        // Checking if a HashSet is empty
        System.out.println("Is the set empty? " +food.isEmpty());

        //Adding elements to the HashSet
        food.add("Pasta");
        food.add("Noodles");
        food.add("Sandwich");
        food.add("Pasta");
        food.add("Burger");
        food.add("Noodles");
        System.out.println("Set output without the duplicates: ");
        System.out.println(food);

        //Finding the size of the Hashset
        System.out.println("The number of food items in the set: " +food.size());

        //Checking if the HashSet contains at the given element
        String foodItem = "Pasta";
        if(food.contains(foodItem)){
            System.out.println(foodItem + " is ordered.");
        } else {
            System.out.println(foodItem + " is not ordered.");
        }

        //Removing an element from HashSet
        System.out.println("Remove burger from the set: " +food.remove("Burger"));
        System.out.println("Output after removing burger from the set: "+food);

        // Traversing elements
        Iterator<String> item = food.iterator();

        while (item.hasNext()){
            System.out.println(item.next());
        }

        //Removing all the elements from the HashSet
        food.clear();
        System.out.println("After clear() => " +food);
    }
}
