package com.java.patterns.java_patterns.observerpattern.impl;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.printf("Hex String: %s \n",Integer.toHexString(subject.getState()).toUpperCase());
    }
}
