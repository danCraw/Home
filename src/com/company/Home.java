package com.company;

import java.util.Comparator;

public class Home  {
    private int price;
    private int square;
    private int roms;

    public Home(int price, int square, int roms) {
        this.price = price;
        this.square = square;
        this.roms = roms;
    }
    int getPrice(){
        return price;
    }
    int getSquare(){
        return square;
    }
    int getRoms(){
        return roms;
    }
}


