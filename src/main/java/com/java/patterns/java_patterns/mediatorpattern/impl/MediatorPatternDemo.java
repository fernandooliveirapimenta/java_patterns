package com.java.patterns.java_patterns.mediatorpattern.impl;

public class MediatorPatternDemo {

    public static void main(String[] args) {
       User robert = new User();
       robert.setName("Robert");

        User john = new User();
        john.setName("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hi! Robert!");
    }
}
