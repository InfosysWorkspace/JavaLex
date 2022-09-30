package com.infosys.java11.OOPConstruct.exercise;

public class Point {
    private double x;
    private double y;

    Point(){

    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(){

        return 0;
    }

    public double distance(Point point){
        double disTance = Math.sqrt(Math.pow(x- point.x, 2) + Math.pow(y - point.y,2));
        return disTance;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Tester{
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5,6);
    }
}