package com.java.patterns.java_patterns.prototypepattern.model;

public class Rectangle extends Shape {

    public Rectangle() {
       type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
