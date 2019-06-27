package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;

import java.util.List;

public interface Expression {

    List<String> interprete(Context context);
}
