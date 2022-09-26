package com.infosys.java811.interfaceClass;

public interface Pet {
    public String cuddle();
    public void eat();
}

class Doggy implements Pet{
    public String cuddle(){
        return "Purring Sound.";
    }

    public void eat(){
        System.out.println("Eating stereotypical bones.");
    }
}

class Catie implements Pet{

    public String cuddle(){
        return "Yawning Sounds.";
    }

    public void eat(){
        System.out.println("Eating stereotypical fish.");
    }
}

class PetAdoptCenter{
    public static void adoptPet(Pet pet){
        System.out.println("You have successfully adopted the pet.");
    }

    public static void main(String[] args) {
        Doggy dog = new Doggy();
        adoptPet(dog);

        Catie cat = new Catie();
        adoptPet(cat);
    }
}
