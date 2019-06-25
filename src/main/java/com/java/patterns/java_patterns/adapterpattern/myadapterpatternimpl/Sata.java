package com.java.patterns.java_patterns.adapterpattern.myadapterpatternimpl;

public class Sata implements HdSuportAvancado {
    @Override
    public void runSata(String diskId) {
        System.out.println("Rodando Sata: " + diskId);

    }

    @Override
    public void runHdd(String diskId) {
        //do nothing
    }
}
