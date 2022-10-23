package com.infosys.java11.lambda;

/*
* Problem Statement

Let's take a deeper look into Lambda Expressions as we observe the difference between
Collections.sort() and list.sort().

Let us consider the following List of String:

List<String> nameList = Arrays.asList("Rachael","Ross","Monica","Chandler","Joey","Phoebe");
This list can be sorted in two ways:

Collections.sort(List<T> list): This method sorts elements in the given list in the ascending
order, according to the natural order of the elements of the list. This method belongs to the
class Collections and takes the List to be sorted

list.sort(Comparator<? super E> c): This method sorts elements in the given list according to
the order mentioned by a Comparator. This method belongs to the interface List and takes a
Lambda Expression for the customized sorting of the list. Hence, by this method we can sort a
list not only on the basis of natural order, but also by our own custom format for sorting.
We can now sort list based on length of each element, first character of each element etc.

So, we can observe how versatile sorting with list.sort() is in comparison to sorting with
Collections.sort().

Note: Comparator is a Built-In Functional Interface, which is used in ordering a given
collection. It orders the collection using the Lambda function provided to it.

For inducing ordering while sorting using Collections class, another overloaded method,
sort(List<T> list, Comparator<? super T> c) can be used.

*/

import com.infosys.java8.Exercise.Strings;

import java.util.*;

public class DemoSorting {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Maiwada", "Aisha", "Fatima", "Karima", "Saifullah","Nasir","Maryam","Buhari");

        //Cloning the nameList for the demo
        List<String> clonedNameList1 = new ArrayList<>(nameList);
        List<String> clonedNameList2 = new ArrayList<>(nameList);
        List<String> clonedNameList3 = new ArrayList<>(nameList);

        /* Sorting using Collections.sort() */
        System.out.println("Sorting done by Collections.sort(): ");
        Collections.sort(nameList);
        System.out.println(nameList);

        System.out.println();

        /* Sorting using list.sort() #1. Sorting using Natural order */
        //Lambda Expression for sorting the list in Natural Order
        Comparator<String> criteria = (str1, str2) -> str1.compareTo(str2);
        System.out.println("Sorting done by list.sort() in Natural Order: ");
        clonedNameList1.sort(criteria);
        System.out.println(clonedNameList1);

        System.out.println();

        /* Sorting using list.sort() #2. Sorting on the basis of first character of element */
        //Lambda Expression for sorting the list on the basis of first character of element
        System.out.println("Sorting done by list.sort() on the basis of first Character:");
        clonedNameList2.sort((str1, str2) -> str1.charAt(0) - str2.charAt(0));
        System.out.println(clonedNameList2);

        System.out.println();

        /* Sorting using list.sort() #3. Sorting on the basis of length */
        //Lambda Expression for sorting the list on the basis of length
        System.out.println("Sorting done by list.sort() on the basis of length:");
        clonedNameList3.sort((str1, str2) -> str1.length() - str2.length());
        System.out.println(clonedNameList3);

        System.out.println();
    }
}
