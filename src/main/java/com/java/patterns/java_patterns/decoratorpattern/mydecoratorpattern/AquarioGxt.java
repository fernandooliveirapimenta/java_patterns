package com.java.patterns.java_patterns.decoratorpattern.mydecoratorpattern;

public class AquarioGxt implements Aquario {

    @Override
    public void sensorTemperatura() {
        System.out.println("23 graus no aquario");
    }
}
