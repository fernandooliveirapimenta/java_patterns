package com.java.patterns.java_patterns.observerpattern.impl;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
       this.subject = subject;
       this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.printf("Octal String: %s \n",Integer.toOctalString(subject.getState()));
    }
}
