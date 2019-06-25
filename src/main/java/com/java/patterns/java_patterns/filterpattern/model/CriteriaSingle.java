package com.java.patterns.java_patterns.filterpattern.model;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(p -> p.getMaritalStatus().equalsIgnoreCase("Single")).collect(Collectors.toList());
    }
}
