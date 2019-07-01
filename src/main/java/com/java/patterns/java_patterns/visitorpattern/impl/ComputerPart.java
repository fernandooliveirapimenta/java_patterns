package com.java.patterns.java_patterns.visitorpattern.impl;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
