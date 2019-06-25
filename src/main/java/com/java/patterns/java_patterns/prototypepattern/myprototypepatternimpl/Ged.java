package com.java.patterns.java_patterns.prototypepattern.myprototypepatternimpl;

public class Ged extends Sistema {

    public Ged(){
        tipo = "Ged";
    }

    @Override
    Double preco() {
        return 500.0;
    }
}
