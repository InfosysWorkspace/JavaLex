package com.infosys.java11.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Problem Statement
    The code given below sorts a list using the sort method of List
    interface.

    void sort(Comparator<? super E> c): This method sorts elements
    in the given list according to the order mentioned by a Comparator. This method belongs to interface List and takes an implementation of the Comparator interface for the customized sorting of the list.

    Hence, by this method we can sort a list not only on the basis of
    natural order, but also by our own custom format for sorting.

    Comparator is a Built-In Functional Interface, which is used in
    ordering a given collection. It orders the collection using the
    implementation provided for its compare().

    We have been given the list of employeeNames, which we have to sort
    based on the natural ordering and based on the length of each
    element.
*/

// Implementation class for the Comparator Interface
public class SortImplementation  implements Comparator<String> {

    // Compare method overriden
    @Override
    public int compare(String o1, String o2){
        return o1.compareTo(o2);
    }
}

// Another implementation class for the Comparator interface
class SortImplementationTwo implements Comparator<String>{

    // Compare method overriden
    @Override
    public int compare(String o1, String o2){
        return o1.length() - o2.length();
    }
}

class DemoSort{
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Racheal", "Ross", "Monica",
                "Chandler", "Joey", "Phoebe");

        //Displaying employeeNames before sorting
        System.out.println(employeeNames);

        // List.sort() takes the implementation of Comparator interface
        // for inducing the ordering.
        Comparator<String> compare1 = new SortImplementation();
        employeeNames.sort(compare1);

        // Dispalying employeeNames after sorting based on natural ordering
        System.out.println(employeeNames);

        // List.sort() takes the implementation of Comparator interface
        // for inducing the ordering.
        Comparator<String> compare2 = new SortImplementationTwo();
        employeeNames.sort(compare2);

        // Dispalying employeeNames after sorting based on natural ordering
        System.out.println(employeeNames);

    }
}