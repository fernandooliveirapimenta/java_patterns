package com.java.patterns.java_patterns.builderpattern.model;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicker burger";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
