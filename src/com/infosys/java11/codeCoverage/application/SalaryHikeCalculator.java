package com.infosys.java11.codeCoverage.application;

public class SalaryHikeCalculator {
    public float calculateHikeInSalary(Integer experienceInYears, Integer feedbackPoints){
        Float hike = 0.0f;
        if(experienceInYears > 3 && feedbackPoints > 4){
            hike = 35000f;
        } else if (experienceInYears > 2 && feedbackPoints > 4){
            hike = 27000f;
        }else if (experienceInYears > 2 && feedbackPoints > 4){
            hike = 23000f;
        }else {
            hike = 15000f;
        }

        return hike;
    }
}
