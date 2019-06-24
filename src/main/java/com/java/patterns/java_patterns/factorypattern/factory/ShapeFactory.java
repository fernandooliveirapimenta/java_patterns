package com.java.patterns.java_patterns.factorypattern.factory;

import com.java.patterns.java_patterns.factorypattern.model.Circle;
import com.java.patterns.java_patterns.factorypattern.model.Rectangle;
import com.java.patterns.java_patterns.factorypattern.model.Shape;
import com.java.patterns.java_patterns.factorypattern.model.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if(shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
           return new Square();
        }

        return null;
    }
}
