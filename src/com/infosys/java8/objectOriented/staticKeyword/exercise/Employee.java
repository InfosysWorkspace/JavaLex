package com.infosys.java8.objectOriented.staticKeyword.exercise;

public class Employee {
    private int points;

    public Employee(int point){
        if(point > 100){
           this.points = 100;
        } else if(point < 1){
            this.points = 1;
        } else{
            this.points = point;
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
class PerformanceRating{
    static int outstanding = 5;
    static int good = 4;
    static int average = 3;
    static int poor = 2;

    static int calculatePerformance(Employee E){
        int point = E.getPoints();
        if(point >= 80 && point <= 100){
            return outstanding;
        } else if (point >= 60 && point <= 79) {
            return good;
        } else if ( point >= 50 && point <= 59) {
            return average;
        } else {
            return poor;
        }
    }
}