package com.infosys.java8.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Infosys");
        a1.add("Google");
        a1.add("IBM");
        a1.add("Amazon");

        for(int i = 0; i < a1.size(); i++){
            a1.remove(i);
            if(a1.get(i++).equals("Google")){
                a1.add("Oracle");
            }
        }
        System.out.println(a1);
    }
}

//Output: [Google, IBM, Oracle]