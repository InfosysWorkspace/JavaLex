package com.infosys.java11.streams;

import java.util.stream.Stream;

public class StreamReusableDemo {
    public static void main(String[] args) {
        /**
         * Scenario #1
         */
        Stream<String> langNames1 = Stream.of("Java","Python", "C++", "C", "dotNet");
        // Stream Operation #1
//        langNames1.filter(name -> name.charAt(0) == 'C')
//                    .sorted()
//                    .forEach(name -> System.out.println(name));       // Line 1
//
//        // Stream operation #2
        langNames1.map(name -> name.toLowerCase())
                  .forEach(name -> System.out.println(name));

        //Comment Scenario 1 and Uncomment Scenario 2!
        /**
         * Scenario #2
         */
        System.out.println();

        Stream<String> langNames2 = Stream.of("Java","Python", "C++", "C", "dotNet");
//        // Stream operation #1
//        langNames2.filter(name -> name.charAt(0) == 'C')
//                  .sorted();                                          // Line #2

        // Stream operation #2
        langNames2.map(name -> name.toLowerCase())
                  .forEach(name -> System.out.println(name));
    }
}
