package com.java.patterns.java_patterns.flyweightpattern.impl;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactoryFlyweight {

    private static final Map<String, Shape> circleMap = new HashMap<>();


    public static Shape getCircle(String color) {
        Circle shape = (Circle) circleMap.get(color);

        if(shape == null) {
            shape = new Circle(color);
            circleMap.put(color,shape);
            System.out.println("Creating circle of color: " + color);
        }

        return shape;
    }
}
