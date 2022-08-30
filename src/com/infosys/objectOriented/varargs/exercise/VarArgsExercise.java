package com.infosys.objectOriented.varargs.exercise;

import java.util.Arrays;

public class VarArgsExercise {
    public static void displayList(int... input){
        System.out.println("Item in the Array");
        System.out.println(Arrays.toString(input));
    }

    public static void maxOfList(int...input){
        int maxNumber = 0;
        for(int i = 0; i < input.length; i++ ){
            if(input[i] > maxNumber){
                maxNumber = input[i];
            }
        }
        System.out.println("The max number in the array is: " +maxNumber);
    }

    public static void sortList(int... input){
        System.out.println("Unsorted Array: " +Arrays.toString(input));
        for(int i = 0; i < input.length; i++){
            for(int j = i + 1; j < input.length; j++){
                int temp = 0;
                if(input[i] > input[j]){
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: " +Arrays.toString(input));
    }

    public static void averageList(int... input){
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }

        int avg = sum / input.length;

        System.out.println("The average of all items in the list is: " +avg);
    }

    public static void main(String[] args) {
        displayList(1, 7, 5, 4, 6, 9, 8);
        maxOfList(1, 7, 5, 4, 6, 9, 8);
        sortList(1, 3, 5, 4, 6, 7, 9);
        averageList(1, 3, 5, 4, 6, 9, 7);
    }

}
