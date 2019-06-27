package com.java.patterns.java_patterns.chainofresponsabilitypattern.impl;


public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        //sem proxima responsabilidade
        AbstractLogger consoleLogger = new ConsoleLogger(1);

        AbstractLogger fileLogger = new FileLogger(2);
        fileLogger.setNextLogger(consoleLogger);

        AbstractLogger errorLogger = new ErrorLogger(3);
        errorLogger.setNextLogger(fileLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger chainOfLoggers = getChainOfLoggers();
        chainOfLoggers.logMessage(1, "INFO");
        chainOfLoggers.logMessage(2, "DEBUG");
        chainOfLoggers.logMessage(3, "ERROR");
    }
}
