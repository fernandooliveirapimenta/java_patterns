package com.java.patterns.java_patterns.factorypattern;

import com.java.patterns.java_patterns.factorypattern.factory.ShapeFactory;
import com.java.patterns.java_patterns.factorypattern.model.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.getShape("square");
        square.draw();

    }
}
