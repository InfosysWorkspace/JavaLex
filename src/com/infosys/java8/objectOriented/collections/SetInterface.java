package com.infosys.java8.objectOriented.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        // creating a new set object of type integer
        Set<Integer> sets = new LinkedHashSet<>();

        sets.add(12);
        sets.add(24);
        sets.add(12);

        System.out.println(sets);
    }
}
