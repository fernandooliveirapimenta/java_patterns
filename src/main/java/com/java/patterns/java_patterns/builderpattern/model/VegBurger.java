package com.java.patterns.java_patterns.builderpattern.model;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public float price() {
        return 23.3f;
    }
}
