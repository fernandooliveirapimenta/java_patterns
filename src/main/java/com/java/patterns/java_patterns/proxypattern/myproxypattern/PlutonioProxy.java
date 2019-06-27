package com.java.patterns.java_patterns.proxypattern.myproxypattern;

public class PlutonioProxy implements Nuclear {

    private Plutonio realPlutonio;
    private boolean radioatiovo;

    public PlutonioProxy(boolean radioativo) {
        this.radioatiovo = radioativo;
    }

    @Override
    public void tipo() {
        if(realPlutonio == null) {
            realPlutonio = new Plutonio(radioatiovo);
        }
        realPlutonio.tipo();
    }
}
