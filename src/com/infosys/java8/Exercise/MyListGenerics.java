package com.infosys.java8.Exercise;

import java.util.ArrayList;
import java.util.List;

public class MyListGenerics <Object>{
    private List<Object> values = new ArrayList<>();

    public void add(Object value){
        values.add(value);
        System.out.println(values);
    }


    public static void main(String[] args) {
        MyListGenerics<String> myList = new MyListGenerics<>();
        myList.add("Good");

    }
}

// Output: [Good]