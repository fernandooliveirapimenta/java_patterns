package com.java.patterns.java_patterns.prototypepattern.implementation;

import com.java.patterns.java_patterns.prototypepattern.model.Circle;
import com.java.patterns.java_patterns.prototypepattern.model.Rectangle;
import com.java.patterns.java_patterns.prototypepattern.model.Shape;
import com.java.patterns.java_patterns.prototypepattern.model.Square;

import java.util.Hashtable;

public class ShapeChache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadChace() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
