package com.infosys.operators;

public class CalculateWithOperators {

    public static void main(String[] args) {
        int res = 1 + 3;
        System.out.println(res);

        res -= 1; //result is now 3
        System.out.println(res);

        res *= 1; //result is now 3
        System.out.println(res);

        res /= 1; //result is now 3
        System.out.println(res);

        res += 8; //result is now 11
        res %= 7; //result is now  4
        System.out.println(res);
    }
}
