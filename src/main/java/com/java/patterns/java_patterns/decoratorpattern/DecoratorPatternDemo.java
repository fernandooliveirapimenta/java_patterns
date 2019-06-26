package com.java.patterns.java_patterns.decoratorpattern;

import com.java.patterns.java_patterns.decoratorpattern.impl.RedShapeDecorator;
import com.java.patterns.java_patterns.decoratorpattern.model.Circle;
import com.java.patterns.java_patterns.decoratorpattern.model.Rectangle;
import com.java.patterns.java_patterns.decoratorpattern.model.Shape;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
