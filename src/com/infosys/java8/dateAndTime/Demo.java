package com.infosys.java8.dateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Demo {
    public static void main(String[] args) {
        // ZoneDateTme is used to change the time according to zones
        System.out.println("********** Zone Date Time **********");
        System.out.println("ZoneDateTime Now: " + ZonedDateTime.now());
        System.out.println("ZoneDateTime Now: " + ZonedDateTime.now(ZoneId.of("America/New_York")));

        // Period
        System.out.println();
        System.out.println("*********** Period **********");
        LocalDate present = LocalDate.now();
        LocalDate later = present.plusDays(3);
        Period period = Period.between(present, later);
        int lops = period.getDays();
        System.out.println("Difference in days: " +lops);

        // ChronoUnit
        System.out.println();
        System.out.println("*********** CHronoUnit ************");
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " +today);
        LocalDate after = today.minus(1, ChronoUnit.MONTHS);
        System.out.println("Date after 1 month: " +after);

        // DateTimeFormatter
        System.out.println();
        System.out.println("*********** DateTimeFormatter ************");
        LocalDate payslipDate = LocalDate.now();
        System.out.println(payslipDate);
        // Current Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Current Date
        System.out.println(payslipDate.format(formatter));


    }
}
