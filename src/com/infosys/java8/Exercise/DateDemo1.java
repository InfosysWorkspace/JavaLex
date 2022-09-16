package com.infosys.java8.Exercise;

import java.time.LocalDate;

public class DateDemo1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2019-03-07");
        LocalDate date1 = LocalDate.of(2019, 12, 07);
        System.out.println(date.getYear() + date1.getYear()
                + " " + date.compareTo(date1)+","+date1.compareTo(date) );
    }
}

// OUTPUT: 4038 -9,9