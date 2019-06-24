package com.java.patterns.java_patterns.abstractfactorypattern.producer;

import com.java.patterns.java_patterns.abstractfactorypattern.factory.AbstractFactory;
import com.java.patterns.java_patterns.abstractfactorypattern.factory.ColorFactory;
import com.java.patterns.java_patterns.abstractfactorypattern.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
