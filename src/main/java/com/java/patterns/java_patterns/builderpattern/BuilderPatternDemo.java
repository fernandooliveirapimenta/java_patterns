package com.java.patterns.java_patterns.builderpattern;

import com.java.patterns.java_patterns.builderpattern.implementation.Meal;
import com.java.patterns.java_patterns.builderpattern.implementation.MealBuilder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal meal = builder.prepareVegMeal();
        System.out.println(meal.getCost());
        meal.showItems();
    }
}
