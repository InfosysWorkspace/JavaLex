package com.infosys.java11.lambda;

/*
Problem Statement

Two Number inputs on which the operations will be done.
An input that specifies the type of operation to be done (assuming add, subtract, multiply
and divide are the only options)
A method doOperations() that processes the number inputs and the operation to de done, and
calls the appropriate method for the operation.
*/
public class CalculatorRegularExpression {
    public static double doOperation(double num1, double num2, String operation){
        switch (operation){
            case "add":
                return addCriteria(num1, num2);
            case "subtract":
                return subtractCriteria(num1, num2);
            case "multiply":
                return multiplyCriteria(num1, num2);
            default:
                //Considering there are no wrong inputs, the default case in for operation="divide"
                return divideCriteria(num1, num2);
        }
    }

    // Method for Addition
    public static double addCriteria(double firstNum, double secondNumber){
        double result = firstNum + secondNumber;
        return result;
    }

    // Method for Subtraction
    public static double subtractCriteria(double firstNum, double secondNumber){
        double result = firstNum - secondNumber;
        return result;
    }

    // Method for Multiplication
    public static double multiplyCriteria(double firstNum, double secondNumber){
        double result = firstNum * secondNumber;
        return result;
    }

    // Method for Addition
    public static double divideCriteria(double firstNum, double secondNumber){
        double result = firstNum / secondNumber;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result is: " +doOperation(12, 4, "multiply"));
    }
}
