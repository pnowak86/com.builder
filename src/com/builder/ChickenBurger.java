package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public class ChickenBurger extends Burger {


    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 15.3f;
    }
}
