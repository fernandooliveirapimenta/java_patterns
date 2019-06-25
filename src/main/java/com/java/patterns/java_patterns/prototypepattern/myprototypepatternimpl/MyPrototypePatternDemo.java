package com.java.patterns.java_patterns.prototypepattern.myprototypepatternimpl;

public class MyPrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        SistemaCache.loadChache();

        Sistema sistema = SistemaCache.getSistema("1");
        System.out.println(sistema.preco() + " " + sistema.getTipo());


        Sistema sistema2 = SistemaCache.getSistema("2");
        System.out.println(sistema2.preco() + " " + sistema2.getTipo());
    }
}
