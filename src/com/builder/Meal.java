package com.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pinq on 2017-06-17.
 */
public class Meal {
    List<Item> items = new ArrayList<>();


    public float getCost() {
        float totalPrice = 0;
        //items.forEach(item -> item.price());
        for (int i = 0; i < items.size(); i++) {
            // System.out.println(items.get(i).price());
            totalPrice = totalPrice + items.get(i).price();
        }


        return totalPrice;
    }

    public void showItems() {
        System.out.println("Your meal includes:");
        items.forEach(item -> System.out.println(item.name() +" "+ item.packing().pack()+ " " + item.price()));

        System.out.println("You will pay " + getCost());
        System.out.println("--------Thank you----------");

    }

    public void addItem(Item item) {
        items.add(item);
    }
}
