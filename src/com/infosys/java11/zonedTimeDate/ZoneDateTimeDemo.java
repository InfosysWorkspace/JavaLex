package com.infosys.java11.zonedTimeDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
*   Problem Statement
        Consider a case where the date and time needs to be represented for
        different users of the application who are globally located. They need to
        get the date and time, login time, meeting scheduled time etc., based on
        their local date and time.
        ZonedDateTime class in Java helps in meeting the above requirement.

        ZonedDateTime is a class that represents a date and time with time zone. E.g.
        2020-06-11T19:22:59.235+05:30[Asia/Calcutta] represent the date and time in India.

        ZonedDateTime is an immutable class present in java.time package. This class can
        represent all date and time fields to a precision of nanoseconds.
        It provide various methods like now(), of(), withZoneSameInstant(), toLocalTime() etc.
        for creating a ZonedDateTime or for modifying it.

        Below given code demonstrates some of the methods of ZonedDateTime class.
* */
public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime defaultTime = ZonedDateTime.now(); // Show EDT on Lex
        System.out.println("Default time and zone: \t\t" +defaultTime);

        ZonedDateTime timeInDC = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in DC: \t\t" +timeInDC);

        System.out.println();

        // Getting the time in US
        System.out.println("If the current time in DC is " +timeInDC.toLocalTime() + ", in DC it is "
                            + timeInDC.withZoneSameInstant(ZoneId.of("America/New_York")).toLocalTime());


        // Getting the date in India from corresponding date in DC
        System.out.println("Current date in DC is "+timeInDC.toLocalDate() + ". In India it is "
                + timeInDC.withZoneSameInstant(ZoneId.of("Asia/Calcutta")).toLocalDate());
    }
}
