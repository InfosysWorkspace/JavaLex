package com.infosys.java11.streams;

import java.util.stream.Stream;

public class StreamLazyDemo {
    public static void main(String[] args) {
        Stream<Integer> intStreams = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //Add forEach(num -> System.out.print(num)) after the map() and
        // observe the change!
        intStreams.filter(num -> num % 2 != 0).map(num -> num * 3).forEach(num -> System.out.print(num));
    }
}
