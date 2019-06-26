package com.java.patterns.java_patterns.decoratorpattern.impl;

import com.java.patterns.java_patterns.decoratorpattern.model.Shape;

public class RedShapeDecorator extends ShapDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
       decoratedShape.draw();
       setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
