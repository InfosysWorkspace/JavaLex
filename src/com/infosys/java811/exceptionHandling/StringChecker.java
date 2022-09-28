package com.infosys.java811.exceptionHandling;

public class StringChecker {
    public void divideStringLength(){
        String [] sarr = {"Hi", "hello", ""};
        int [] numarr = {1, 0, 5};

        try{
            for(int i = 0; 1 < numarr.length; i++){
                System.out.println("Value: " +numarr[i + 1]/ sarr.length);
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        // no catch block for ArrayIndexOutOfBoundException
        finally {
            System.out.println("In inner finally ");
        }
    }

    public static void main(String[] args) {
        StringChecker checker = new StringChecker();
        try{
            checker.divideStringLength();
        }
        // Exception catch block can catch any Exception
        catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In outter finally ");
        }
    }
}
