package com.infosys.java8.dateAndTime.exercise;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FlightTimes {
    public static void DisplayTime(String zone, ZonedDateTime departure, ZonedDateTime arrival){
        ZonedDateTime zonedDepartureTime = departure.withZoneSameInstant(ZoneId.of(zone));
        ZonedDateTime zonedArrivalTime = departure.withZoneSameInstant(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
        System.out.println("Departure Time - " +zonedDepartureTime.format(formatter));
        System.out.println("Arrival Time - " +zonedArrivalTime.format(formatter));

    }

    public static void main(String[] args) {
        String zone = "America/New_York";
        ZonedDateTime departure = ZonedDateTime.now();
        ZonedDateTime arrival = departure.plus(196, ChronoUnit.HOURS);
        FlightTimes.DisplayTime(zone, departure, arrival);

    }
}
