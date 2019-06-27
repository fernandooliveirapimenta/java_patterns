package com.java.patterns.java_patterns.proxypattern.impl;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("teste_10mb.jpg");

        image.display();

        System.out.println("");

        image.display();

    }
}
