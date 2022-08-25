package com.infosys.enhancedForEachLoop;

import java.util.Scanner;

public class Exercise {
    static int [] arr;

    public static void store(){
        Scanner sc = new Scanner(System.in);
        arr = new int[5];
        System.out.println("Enter the Marks of 5 subjects: ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void display(){
        System.out.println("Your 5 Subjects Marks Are: ");

        for(int marks : arr){
            System.out.println("The marks are: " +marks);
        }
    }

    public static void main(String[] args) {

        Exercise.store();
        Exercise.display();
    }
}
