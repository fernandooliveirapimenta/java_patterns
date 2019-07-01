package com.java.patterns.java_patterns.nullobjectpattern.impl;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String n: names) {
            if(n.equalsIgnoreCase(name)) {
                return new RealCustomer(n);
            }
        }
        return new NullCustomer();
    }
}
