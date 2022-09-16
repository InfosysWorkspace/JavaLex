package com.infosys.java8.objectOriented.generics.exercise;

public class SimpleGenerics<T> {

    public T obj;

    public SimpleGenerics(){
    }
    public void showObjectType(T obj){
        System.out.println("Object Type is: " +obj.getClass().getName());
    }
}

class SimpleGenericDemo{
    public static void main(String[] args) {
        SimpleGenerics<String> simpleGenerics = new SimpleGenerics<>();
        simpleGenerics.showObjectType("Hello");
    }
}
