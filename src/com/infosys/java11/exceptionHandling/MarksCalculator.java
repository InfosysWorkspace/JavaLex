package com.infosys.java11.exceptionHandling;

public class MarksCalculator {
    public static void calculateAverage(int... marks){
        if(marks.length != 0){
            int sum = 0;
            for(int i = 0; i < marks.length; i++){
                sum += marks[i];
            }
            System.out.println("Average marks: " +sum/marks.length);
        } else {
            throw new ArithmeticException("The marks list is not updated.");
        }

    }

    public static void main(String[] args) {
        try{
            calculateAverage();
            // pass some values and observe the output
            // calculateAverage(60,34,45,22);
        } catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        } catch(Exception exception){
            System.out.println("Some error occurred,");
        }
    }
}
