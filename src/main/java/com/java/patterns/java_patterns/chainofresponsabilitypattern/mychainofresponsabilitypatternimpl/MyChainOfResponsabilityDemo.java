package com.java.patterns.java_patterns.chainofresponsabilitypattern.mychainofresponsabilitypatternimpl;

public class MyChainOfResponsabilityDemo {
    public static void main(String[] args) {
        AbstractCar cambio = new Cambio(1);
        AbstractCar acelerator = new Acelerator(2);
        acelerator.setNextFunction(cambio);
        cambio.setNextFunction(acelerator);

        acelerator.play(2, "FAST");
    }
}
