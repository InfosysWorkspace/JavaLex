package com.infosys.java11.interfaceClass;

public interface Mammal {
    void run();
}

interface Cat extends Mammal{
    void eat();
}
interface Lion extends Cat{}

class Animal implements Lion{
    public void run(){
        System.out.println("Pouncing around");
    }

    public void eat(){
        System.out.println("Too full to eat!");
    }
    // It can have more own methods
}

class TesterInt{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.run();
    }
}
