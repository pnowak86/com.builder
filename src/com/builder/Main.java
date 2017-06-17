package com.builder;

public class Main {

    public static void main(String[] args) {

        MealBuilder m1 = new MealBuilder();

        Meal newDish1 = m1.prepareBeefBurger();
        newDish1.showItems();


        Meal newDish2 = m1.prepareChickenBurger();

        newDish2.showItems();

    }
}
