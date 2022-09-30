package com.infosys.java11.collection.linkedListTryout;

import java.util.ArrayList;

public class Ex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list.addAll(list1);


        System.out.println(list);
    }
}
