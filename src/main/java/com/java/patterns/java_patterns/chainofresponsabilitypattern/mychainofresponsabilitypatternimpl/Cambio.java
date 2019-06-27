package com.java.patterns.java_patterns.chainofresponsabilitypattern.mychainofresponsabilitypatternimpl;

public class Cambio extends AbstractCar {

    public Cambio(int priority) {
        this.priority = priority;
    }

    @Override
    void exec(String intensity) {
        System.out.println("Cambio: " + intensity);
    }
}
