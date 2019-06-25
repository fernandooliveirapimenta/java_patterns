package com.java.patterns.java_patterns.adapterpattern.model;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);

    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
