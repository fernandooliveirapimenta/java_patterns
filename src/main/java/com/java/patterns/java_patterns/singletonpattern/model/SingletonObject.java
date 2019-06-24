package com.java.patterns.java_patterns.singletonpattern.model;


public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject() { }

    public static SingletonObject getInstance() {

        if(instance == null) {
            instance = new SingletonObject();
            return instance;
        } else  {
            return instance;
        }
    }

    public void showMessage() {
        System.out.println("message show");
    }
}
