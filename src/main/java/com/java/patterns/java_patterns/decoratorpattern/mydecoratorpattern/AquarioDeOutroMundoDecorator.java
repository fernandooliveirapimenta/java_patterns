package com.java.patterns.java_patterns.decoratorpattern.mydecoratorpattern;

public class AquarioDeOutroMundoDecorator extends AquarioDecorator {

    public AquarioDeOutroMundoDecorator(Aquario aquario) {
        super(aquario);
    }

    @Override
    public void sensorTemperatura() {
        aquario.sensorTemperatura();
        System.out.println("Temperatura de outro mundo ..................................................");
    }
}
