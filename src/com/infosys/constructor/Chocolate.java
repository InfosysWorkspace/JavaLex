package com.infosys.constructor;

public class Chocolate {

    private int barCode;
    private String name;
    private int weight;
    private int cost;

    public Chocolate (){
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    public int getBarCode(){
        return barCode;
    }

    public void setBarCode(int barCode){
        this.barCode = barCode;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public static void main(String[] args) {
        //Create an object of chocolate
        Chocolate chocolate = new Chocolate();

        //Use getter methods to display the values
        System.out.println("Barcode " +chocolate.getBarCode()+ ", Name: "
                + chocolate.getName() + ", Weight: " + chocolate.getWeight()
                + ", Cost: " +chocolate.getCost());

        System.out.println(" ");

        //use setter methods to modify the values
        chocolate.setBarCode(102);
        chocolate.setName("Hershey");
        chocolate.setWeight(24);
        chocolate.setCost(50);

        //user getter method to display the modified values
        System.out.println("Modified values: " + chocolate.getBarCode());
        System.out.println("Barcode " +chocolate.getBarCode() + ", Name: "
                + chocolate.getName() + ", Weight: " +chocolate.getWeight()
                + ", Cost: " + chocolate.getCost());
    }



}
