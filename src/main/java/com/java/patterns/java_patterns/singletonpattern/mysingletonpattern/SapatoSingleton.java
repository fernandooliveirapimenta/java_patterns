package com.java.patterns.java_patterns.singletonpattern.mysingletonpattern;

public class SapatoSingleton {

    private static SapatoSingleton instance = new SapatoSingleton();

    private SapatoSingleton() {

    }

    public static SapatoSingleton getInstance(){
        return instance;
    }

    public void tipo(){
        System.out.println("Corrida");
    }
}
