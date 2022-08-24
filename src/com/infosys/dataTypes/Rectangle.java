package com.infosys.dataTypes;

public class Rectangle {

    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }

    public void setLength(int leng){
        this.length = leng;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int bred){
        this.breadth = bred;
    }

    public int calculatePerimeter(){

        int perimetr = 2*(length + breadth);
        return perimetr;
    }

    public static void main(String[] args) {
        var ex = new Rectangle();


        ex.calculatePerimeter();

        ex.setLength(15);
        ex.setBreadth(12);



        System.out.println("The Length of the Rectangle is: " +ex.getLength());
        System.out.println("The Breadth of the Rectangle is: " +ex.getBreadth());
        System.out.println("The Perimeter of a Rectangle is: " +ex.calculatePerimeter());
    }
}




