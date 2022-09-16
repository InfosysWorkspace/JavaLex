package com.infosys.java8.dateAndTime;

import java.time.LocalDate;

public class AgeFinder {
    public static int getAge(LocalDate DOB){
        LocalDate today = LocalDate.now();
        if(DOB.isAfter(today)){
            if(DOB.equals(today)){
                return 0;
            }else{
                return -1;
            }
        }else {
            return today.getYear() - DOB.getYear();
        }
    }

    public static LocalDate getDateAfterNDays(int N){
        LocalDate today = LocalDate.now();
        LocalDate newDay = today.plusDays(N);
        return newDay;
    }
    public static LocalDate getDateAfterXYearYMonthZDays(int X, int Y, int Z){
        LocalDate today = LocalDate.now();
        LocalDate newDay = today.plusDays(X).plusMonths(Y).plusYears(Z);
        return newDay;
    }

    public static void main(String[] args) {
        LocalDate D1 = LocalDate.of(1985, 05, 07);
        int age = getAge(D1);
        if(age != -1){
            System.out.println("Your age is: " +age+ " year(s)");
        }else {
            System.out.println("You weren't born yet...");
        }

        int N = 15;
        int X = 3;
        int Y = 2;
        int Z = 1;

        LocalDate D2 = getDateAfterNDays(N);
        System.out.println("The day after " +X+ " day(s) is: " +D2);
        LocalDate D3 = getDateAfterXYearYMonthZDays(X, Y, Z);
        System.out.printf("The date after %d year(s), %d month(s), " +
                " and %d days is " + D3, Z, Y, X);
    }
}
