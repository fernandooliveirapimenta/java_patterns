package com.java.patterns.java_patterns.mementopattern.impl;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    public List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
