package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;

import java.util.List;

public class Select implements Expression {

    private String column;
    private From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interprete(Context context) {
        context.setColumn(column);
        return from.interprete(context);
    }
}
