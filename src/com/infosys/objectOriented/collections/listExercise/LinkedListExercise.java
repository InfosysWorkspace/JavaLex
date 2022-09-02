package com.infosys.objectOriented.collections.listExercise;


import java.util.LinkedList;

public class LinkedListExercise {

    public static void main(String[] args) {
        LinkedList<String> lists = new LinkedList<>();
        lists.add("Maiwada");
        lists.add("Nasir");
        lists.add("Ni'imat");
        lists.add("Buhari");

        System.out.println("************ For Loop *************");

        for(int i = 0; i<lists.size(); i++){
            System.out.println(lists.get(i));
        }

        System.out.println("************ Removing first and last *************");

        lists.removeFirst();
        lists.removeLast();

        System.out.println("************ For Enhanced Loop *************");

        for(String s : lists){
            System.out.println(s);
        }
    }
}
