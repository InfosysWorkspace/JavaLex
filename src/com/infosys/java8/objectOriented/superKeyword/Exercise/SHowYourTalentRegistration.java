package com.infosys.java8.objectOriented.superKeyword.Exercise;

public class SHowYourTalentRegistration {
    public static void main(String[] args) {

        SingleEventRegistration sigle = new SingleEventRegistration("Buhari","Sing&Win", 1);
        TeanEventRegistration multiple = new TeanEventRegistration("AuraTeam", "ShakeALeg",5,1);
        SingleEventRegistration single2 = new SingleEventRegistration("Hudson", "PlayAway", 2);

        sigle.registerEvent();
        multiple.registerEvent();
        single2.registerEvent();

    }
}
