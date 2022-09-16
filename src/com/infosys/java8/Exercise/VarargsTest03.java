package com.infosys.java8.Exercise;

public class VarargsTest03 {
    public static void main(String[] args) {
        new VarargsTest03().display(5, "Infosys");
        new VarargsTest03().display(4, "Infosys", "Limited");
    }
    public void display(int b, String... strings){
        System.out.println(strings[strings.length -1] + " ");
    }
}
// OUTPUT: Infosys Limited