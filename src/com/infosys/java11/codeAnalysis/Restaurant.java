package com.infosys.java11.codeAnalysis;

public class Restaurant {
    private String restaurantName;
    private long[] restaurantContacts;
    private String restaurantAddress;
    private float rating;

    public Restaurant(String name, long[] contacts, String address, float rating) {
        this.restaurantName = name;
        this.restaurantContacts = contacts;
        this.restaurantAddress = address;
        this.rating = rating;
    }

    public void displayRestaurantDetails() {
        System.out.println("Restaurant Details \n***************");
        System.out.println("Restaurant Name : " + this.restaurantName);
        System.out.println("Restaurant Rating : " + this.rating);
        for (int index = 0; index < this.restaurantContacts.length; index++) {
            System.out.println("Restaurant Contacts : "
                    + this.restaurantContacts[index]);
        }
        System.out.println("Restaurant Address : " + this.restaurantAddress);
        System.out.println();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public long[] getRestaurantContacts() {
        return restaurantContacts;
    }

    public void setRestaurantContacts(long[] restaurantContacts) {
        this.restaurantContacts = restaurantContacts;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}

