package com.infosys.java811.controlStatement;

public class ForEach {
    public static void main(String[] args) {
        int [] numbers = {60, 79, 86, 21, 2, 41, 100};
        int sum = 0;

        // for each loop (Enhanced for loop)
//        for(int num : numbers){
//            if(num % 2 == 0){
//                sum += num;
//            }
//        }

        // Uncomment the below given code and execute it instead of the
        // above loop for understanding the usage of the var in a for-each loop

        for(var numb : numbers){
            if(numb % 2 == 0){
                sum += numb;
            }
        }

        System.out.println("Sum of even numbers: " +sum);
    }

}
