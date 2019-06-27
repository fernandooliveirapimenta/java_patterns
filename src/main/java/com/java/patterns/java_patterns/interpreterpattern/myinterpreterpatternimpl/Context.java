package com.java.patterns.java_patterns.interpreterpattern.myinterpreterpatternimpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

    private static Map<String, List<Row>> tables = new HashMap<>();

    static {
        List<Row> list = Stream.of(
                new Row("Jhon", "Dow"),
                new Row("Jan", "Kowalski"),
                new Row("Dominic", "Doom"))
                .collect(Collectors.toList());
        tables.put("people", list);
    }

    private String table;
    private String column;
    private Predicate<String> whereFilter;

    public void setColumn(String column) {
        this.column = column;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setFilter(Predicate<String> filter) {
        this.whereFilter = filter;
    }

    public List<String> search() {
        return tables
                .entrySet()
                .stream()
                .filter(e -> e.getKey().equalsIgnoreCase(table))
                .flatMap(e -> Stream.of(e.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .filter(whereFilter)
                .collect(Collectors.toList());
    }

}
