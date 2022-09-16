package com.infosys.java8.dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeService {
    public static long calculateLOPs(LocalDate startDateLOP, LocalDate endDateLOP){
        Period period = Period.between(startDateLOP, endDateLOP);
        int lops = period.getDays();
        return lops + 1;
    }

    public static void main(String[] args) {
        System.out.println(calculateLOPs(LocalDate.of(2022, 8, 2), LocalDate.of(2022, 9, 4)));;
    }
}
