package com.infosys.java11.mapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


/*
    Problem Statement

    * The code given below demonstrates how to create and initialize various types of
    * maps like HashMap, TreeMap, and LinkedHashMap. Try to understand how these maps
    * differ the pattern of storing elements.
*/
public class MapDemo {
    public static void main(String[] args) {
        System.out.println("======== HASHMAP ========");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(2, "two");
        map.put(2, "two");
        map.put(2, "two");
        // Elements will be printed in random order
        System.out.println(map);

        System.out.println("======== TREEMAP ========");
        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(1, "One");
        tmap.put(5, "Five");
        tmap.put(7, "Seven");
        tmap.put(2, "two");
        tmap.put(21, "twenty one");
        tmap.put(2, "two");
        // Element will be printed in sorted order of keys
        System.out.println(tmap);

        System.out.println("======== LINKEDHASHMAP ========");
        Map<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(1, "One");
        lmap.put(5, "Five");
        lmap.put(7, "Seven");
        lmap.put(2, "two");
        lmap.put(21, "twenty one");
        lmap.put(2, "two");
        // Element will be printed in insertion order
        System.out.println(lmap);

    }
}
