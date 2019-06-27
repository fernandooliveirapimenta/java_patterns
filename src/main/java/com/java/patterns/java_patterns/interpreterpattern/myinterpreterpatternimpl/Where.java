package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

    private Predicate<String> filter;

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interprete(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
