package com.infosys.controlStatements.forLoop;

public class ExampleNestedLoop {
    public static void main(String[] args) {
        int i, j;

        //Loop 1
        for(i = 1; i <= 10; i++){
            System.out.println();

            //Loop 2
            for(j = 1; j <= 10; j++){
                System.out.print(j + " ");

                if(j == 5)
                    break;
            }
        }
    }
}
