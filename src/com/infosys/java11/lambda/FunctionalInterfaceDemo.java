package com.infosys.java11.lambda;

/*
Problem Statement

Let's take a closer look at the Built-In Functional Interfaces provided by Java, and see how
they work.

Different types of Built-In Functional Interfaces:

Function<T1,T2>: Function takes only a single argument of type T1 and returns a value of type T2.
Predicate<T>: Predicate takes only a single argument of type T and always returns a Boolean
value.
BiPredicate<T1,T2>: BiPredicate takes two arguments, each of type T1 and T2, and returns a
Boolean value.
Consumer<T>: Consumer consumes/takes only a single argument of type T, does operation/processing
on it, and does not return any value.
Supplier<T>: Supplier takes no arguments, and supplies/returns a value of type T.

*/

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Obtaining cube of a number using Function<T1,T2>
        Function<Integer, Integer> getCube = (value) -> value * value * value;
        Integer resultCube = getCube.apply(6);
        System.out.println(resultCube);
        System.out.println();

        // Checking whether Age is greater than 18 using Predicate<T>
        Predicate<Integer> checkAge = (age) -> age > 18;
        System.out.println("Checking Age using Predicate: "+checkAge.test(19));
        System.out.println();

        // Checking whether experience is greater than 4 and Role is "Manager" using
        // BiPredicate<T1,T2>
        BiPredicate<Integer, String> checkExpRole = (exp, role) -> exp > 4 && role == "Manager";
        System.out.println("Checking Age using BiPredicate: " +checkExpRole.test(5, "Manager"));
        System.out.println();

        // Consuming/Processing a list and displaying its Square using Consumer<T>
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        List<Integer> ramdList = Arrays.asList(1, 2, 3, 4 ,5 ,6 , 7, 8, 9, 10);
        for(Integer i : ramdList)
            consumer.accept(i * i);
        System.out.println();

        // Simply 5 Random Double values using Supplier<T>
        Supplier<Double> generateRandom = () -> Math.random() * 100;
        for(int i = 0; i < 5; i++)
            System.out.println(generateRandom.get());
        System.out.println();

        // Checking whether Age is greater than 18 and returning Custom String using Function<T1,T2>
        Function<Integer, String> funcCheckAge = (var age) -> age > 18? "OK " : "Not OK";
        String result = funcCheckAge.apply(21);
        System.out.println("Is Age OK/NOT OK: " +result);
        System.out.println();

        //The parameter age is declared using var in the above code
        //Its type will be thus inferred as Integer since the generic type is set to
        // Function<Integer, String>

    }
}
