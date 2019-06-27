package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;

import java.util.Arrays;

public class Row {

    private String row;

    public Row(String... row ){
        this.row = Arrays.toString(row);
    }

    public String getRow() {
        return row;
    }

    @Override
    public String toString() {
        return row;
    }
}
