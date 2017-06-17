package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2.7f;
    }
}
