package com.infosys.java8.objectOriented.exceptionClass;

public class TryMathCube {
    public int cube(int n){
        return n * n * n;
    }

    public static void main(String[] args) {

        try {
            TryMathCube tc = new TryMathCube();
            int num = Integer.parseInt(args[1]);
            System.out.println(tc.cube(num));
        } catch(NumberFormatException e){
            System.out.println("Wrong number format...");
        }catch (Exception e){
            System.out.println("All exception caught");
        }finally {
            System.out.println("Program Ended");
        }

    }
}
