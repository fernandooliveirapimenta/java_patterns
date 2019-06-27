package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;

import java.util.List;

public class InterpreterDemo {
    public static void main(String[] args) {
 
        Expression query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interprete(ctx);
        System.out.println(result);
 
        Expression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interprete(ctx);
        System.out.println(result2);
 
        Expression query3 = new Select("name", 
          new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interprete(ctx);
        System.out.println(result3);
    }
}