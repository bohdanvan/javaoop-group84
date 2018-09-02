package com.bvan.javaoop.lessons3_4.menu;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Menu {

    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        if (dishes.isEmpty()) {
            throw new IllegalStateException("Can't find cheapest dish in the empty menu");
        }
        Dish cheapestDish = dishes.get(0);
        for (Dish dish : dishes) {
            if (cheapestDish.getPrice() > dish.getPrice()) {
                cheapestDish = dish;
            }
        }
        return cheapestDish;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }
}
