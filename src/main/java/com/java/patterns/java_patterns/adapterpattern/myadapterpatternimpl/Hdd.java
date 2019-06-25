package com.java.patterns.java_patterns.adapterpattern.myadapterpatternimpl;

public class Hdd implements HdSuportAvancado {
    @Override
    public void runSata(String diskId) {
        //do nothing

    }

    @Override
    public void runHdd(String diskId) {
        System.out.println("Rodando Hdd: " + diskId);
    }
}
