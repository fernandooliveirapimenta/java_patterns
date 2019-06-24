package com.java.patterns.java_patterns.builderpattern.model;

public abstract class Burger implements ItemInterface {

    @Override
    public PackingInterface packing() {
        return new Wrapper();
    }
}
