package com.java.patterns.java_patterns.filterpattern.model;

public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getGender() != null ? !getGender().equals(person.getGender()) : person.getGender() != null) return false;
        return getMaritalStatus() != null ? getMaritalStatus().equals(person.getMaritalStatus()) : person.getMaritalStatus() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getMaritalStatus() != null ? getMaritalStatus().hashCode() : 0);
        return result;
    }
}
