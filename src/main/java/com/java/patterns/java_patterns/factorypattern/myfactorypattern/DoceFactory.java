package com.java.patterns.java_patterns.factorypattern.myfactorypattern;

public class DoceFactory {


    public Doce factory(String doce) {

        if (doce == null) {
            return null;
        }

        if (doce.equalsIgnoreCase("torta")) {
            return new TortaHolandesa();
        } else {
            return new TrufaChocolate();
        }

    }

}
