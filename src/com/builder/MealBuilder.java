package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public class MealBuilder {
    Meal prepareBeefBurger(){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Coke());
        return meal;
    }
    Meal prepareChickenBurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());


        return meal;
    }


}
