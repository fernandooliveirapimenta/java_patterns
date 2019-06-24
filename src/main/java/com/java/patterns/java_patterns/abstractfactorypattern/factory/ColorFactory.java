package com.java.patterns.java_patterns.abstractfactorypattern.factory;

import com.java.patterns.java_patterns.abstractfactorypattern.model.color.Color;
import com.java.patterns.java_patterns.abstractfactorypattern.model.color.Red;
import com.java.patterns.java_patterns.abstractfactorypattern.model.shape.Shape;

public class ColorFactory extends AbstractFactory {

    public Color getColor(String color) {

        if (color == null)
            return null;

        if(color.equalsIgnoreCase("Red"))
            return new Red();

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
