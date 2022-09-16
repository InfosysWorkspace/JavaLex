package com.infosys.java8.objectOriented.superKeyword.Exercise;

public class EventRegistration {
    private String name;
    private String nameOfEvent;
    public double registrationFee;

    public EventRegistration(String name, String nameOfEvent){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent(){
        System.out.println("Event: ShakeALeg, Base Fee: 100");
        System.out.println("Event: Sing&Win, Base Fee: 150");
        System.out.println("Event: Actathon, Base Fee: 70");
        System.out.println("Event: PlayAway, Base Fee: 130");
    }
}
