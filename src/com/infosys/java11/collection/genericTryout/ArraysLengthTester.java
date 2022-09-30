package com.infosys.java11.collection.genericTryout;

/*
    The code given below checks whether the length of two arrays are
    equal or not. The arrays could be of any data type.
*/

public class ArraysLengthTester <T1, T2>{
    public String lengthTester(T1[] arr1, T2[] arr2){
        return (arr1.length == arr2.length ? "Equal" : "Not Equal");
    }

    public static void main(String[] args) {

        String[] sarr = {"A", "B", "C"};
        Integer[] numarr1 = {1, 2, 3, 4};
        Integer[] numarr2 = {4, 5, 6, 6};

        ArraysLengthTester<String, Integer> tester1 = new ArraysLengthTester<>();
        System.out.println(tester1.lengthTester(sarr, numarr1));

        ArraysLengthTester<Integer, Integer> tester2 = new ArraysLengthTester<>();
        System.out.println(tester2.lengthTester(numarr1, numarr2));
    }
}
