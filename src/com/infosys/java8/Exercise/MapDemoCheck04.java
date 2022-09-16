package com.infosys.java8.Exercise;


import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapDemoCheck04 {
    // Java program to check whether the given number is even or odd
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(2,"A");
        map.put(1,"B");
        map.put(3,"C");
        map.put(null,"E");// 1
        map.put(4,null);// 2
        map.put(1,"D");// 3

        Collection<String> collection = map.values();
        for(String element : collection){
            System.out.println(element);
        }
    }

}

// OUTPUT: Runtime at line 1