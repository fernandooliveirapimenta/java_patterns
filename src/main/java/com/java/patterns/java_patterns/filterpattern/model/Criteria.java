package com.java.patterns.java_patterns.filterpattern.model;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
