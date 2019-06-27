package com.java.patterns.java_patterns.chainofresponsabilitypattern.impl;

public abstract class AbstractLogger {

    int level;
    private AbstractLogger nextLogger;

    void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void logMessage(int level, String message) {
        if(this.level <=level) {
            write(message);
        }
        if(nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
