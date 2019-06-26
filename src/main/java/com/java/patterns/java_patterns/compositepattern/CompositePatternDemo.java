package com.java.patterns.java_patterns.compositepattern;

import com.java.patterns.java_patterns.compositepattern.impl.Employee;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("Jhon", "CEO", 3000.0);
        Employee headSales = new Employee("Robert", "Head Sales", 2000.0);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 2000.0);
        Employee clerk1 = new Employee("Laura", "Marketing", 2000.0);
        Employee clerk2 = new Employee("Michel", "Marketing", 2000.0);
        Employee salesExecutive1 = new Employee("Richard", "Sales", 1000.0);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 1000.0);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
