package com.infosys.java811.exceptionHandling;

public class ValidationException extends Exception{
    public ValidationException(String message){
        super(message);
    }
}

class AgeValidator{
    // throws keyword indicates that this method might throw an exception
    public void checkAge(int age) throws ValidationException{
        if(age > 19){
            throw new ValidationException("Not eligible to be selected");
            // throw keyword explicitly throw an exception
        } else{
            System.out.println("Eligible to be selected");
        }
    }
}

class Testry{
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        int [] agelist = {15, 16, 18, 17, 19, 20,14, 15};
        for (int index : agelist){
            try {
                validator.checkAge(index);
            } catch (ValidationException e){
//                e.printStackTrace();
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}