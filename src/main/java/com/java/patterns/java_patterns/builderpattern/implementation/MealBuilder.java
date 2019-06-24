package com.java.patterns.java_patterns.builderpattern.implementation;

import com.java.patterns.java_patterns.builderpattern.model.ChickenBurger;
import com.java.patterns.java_patterns.builderpattern.model.Coke;
import com.java.patterns.java_patterns.builderpattern.model.Pepsi;
import com.java.patterns.java_patterns.builderpattern.model.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal() {
       Meal meal = new Meal();
       meal.addItem(new VegBurger());
       meal.addItem(new Coke());
       return meal;
    }

    public Meal prepareNonVegMeal() {
       Meal meal = new Meal();
       meal.addItem(new ChickenBurger());
       meal.addItem(new Pepsi());
       return meal;
    }


}
