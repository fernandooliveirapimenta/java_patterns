package com.java.patterns.java_patterns.abstractfactorypattern.factory;

import com.java.patterns.java_patterns.abstractfactorypattern.model.color.Color;
import com.java.patterns.java_patterns.abstractfactorypattern.model.shape.Shape;
import com.java.patterns.java_patterns.abstractfactorypattern.model.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if (shape == null)
            return null;

        if(shape.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
    }
}
