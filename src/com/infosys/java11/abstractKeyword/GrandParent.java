package com.infosys.java11.abstractKeyword;

abstract class GrandParent {
    abstract void display();
}

abstract class Parent extends GrandParent{
    final void displayInParent(){
        System.out.println("In Parent");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("Child completes Parent and GrandParent");
    }
}

final class GrandChild extends Child{
//    void displayInParent(){} // see what happens here

    void display(){
        System.out.println("In GrandChild");
        super.display();
    }
}

// child GreatGrandChild extends GrandChild () // see what happens here
class AbstractFinalDemo{
    public static void main(String[] args) {
        new GrandChild().display();
    }
}