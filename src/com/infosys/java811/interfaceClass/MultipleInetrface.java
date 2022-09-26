package com.infosys.java811.interfaceClass;

// Multiple Interface

interface Pets {
    void cuddle();
    void guardDuty();
}

interface ServAnimal {
    void helpCivilians();
    void guardDuty();
}

abstract class Animals{
    public abstract void eat();
}

class Dogs extends Animals implements Pets, ServAnimal{

    @Override
    public void cuddle(){
        System.out.println("Trying to look cute for more cuddles.");
    }

    @Override
    public void helpCivilians(){
        System.out.println("Taking civilians to nearby shelter.");
    }

    /*
    *  As you can see there is more than one common function in both
    *  the interfaces. void guardDuty(). To implement it, we just override
    *  the method in the Dog class.
    */

    @Override
    public void guardDuty(){
        System.out.println("Guarding the perimeter.");
    }

    @Override
    public void eat() {

    }
}