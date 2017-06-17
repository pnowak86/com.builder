package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public class BeefBurger extends Burger {

    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public float price() {
        return 19.5f;
    }
}
