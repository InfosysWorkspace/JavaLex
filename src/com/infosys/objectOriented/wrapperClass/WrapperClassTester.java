package com.infosys.objectOriented.wrapperClass;

public class WrapperClassTester {
    public static void main(String[] args) {
        int i = 45; // primitive data int
        Integer integer = i; // Integer wrapper class instantiating
        int i2 = integer; // unwrapping primitive data int from wrapper obj
        // all wrapper class except Character can take String in argument.
        Integer integer2 = Integer.valueOf("23");
        System.out.println(integer2);

        Integer intObj1 = 25;
        Integer intObj2 = Integer.valueOf("25");
        Integer intObj3 = 35;

        // compareTo demo
        System.out.println("Comparing using compareTo obj1 and obj2: "
                +intObj1.compareTo(intObj2));
        System.out.println("Comparing using compareTo obj1 and obj2: "
                +intObj1.compareTo(intObj3));

        // equals demo
        System.out.println("Comparing using equals obj1 and obj2: "
                +intObj1.equals(intObj2));
        System.out.println("Comparing using equals obj1 and obj3: "
                +intObj1.equals(intObj3));

        Float f1 = Float.valueOf("2.25f");
        Float f2 = Float.valueOf("20.43f");
        Float f3 = 2.25f;

        System.out.println("Comparing using compare f1 and f2: "
                +Float.compare(f1,f2));
        System.out.println("Comparing using compare f1 and f3: "
                +Float.compare(f1,f3));

        // Adding of Integer with Float
        Float f = intObj1.floatValue() + f1;
        System.out.println("Addition of intObj1 and f1: "
                +intObj1+ " + " +f1+ " = " +f);

        int x = Integer.parseInt("34");
        System.out.println(x);

        double y = Double.parseDouble("34.7");
        System.out.println(y);
    }
}
