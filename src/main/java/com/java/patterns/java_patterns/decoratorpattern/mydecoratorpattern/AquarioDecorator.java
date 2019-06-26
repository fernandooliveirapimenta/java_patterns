package com.java.patterns.java_patterns.decoratorpattern.mydecoratorpattern;

public abstract class AquarioDecorator implements Aquario {

    Aquario aquario;

    public AquarioDecorator(Aquario aquario) {
        this.aquario = aquario;
    }

    @Override
    public void sensorTemperatura() {
       aquario.sensorTemperatura();
    }
}
