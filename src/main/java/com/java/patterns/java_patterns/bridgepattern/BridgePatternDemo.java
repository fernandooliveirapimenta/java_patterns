package com.java.patterns.java_patterns.bridgepattern;

import com.java.patterns.java_patterns.bridgepattern.model.Circle;
import com.java.patterns.java_patterns.bridgepattern.model.GreenCircle;
import com.java.patterns.java_patterns.bridgepattern.model.RedCircle;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(100,100,10,new RedCircle());
        circle.draw();

        Circle circle2 = new Circle(100,100,10,new GreenCircle());
        circle2.draw();
    }
}
