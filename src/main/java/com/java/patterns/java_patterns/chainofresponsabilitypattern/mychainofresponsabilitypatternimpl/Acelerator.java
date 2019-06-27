package com.java.patterns.java_patterns.chainofresponsabilitypattern.mychainofresponsabilitypatternimpl;

public class Acelerator extends AbstractCar {

    public Acelerator(int priority) {
        this.priority = priority;
    }

    @Override
    void exec(String function) {

        System.out.println("Acelerator: " + function);
    }
}
