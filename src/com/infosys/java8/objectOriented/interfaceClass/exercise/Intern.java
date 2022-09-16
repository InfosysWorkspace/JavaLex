package com.infosys.java8.objectOriented.interfaceClass.exercise;

public class Intern implements DataProvider{
    int marksSecured;
    int graceMarks;

    void Intern(int marksSecured, int graceMarks){
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    public void calcPercentage(){
        marksSecured = marksSecured + graceMarks;
        if(marksSecured > 8000){
            System.out.println("Please enter correct Marks");
        }else{
            System.out.println("The total aggregate percentage secured " +
                    "is: " +((float)marksSecured/totalaximumMarks)*100);
        }
    }
}

class Trainee implements DataProvider{
    int marksSecured;
    void Trainee(int marksSecured){
        this.marksSecured = marksSecured;
    }

    public void calcPercentage(){
        System.out.println("The total aggregate percentage secured " +
                "is: " +((float)marksSecured/totalaximumMarks)*100);
    }

}


class DataCalculator{
    public static void main(String[] args) {
        Intern intern = new Intern();
        Intern intern1 = new Intern();
        Trainee trainee = new Trainee();

        intern.Intern(5000, 500);
        intern.calcPercentage();

        intern1.Intern(8000, 560);
        intern1.calcPercentage();

        trainee.Trainee(6000);
        trainee.calcPercentage();
    }
}