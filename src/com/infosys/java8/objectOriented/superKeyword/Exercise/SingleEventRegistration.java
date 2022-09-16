package com.infosys.java8.objectOriented.superKeyword.Exercise;

public class SingleEventRegistration extends EventRegistration{
    private int participantNo;

    SingleEventRegistration(String name, String nameOfEvent, int participantNo ){
        super(name, nameOfEvent);
        this.participantNo = participantNo;

    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public void registerEvent(){

        if(getNameOfEvent() == "ShakeALeg"){
            this.registrationFee = 100;
        } else if (getNameOfEvent() == "Sing&Win") {
            this.registrationFee = 150;
        } else if (getNameOfEvent() == "PlayAway"){
            this.registrationFee = 130;
        }else {
            System.out.println("Invalid Entry");
        }


        System.out.println("Thank you " +getName()+ " for your participation. " +
                "Your registration fee is: " +getRegistrationFee());
        System.out.println("You are participant no: " +getParticipantNo());
    }
}
