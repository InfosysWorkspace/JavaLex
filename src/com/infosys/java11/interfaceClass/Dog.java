package com.infosys.java11.interfaceClass;

public class Dog {
    public String cuddle(){
        return "Purring sounds";
    }

    public void eat(){
        System.out.println("Eating stereotypical bones");
    }
}

class Cats {
    public String cuddle(){
        return "Yawning sound";
    }
    public void eat(){
        System.out.println("Eating stereotypical fish.");
    }
}

class PetAdoptionCenter{

    public static void adoptPet(Dog pet){
        System.out.println("You have successfully adopted the dog.");
    }

    public static void adoptPet(Cats pet){
        System.out.println("You have successfully adopted the cat.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        adoptPet(dog);

        Cats cat = new Cats();
        adoptPet(cat);
    }
}