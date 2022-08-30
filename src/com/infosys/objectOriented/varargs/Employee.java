package com.infosys.objectOriented.varargs;

public class Employee {
    private String employeeId;
    Employee(String employeeId){
        this.employeeId = employeeId;
    }

    public int reward(double... fixedDeposit){ // variable argument
        double sum = 0;
        int rewardPoint = 0;
        for(double deposit : fixedDeposit){
            sum = sum + deposit;
        }

        if(sum > 10000000){
            rewardPoint = 20000;
        } else if (sum < 10000000 && sum >= 5000000){
            rewardPoint = 10000;
        }else{
            rewardPoint = 20000;
        }
        return rewardPoint;
    }

    public String getEmployeeId(){
        return employeeId;
    }
}
