package com.java.patterns.java_patterns.flyweightpattern;

import com.java.patterns.java_patterns.flyweightpattern.impl.Circle;
import com.java.patterns.java_patterns.flyweightpattern.impl.ShapeFactoryFlyweight;

public class FlyweightPatternDemo {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {

        for(int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactoryFlyweight.getCircle(getRandomColor());
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 100));
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
