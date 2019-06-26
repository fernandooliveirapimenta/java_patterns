package com.java.patterns.java_patterns.decoratorpattern.mydecoratorpattern;

public class MyDecoratorPatternDemo {

    public static void main(String[] args) {
        Aquario gxt = new AquarioGxt();
        gxt.sensorTemperatura();

        System.out.println("\n decorado de outro mundo");
        Aquario decorado = new AquarioDeOutroMundoDecorator(new AqurioMdg());
        decorado.sensorTemperatura();
    }
}
