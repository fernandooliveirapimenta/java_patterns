package com.java.patterns.java_patterns.facadepattern;

import com.java.patterns.java_patterns.facadepattern.impl.ShapeFacade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        facade.drawCone();
        facade.drawLozangle();
        facade.drawTriangle();
    }
}
