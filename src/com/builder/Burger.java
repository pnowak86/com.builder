package com.builder;

/**
 * Created by Pinq on 2017-06-17.
 */
public abstract class Burger implements Item {

    public Packing packing(){
        return new Wrapper();
    }
}
