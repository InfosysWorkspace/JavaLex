package com.infosys.java811.OOPConstruct;

// Product class
public class Product {
    private int productId;
    private float price;
    private int stock;

    public void displayDetails(){
        System.out.println("Product Id: " +productId);
        System.out.println("Product Price: " +price);
    }
    public void displayDetails(int discountPercentage){
        System.out.println("Product discount price: "
                +this.getPriceAfterDiscount(discountPercentage));
        if(this.stock > 0)
            System.out.println("Stock Available");
        else
            System.out.println("Stock not available");
    }

    public float getPriceAfterDiscount(int discountPercentage){
        float discountPrice = price - (price * discountPercentage / 100);
        return discountPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

// This is a class which creates new Product objects
class Tester{
    public static void main(String[] args) {

        Product p1 = new Product(); // declaring new object
        p1.setProductId(1001); // setting attributes
        p1.setPrice(400);
        p1.setStock(9);

        Product p2 = new Product();
        p2.setProductId(1009);
        p2.setPrice(500);
        p2.setStock(4);

        Product p3 = new Product();
        p3.displayDetails();
        System.out.println();
        p3.displayDetails();
    }
}