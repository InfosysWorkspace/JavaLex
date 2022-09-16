package com.infosys.java8.objectOriented.enumKeyword;

public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3),
    WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int value;
    private Day(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}

class UserInterface{
    public static void main(String[] args) {
        // printing all constant of an enum
        for (Day day: Day.values())
            System.out.println("Day: " +day.name()+ " value: " +day.getValue());
    }
}
