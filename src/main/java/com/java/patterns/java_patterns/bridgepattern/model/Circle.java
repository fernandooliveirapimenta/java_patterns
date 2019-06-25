package com.java.patterns.java_patterns.bridgepattern.model;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        getDrawAPI().drawCircle(radius,x,y);
    }
}
