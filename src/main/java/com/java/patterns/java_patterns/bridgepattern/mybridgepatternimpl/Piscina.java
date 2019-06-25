package com.java.patterns.java_patterns.bridgepattern.mybridgepatternimpl;

public class Piscina extends Agua {

    public Piscina(Nado nado) {
        super(nado);
    }

    @Override
    public void nadar() {
       getNado().nadar();
    }
}
