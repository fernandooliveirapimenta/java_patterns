package com.java.patterns.java_patterns.bridgepattern.mybridgepatternimpl;

public abstract class Agua {

    private Nado nado;

    public Agua(Nado nado) {
        this.nado = nado;
    }

    public abstract void nadar();

    public Nado getNado() {
        return nado;
    }
}
