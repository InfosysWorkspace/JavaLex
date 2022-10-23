package com.infosys.java11.lambda;

// User-define interface
interface Operation{
    public double opCriteria(double firstNum, double secondNum);
}

public class CalculatorLambdaExpression {
    // Method taking the two numbers and the operation to be performed
    public static double doOperation(double firstNum, double secondNum, Operation operator){
        return operator.opCriteria(firstNum, secondNum);
    }

    public static void main(String[] args) {
        // Lambda Expression for Addition operation
        Operation add = (x,y) -> x + y;

        // Lambda Expression for Subtraction operation
        Operation subtraction = (x,y) -> x - y;

        // Lambda Expression for Multiplication operation
        Operation multiply = (x,y) -> x * y;

        // Lambda Expression for Division operation
        Operation divide = (x,y) -> x / y;

        System.out.println("Result is: " +doOperation(12, 4, multiply));
    }
}
