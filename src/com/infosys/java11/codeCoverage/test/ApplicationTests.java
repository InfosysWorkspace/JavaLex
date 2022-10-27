package com.infosys.java11.codeCoverage.test;

import com.infosys.java11.codeCoverage.application.SalaryHikeCalculator;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class ApplicationTests {

    @Test
    public void calculateHikeInSalaryValidTest1(){
        SalaryHikeCalculator s1 = new SalaryHikeCalculator();
        Integer experience = 6;
        Integer feedback = 5;
        Float actual = s1.calculateHikeInSalary(experience, feedback);
        Assertions.assertEquals(35000, actual);
    }

}
