package com.java.patterns.java_patterns.builderpattern.model;


public class Bottle implements PackingInterface {
    @Override
    public String pack() {
        return "Bottle";
    }
}
