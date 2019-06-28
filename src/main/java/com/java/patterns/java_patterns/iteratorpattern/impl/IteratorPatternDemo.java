package com.java.patterns.java_patterns.iteratorpattern.impl;

public class IteratorPatternDemo {

    public static void main(String[] args) {
       String[] names = {"Teste", "Fernando"};
       NameRepository<String> nameRepository = new NameRepository<>(names);

        Iterator<String> iterator = nameRepository.getIterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.printf("Name: %s \n", next);
        }

    }
}
