package com.infosys.array;

public class Demo {

    public static void main(String[] args) {
        // primitve type array
        int [] phone = new int[3];
        //inserting the element in an array
        phone[0] = 7120686;
        phone[1] = 7120687;
        phone[2] = 7120684;
        int count = 1;
        for(int i = 0; i < phone.length; ++i){ // traversing an array
            System.out.println("phone number "
                    + count + ": " +phone[i]);
            ++count;
        }
    }
}
