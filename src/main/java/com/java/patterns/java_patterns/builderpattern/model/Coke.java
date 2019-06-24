package com.java.patterns.java_patterns.builderpattern.model;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 5f;
    }
}
