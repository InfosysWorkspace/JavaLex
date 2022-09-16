package com.infosys.java8.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Infosys");
        set.add("Google");
        set.add("IBM");

        for(String s : set){
            System.out.println(" " + s);
            set.clear();
        }

    }
}

//Output: Runtime exception