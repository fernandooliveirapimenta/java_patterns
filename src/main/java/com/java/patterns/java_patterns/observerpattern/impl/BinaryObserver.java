package com.java.patterns.java_patterns.observerpattern.impl;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.printf("Binary String: %s \n",Integer.toBinaryString(subject.getState()));
    }
}
