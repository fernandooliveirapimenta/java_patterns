package com.java.patterns.java_patterns.proxypattern.myproxypattern;

public class Plutonio implements Nuclear {

    private boolean radioativo;

    public Plutonio(boolean radioativo) {
        this.radioativo = radioativo;
        System.out.println("Creating plutonio ...");
    }

    @Override
    public void tipo() {
        System.out.printf("Plutonio radioactive %s ", radioativo);
    }
}
