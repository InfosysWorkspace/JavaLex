package com.infosys.array;

public class EmployeeRecord {

    double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
    int lessThanAverage = 0;
    int greaterThanAverage = 0;
    double sum = 0;
    double average = 0;

    public static void main(String[] args) {

        EmployeeRecord emp = new EmployeeRecord();

         for (int i = 0; i < emp.salary.length; i++){
             emp.sum = emp.sum + emp.salary[i];
         }
         emp.average =  emp.sum/emp.salary.length;
        System.out.println("The average salary of the employee is: " + emp.average);

        if(emp.average != 0){
            for(int i = 0; i < emp.salary.length; i++){
                if(emp.salary[i] > emp.average){
                    emp.greaterThanAverage++;
                }
            }

            for(int i = 0; i < emp.salary.length; i++){
                if(emp.salary[i] < emp.average){
                    emp.lessThanAverage++;
                }
            }
        }
        System.out.println("The number of employees having salary less than is: " +emp.lessThanAverage);
        System.out.println("The number of employees having salary greater is: " +emp.greaterThanAverage);
    }
}
