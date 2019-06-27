package com.java.patterns.java_patterns.proxypattern.impl;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Real image");
    }

    public void loadFromDisk(String fileName) {
        System.out.printf("Loading %s",fileName);
    }
}
