package com.infosys.thisKeyword;

public class Chocolate {
    private String barCode;
    private String name;
    private int weight;
    private int cost;

    Chocolate(String barCode, String name, int weight, int cost){
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getBarCode(){
        return barCode;
    }

    public void setBarCode(String barCode){
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void display(){
        System.out.println("The Barcode: " +barCode);
        System.out.println("The name of the chocolate is: " +name);
        System.out.println("The weight of the chocolate is: " +weight);
        System.out.println("The chocolate cost: " +cost);
    }

    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("101", "Cadbury",
                12, 10);

        chocolate.display();

        System.out.println("******************************");

        chocolate.setBarCode("102");
        chocolate.setName("Hershey");
        chocolate.setWeight(24);
        chocolate.setCost(50);

        System.out.println("The Barcode is: " +chocolate.getBarCode());
        System.out.println("The new chocolate name is: " +chocolate.getName());
        System.out.println("The weight is: " +chocolate.getWeight());
        System.out.println("The cost is: " +chocolate.getCost());
    }
}
