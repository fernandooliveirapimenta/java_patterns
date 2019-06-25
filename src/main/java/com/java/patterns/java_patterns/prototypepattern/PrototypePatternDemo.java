package com.java.patterns.java_patterns.prototypepattern;

import com.java.patterns.java_patterns.prototypepattern.implementation.ShapeChache;
import com.java.patterns.java_patterns.prototypepattern.model.Shape;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeChache.loadChace();

        Shape shape = ShapeChache.getShape("1");
        System.out.println(shape.getType());

        Shape shape2 = ShapeChache.getShape("2");
        System.out.println(shape2.getType());

        Shape shape3 = ShapeChache.getShape("3");
        System.out.println(shape3.getType());
    }
}
