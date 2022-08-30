package com.infosys.objectOriented.varargs;

public class Execute {
    public static void main(String[] args) {
        Employee employee = new Employee("E10001");
        int rewardPoint = employee.reward(100000, 200000,300000);

        Employee employee1 = new Employee("E10002");
        int rewardPoint1 = employee1.reward(100000, 1000000);

        System.out.println(employee.getEmployeeId()+ " has got a reward of " +rewardPoint);
        System.out.println(employee1.getEmployeeId()+ " has got a reward of " +rewardPoint1);
    }
}
