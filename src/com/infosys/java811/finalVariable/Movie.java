package com.infosys.java811.finalVariable;

public class Movie {
    final String name = "The Godfather";
    void watchMovie(){
        // name = "Chinatown";
        System.out.println("Movie Name: " +name);
    }

    final int shows; // (blank/unassigned) final variable
    public Movie(){
        shows = 400;
        System.out.println("Total shows: " +shows);
    }

    static final float price; // static blank final variable
    static {
        price = 200.25f;
        System.out.println("Price: "+Movie.price);
    }
}

class Testerer{
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.watchMovie();
    }
}
