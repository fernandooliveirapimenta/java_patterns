package com.java.patterns.java_patterns.bridgepattern.mybridgepatternimpl;

public class MyBridgePatternDemo {

    public static void main(String[] args) {
        Piscina piscina = new Piscina(new NadoBorboleta());
        piscina.nadar();


        Piscina piscina2 = new Piscina(new NadoCarpado());
        piscina2.nadar();
    }
}
