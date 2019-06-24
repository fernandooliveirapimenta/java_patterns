package com.java.patterns.java_patterns.abstractfactorypattern;

import com.java.patterns.java_patterns.abstractfactorypattern.factory.AbstractFactory;
import com.java.patterns.java_patterns.abstractfactorypattern.model.color.Color;
import com.java.patterns.java_patterns.abstractfactorypattern.model.shape.Shape;
import com.java.patterns.java_patterns.abstractfactorypattern.producer.FactoryProducer;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("Shape");
        assert shape != null;
        Shape square = shape.getShape("Square");
        square.draw();

        AbstractFactory color = FactoryProducer.getFactory("Color");
        assert color != null;
        Color red = color.getColor("Red");
        red.fill();

    }
}
