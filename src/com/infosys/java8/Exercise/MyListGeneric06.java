package com.infosys.java8.Exercise;

import java.util.ArrayList;
import java.util.List;

public class MyListGeneric06 <T extends Number>{
    private List<T> values = new ArrayList<>();

    public void add(T value){
        values.add(value);
        System.out.println(values);
    }

    public void remove(T value){
        values.remove(value);
    }

    public T get(int i){
        return values.get(i);

    }

    public static void main(String[] args) {
//        MyListGeneric06<Integer> myList = new MyListGeneric<Float>();
//        myList.add(98.7f);
//        myList.add(1009);
    }
}

//OUTPUT: compilation error