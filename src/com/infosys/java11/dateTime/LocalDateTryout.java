package com.infosys.java11.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
    Problem Statement

    Here are a few examples showing how LocalDate methods makes date operations easier with their methods like plusDays(),plusWeeks(),plusMonths(),plusYears(),minusDays(),minusWeeks(),minusMonths,()minusYears(),isBefore(),isAfter(),getDayOfWeek() & getMonth(),format().
    Do make changes to the code if you're feeling curious enough.
*/

public class LocalDateTryout {
    public static void main(String[] args) {
        // To print today's date which function should i use?
        // LocalDate provides the output in the form of YYYY-MM-DD
        LocalDate today = LocalDate.now();

        // Invoking the static now() will return the current date from the system clock.
        System.out.println("Today's date is: "+today);

        /*
             * To display any date in default format we use of() method.
             * of() takes parameters as public static LocalDate of(int year,Month month,int dayOfMonth)(where Month is enum )
             * Or public static LocalDate of(int year,int month,int dayOfMonth)
             * This returns a LocalDate with the specified year, month and day-of-month
         */

        System.out.println();
        System.out.println("************"+"of()"+"************");
        System.out.println("LocalDate of (2018, 8, 29) :- " +LocalDate.of(2018, 8, 29));
        System.out.println("LocalDate of (2017, Month.APRIL 29) :- "+LocalDate.of(2017, Month.APRIL, 29));

        /*
			To access the date information we have certain methods like getYear(),getMonth(),getDayOfMonth() etc.

		*/
        System.out.println();
        System.out.println("***********DateTimeFormater***********");

        LocalDate date = LocalDate.parse("13 Feb, 2020", DateTimeFormatter.ofPattern("dd MMM, yyyy"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        System.out.println("Input Format is 13 Feb, 2020 \nOutput Format :- " +date);


		/*
			.format() method formats the date according to user defined pattern.

		*/

        String dateString = date.format(DateTimeFormatter.ofPattern("dd/MMM/uuuu"));
        System.out.println(dateString);

        	/*
			The DateTimeFormatter class in Java is used for parsing dates in different formats.
			ofPattern method will create a formatter based on the pattern given by the programmer.
			For example, d MMM yyyy will format 2011-12-03 as '3 Dec 2011'.
		*/


        System.out.println();
        System.out.println("************"+"Functions to access date information"+"************");
        System.out.println("Today's Date: " +LocalDate.now());
        System.out.println("Month in Today's Date :- " +LocalDate.now().getMonth());
        System.out.println("What is the current year going on ....? :- " +LocalDate.now().getYear());
        System.out.println("Which day is today? :- " +LocalDate.now().getDayOfWeek());



		/*
			getDayOfWeek() & getMonth() :- returns an enum instead of int value.
			To get int value, we can use getValue() methods

			Try :- System.out.println("Month in Today's Date :- "+LocalDate.now().getMonth().getValue());
				   System.out.println("Which day is today ? :- "+LocalDate.now().getDayOfWeek().getValue());

		*/


		/*
			Following are methods for localdate calculations
			plusDays(),plusWeeks(),plusMonths(),plusYears(),minusDays(),minusWeeks(),minusMonths,()minusYears()
			All of these methods take parameters having Long datatype
		*/
        System.out.println();
        System.out.println("************"+"LocalDate Calculations"+"************");
        System.out.println("Today's Date :- " +LocalDate.now());
        System.out.println("Date after 7 days? => " +LocalDate.now().plusDays(7));
        System.out.println("Date after 7 days? => " +LocalDate.now().plusMonths(7));
        System.out.println("Date after 7 days? => " +LocalDate.now().plusYears(7));
        System.out.println();

        	/*
			Try :-
					Find the date 20 days ago and 4 months ago and 40 years ago
		*/

        System.out.println();
        System.out.println("************"+"Difference using ChronoUnit"+"************");

        LocalDate dateObj = LocalDate.of(1997, Month.FEBRUARY, 13);
        System.out.println("Difference Between dateObj and today's date in munber of Years");
        System.out.println(ChronoUnit.YEARS.between(dateObj, LocalDate.now()));
        // Calculate the number of days between dateObj and today's date

        	/*
			We can also modify the date using ChronoUnit

		*/
        System.out.println();
        System.out.println("Modification of date using ChronoUnit :- ");
        System.out.println("Today's date is: "+LocalDate.now());
        System.out.println("Date After 5 days: "+LocalDate.now().plus(5, ChronoUnit.DAYS));
        System.out.println("Date After 5 weeks: "+LocalDate.now().plus(5, ChronoUnit.WEEKS));
        System.out.println("Date After 5 months: "+LocalDate.now().plus(5, ChronoUnit.MONTHS));
        System.out.println("Date After 5 years: "+LocalDate.now().plus(5, ChronoUnit.YEARS));

        System.out.println();
        System.out.println("until() with ChronoUnit");
        LocalDate todayObj = LocalDate.now();
        LocalDate date1 = LocalDate.of(2014, 5, 25);
        System.out.println("Difference between todayObj and date1(in terms of Number of Days):- "
                +date1.until(todayObj, ChronoUnit.DAYS));
        System.out.println("Difference between todayObj and date1(in terms of Number of Months):- "
                +date1.until(todayObj, ChronoUnit.MONTHS));
        System.out.println("Difference between todayObj and date1(in terms of Number of Years):- "
                +date1.until(todayObj, ChronoUnit.YEARS));

        	/*
			To Compare two dates we also have compareTo() method
			Method Signature of compareTo() :- int compareTo(chronoLocalDate date)

			It returns the value 0 if the argument Date is equal to this Date.
			It returns a value less than 0 if this Date is before the Date argument.
			It returns a value greater than 0 if this Date is after the Date argument.

			Try Comparing today's date with date1 using compareTo()
		*/
        System.out.println();
        System.out.println("************"+"isAfter() and isBefore()"+"************");
        LocalDate dateFirst = LocalDate.of(2010, 2, 21);
        LocalDate dateSecond = LocalDate.of(2018,2,20);

        System.out.println("dateFirst.isBefore(dateSecond):- "+dateFirst.isBefore(dateSecond));
        System.out.println("dateFirst.isBefore(dateSecond):- "+dateFirst.isAfter(dateSecond));

    }



}
