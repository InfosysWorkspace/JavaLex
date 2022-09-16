package com.infosys.java8.dateAndTime.exercise;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeService {
    public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(startDateLOP, formatter);
        LocalDate end = LocalDate.parse(endDateLOP, formatter);
        long lops = ChronoUnit.DAYS.between(start, end);
        return lops;
    }

    // Other fields and methods
    public static void main(String[] args) throws ParseException{
        System.out.println(EmployeeService.calculateLOPs("02/08/2022", "04/09/2022"));
    }
}
