package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
