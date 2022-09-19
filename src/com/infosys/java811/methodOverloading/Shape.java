package com.infosys.java811.methodOverloading;

// Method Overloading

public class Shape {
    // find the area of a circle
    public float calculateArea(float radius){
        return 3.14f * radius * radius;
    }

    // Method to find the area of rectangle
    public float calculateArea(float length, float breath){
        return length * breath;
    }
    // Another method to find area of triangle

}

class Tester{
    public static void main(String[] args) {
        Shape shape = new Shape();

        float circleArea = shape.calculateArea(1.7f);
        float rectangleArea = shape.calculateArea(2.5f, 3.4f);

        System.out.println("Area of a Circle: " +circleArea);
        System.out.println("Area of a Rectangle: " +rectangleArea);
    }
}
