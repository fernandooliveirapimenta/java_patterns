package com.java.patterns.java_patterns.chainofresponsabilitypattern.impl;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error: " + message);
    }
}
