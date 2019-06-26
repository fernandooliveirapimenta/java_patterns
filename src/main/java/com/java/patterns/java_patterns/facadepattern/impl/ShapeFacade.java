package com.java.patterns.java_patterns.facadepattern.impl;

import com.java.patterns.java_patterns.facadepattern.model.Cone;
import com.java.patterns.java_patterns.facadepattern.model.Lozangle;
import com.java.patterns.java_patterns.facadepattern.model.Shape;
import com.java.patterns.java_patterns.facadepattern.model.Triangle;

public class ShapeFacade {

    Shape cone = new Cone();
    Shape triangle = new Triangle();
    Shape lozangle = new Lozangle();

    public void drawCone() {
        cone.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }

    public void drawLozangle() {
        lozangle.draw();
    }
}
