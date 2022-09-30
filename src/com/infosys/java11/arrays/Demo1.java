package com.infosys.java11.arrays;

public class Demo1 {
    public static void main(String[] args) {

        int scores [] = {281, 344, 265, 272, 236,324,287};
        double sum = 0, avg = 0;

        for(int score : scores){
            sum = sum + score;
        }

        avg = sum / scores.length;
        System.out.println("The average score of the team is: " +avg);

    }
}
