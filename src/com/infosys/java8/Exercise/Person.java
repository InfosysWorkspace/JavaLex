package com.infosys.java8.Exercise;

import java.util.HashMap;
import java.util.Map;

public class Person {
    String name;
    Person(String name){
        this.name = name;
    }

    public boolean equals(Object obj) {
        return ((Person)obj).name==this.name;
    }

    public int hashCode() {
        return name.length();
    }
}

class MapImpl{
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Jack"), "sendSalesReport");
        map.put(new Person("Jack"), "sendAuditReport");
        map.put(new Person("Mady"), "sendInventoryReport");

        System.out.println(map.size());
    }
}

// Output: 2