package com.infosys.java11.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class TesterHashMap {
    public static void main(String[] args) {
        Map<String, Integer> books = new HashMap<>();
        books.put("Data Structure With Java ", 50);
        books.put("Operation System ", 80);
        books.put("Let Us C ", 70);
        books.put("Java Fundamentals ", 40);

        // Displaying all the key-value pairs present in the map
        System.out.println(books);

        // Traversing the map
        // entrySet() method is used to retrieve all the key-value present in the map
        for(Map.Entry book : books.entrySet()){
            System.out.println(book.getKey()+ ", " +book.getValue());
        }

        // keySet() method returns the keys to the Map
        for(String name : books.keySet()){
            System.out.println("key: "+name);
        }

        // value() method returns the values in the Map
        for (int qty : books.values()){
            System.out.println("value: "+qty);
        }

        // Removing element based on key
        books.remove("Let Us C ");

        // Removjng element based pn value
        // Uncomment the code guven below, execute and observe the output
        //books.remove("Let Us C");

        // Removjng element based pn value
        // Uncomment the code guven below, execute and observe the output
        //books.remove("Let Us C", 50);

        System.out.println(books);

        // Replacing key-value pair in the map
        books.replace("Operating System ", 80, 100);
        System.out.println(books);

        // Setting value by passing key to the map
        System.out.println(books.get("Java Fundamentals "));

        // Printing size of the map
        System.out.println(books.size());

        // Removing all the key-value pairs from the map
        books.clear();

        //Checking if the map is empty
        System.out.println(books.isEmpty());
    }
}
