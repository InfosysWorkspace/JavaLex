package com.infosys.java11.setInterface;

/*
    Problem Statement
    The following code demonstrates, how to create and initialize the various types
    of the set like HashSet, TreeSet and LinkedHashSet. This code further makes you
    understand the method of storing elements in each type of the set.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

    public static void main(String[] args) {
        System.out.println("===========HashSet===========");

        Set<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(45);
        hs.add(1);
        hs.add(85);
        System.out.println("elements will be printed in random order");
        System.out.println(hs);

        System.out.println("===========TressSet===========");
        Set<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(45);
        ts.add(1);
        ts.add(85);
        System.out.println("elements will be printed in sorted order");
        System.out.println(ts);

        System.out.println("===========LinkedHashSet===========");
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(5);
        ls.add(45);
        ls.add(1);
        ls.add(85);
        System.out.println("elements will be printed in insertion order");
        System.out.println(ls);

    }

}
