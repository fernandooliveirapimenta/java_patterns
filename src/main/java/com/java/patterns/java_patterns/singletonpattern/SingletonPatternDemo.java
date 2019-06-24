package com.java.patterns.java_patterns.singletonpattern;

import com.java.patterns.java_patterns.singletonpattern.model.SingletonObject;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
        instance.showMessage();

//        SingletonObject o = new SingletonObject();
    }
}
