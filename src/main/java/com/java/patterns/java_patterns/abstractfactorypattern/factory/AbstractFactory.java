package com.java.patterns.java_patterns.abstractfactorypattern.factory;

import com.java.patterns.java_patterns.abstractfactorypattern.model.color.Color;
import com.java.patterns.java_patterns.abstractfactorypattern.model.shape.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
