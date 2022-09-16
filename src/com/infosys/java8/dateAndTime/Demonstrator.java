package com.infosys.java8.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demonstrator {
    public static void main(String[] args) {
        System.out.println("*********** Local Date **********");
        // Creates an object with system date
        LocalDate registrationDate = LocalDate.now();
        System.out.println("Today's date(System.date): " +registrationDate);
        // Adding 3 days to the registartion date
        LocalDate lastDate = registrationDate.plusDays(3);
        System.out.println("Adding 3 days: " +lastDate);
        // Checking whether current date is before the last date
        if(LocalDate.now().isBefore(lastDate)){
            System.out.println("Please take the assessment as soon as possible");
        }
        System.out.println();
        System.out.println("********** LocalTime **********");
        // Creates an object with system time
        LocalTime startTime = LocalTime.now();
        // The time being returned here is according to the region/locals/zone
        // in which the application is hosted.
        System.out.println("Start Time: " +startTime);

        // Adding 1 hour
        LocalTime endTime = startTime.plusHours(1);
        // The time being returned here is according to the region/locale/zone
        // in which the application is hosted
        System.out.println("End Time: " +endTime);

        LocalTime current = LocalTime.now();
        // Getting the hours, minutes and seconds components
        int hour = current.getHour();
        int minutes = current.getMinute();
        int seconds = current.getSecond();
        // The time being returned here is according to the region/locale/zone
        // in which the application is hosted
        System.out.println("Hour: "+hour+ " Minute: " +minutes+ " Second: " +seconds);

        System.out.println();
        System.out.println("************ LocalDateTime ***********");
        LocalDateTime dateTime = LocalDateTime.now();
        // The time being returned here is according to the region/locale/zone
        // in which the application is hosted
        System.out.println("Date and Time: "+dateTime);
        // Subtracting 3 days and output time is in ETC
        System.out.println(dateTime.minusDays(3));
        // Run the above program in your system in order to see the difference

    }
}
