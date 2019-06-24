package com.java.patterns.java_patterns.factorypattern.myfactorypattern;

public class MyFactoryPatternDemo {

    public static void main(String[] args) {
        DoceFactory factory = new DoceFactory();

        System.out.println(factory.factory("torta").sabor());
    }
}
