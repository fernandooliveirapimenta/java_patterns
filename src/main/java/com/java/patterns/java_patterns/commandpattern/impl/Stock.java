package com.java.patterns.java_patterns.commandpattern.impl;

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.printf("Stock [ Name: %s, Quantity: %d ] bougth \n", name, quantity);
    }

    public void sell() {
        System.out.printf("Stock [ Name: %s, Quantity: %d ] sold \n", name, quantity);
    }
}
