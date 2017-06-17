package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
