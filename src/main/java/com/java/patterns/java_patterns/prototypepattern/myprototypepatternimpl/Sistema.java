package com.java.patterns.java_patterns.prototypepattern.myprototypepatternimpl;

public abstract class Sistema implements Cloneable {

    private String id;
    protected String tipo;

    abstract Double preco();

    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
