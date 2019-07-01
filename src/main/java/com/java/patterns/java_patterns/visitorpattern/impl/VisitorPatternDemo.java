package com.java.patterns.java_patterns.visitorpattern.impl;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
