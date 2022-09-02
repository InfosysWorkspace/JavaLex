package com.infosys.objectOriented.collections.listExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayExercise {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Buhari");
        names.add(new String("Aisha"));
        names.add("Maryam");
        names.add(new String("Fatima"));

        // Traverse the list in forward
        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            String nm = (String) iterator.next();
            System.out.println(nm);
        }

        System.out.println("************** Reverse ************");
        // Traverse reverse direction
        ListIterator<String> iterator1 = names.listIterator(names.size());
        while(iterator1.hasPrevious()){
            String st = (String) iterator1.previous();
            System.out.println(st);
        }

        System.out.println();
    }


}
