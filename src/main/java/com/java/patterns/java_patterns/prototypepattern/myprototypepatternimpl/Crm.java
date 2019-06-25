package com.java.patterns.java_patterns.prototypepattern.myprototypepatternimpl;

public class Crm extends Sistema {

    public Crm() {
        tipo = "Crm";
    }

    @Override
    Double preco() {
        return 400.0;
    }
}
