package com.java.patterns.java_patterns.templatepattern.impl;

public class TemplatePatternDemo {

    public static void main(String[] args) {
       Game game = new Cricket();
       game.play();

       System.out.println();
       game = new Football();
       game.play();
    }
}
