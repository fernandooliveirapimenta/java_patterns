package com.java.patterns.java_patterns.prototypepattern.model;

public class Square extends Shape {

    public Square() {
       type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
