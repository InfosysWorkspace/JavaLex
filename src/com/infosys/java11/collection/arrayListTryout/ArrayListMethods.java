package com.infosys.java11.collection.arrayListTryout;


import java.util.ArrayList;
import java.util.List;

/*
    Observe the code which shows a few more useful methods of ArrayList
    which makes list operations easier. Methods like size(), isEmpty(),
    toArray(), clear().
*/
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String > names = new ArrayList<>();

        names.add("Brian");
        names.add("Ross");
        names.add("Steve");
        names.add("Rachel1");
        names.add("Steve");

        // Checking whether any element is present
        if(names.isEmpty()){
            System.out.println("No names are present!! ");
        }

        // Displaying the number of names in the list
        List<String> newNames = new ArrayList<>();
        newNames.add("Emily");
        newNames.add("Melissa");

        // Adding elements of newNames list into names list
        names.addAll(newNames);

        // Displaying all names
        System.out.println("The list of names: ");
        System.out.println("==================================");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("==================================");

        // Checking whether the name Ross is present or not
        if(names.contains("Ross")){
            System.out.println("The name is present already!!!");
        } else {
            System.out.println("The name is not present!!");
        }

        // Converting list to array
        Object[] nameArray = names.toArray();

        // Deleting all the items from orders
        names.clear();

        System.out.println(names.isEmpty());
    }
}
