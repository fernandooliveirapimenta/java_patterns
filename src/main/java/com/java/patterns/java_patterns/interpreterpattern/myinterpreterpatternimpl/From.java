package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;


import java.util.List;

public class From  implements  Expression{

    private String table;
    private Where where;

    public From(String table ) {
        this.table = table;
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interprete(Context context) {
        context.setTable(table);
        if(where == null) {
            return context.search();
        }
        return where.interprete(context);
    }
}
