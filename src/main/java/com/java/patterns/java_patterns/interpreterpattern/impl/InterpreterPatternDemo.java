package com.java.patterns.java_patterns.interpreterpattern.impl;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
    public static void main(String[] args) {
       Expression isMale = getMaleExpression();
       Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.printf("John is male? %b \n ", isMale.interpret("John"));
        System.out.printf("Julie is a married women? %b \n", isMarriedWoman.interpret("Marrieg Julie"));

    }
}
