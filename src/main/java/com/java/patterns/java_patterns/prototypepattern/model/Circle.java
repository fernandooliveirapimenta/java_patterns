package com.java.patterns.java_patterns.prototypepattern.model;

public class Circle extends Shape {

    public Circle() {
       type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
