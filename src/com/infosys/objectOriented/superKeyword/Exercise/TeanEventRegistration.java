package com.infosys.objectOriented.superKeyword.Exercise;

public class TeanEventRegistration extends EventRegistration{
    private int noOfParticipants;
    private int teamNo;

    TeanEventRegistration(String nameOfEvent, String name, int noOfParticipants, int teamNo){
        super(nameOfEvent, name);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent(){
        if(getNameOfEvent() == "ShakeALeg"){
            this.registrationFee = (50 * getNoOfParticipants());
        } else if(getNameOfEvent() == "Sing&Win"){
            this.registrationFee = (60 * getNoOfParticipants());
        } else if(getNameOfEvent() == "Actathon"){
            this.registrationFee = (80 * getNoOfParticipants());
        }else if(getNameOfEvent() == "PlayAway"){
            this.registrationFee = (100 * getRegistrationFee());
        } else {
            System.out.println("Invalid Entry");
        }

        System.out.println("Thank you " +getName() + " for your participation. " +
                "Your registration fee is: " +getRegistrationFee());
        System.out.println("You are participant no: " +getTeamNo());
    }
}
