package com.java.patterns.java_patterns.decoratorpattern.impl;

import com.java.patterns.java_patterns.decoratorpattern.model.Shape;

public abstract class ShapDecorator implements Shape {

    Shape decoratedShape;

    public ShapDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
       decoratedShape.draw();
    }
}
