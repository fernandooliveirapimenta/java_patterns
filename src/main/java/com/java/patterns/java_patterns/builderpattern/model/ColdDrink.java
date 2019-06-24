package com.java.patterns.java_patterns.builderpattern.model;

public abstract class ColdDrink implements ItemInterface{

    @Override
    public PackingInterface packing() {
        return new Bottle();
    }
}
