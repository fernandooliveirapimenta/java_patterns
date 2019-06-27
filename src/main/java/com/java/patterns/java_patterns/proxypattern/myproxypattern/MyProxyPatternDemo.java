package com.java.patterns.java_patterns.proxypattern.myproxypattern;

public class MyProxyPatternDemo {

    public static void main(String[] args) {

        Nuclear nuclear = new PlutonioProxy(true);

        nuclear.tipo();

        System.out.println("");

        nuclear.tipo();
    }
}
