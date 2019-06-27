package com.java.patterns.java_patterns.chainofresponsabilitypattern.mychainofresponsabilitypatternimpl;

public abstract class AbstractCar {

    int priority;

    boolean nomore = false;
    private AbstractCar nextFunction;

    public void setNextFunction(AbstractCar nextFunction) {
        this.nextFunction = nextFunction;
    }

    void play(int priority, String intensity) {
        if(priority >= this.priority && !nomore) {
            exec(intensity);
        }

        if(nextFunction != null && !nomore) {
            nomore =true;
            nextFunction.play(priority, intensity);
        }
    }
    abstract void exec(String intensity);
}
