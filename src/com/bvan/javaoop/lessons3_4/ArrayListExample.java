package com.bvan.javaoop.lessons3_4;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Vlad");
        names.add("Ivan");
        names.add("Boris");

        String s = names.get(1);
        names.set(2, "Masha");
        names.add(2, "Taras");

        System.out.println(names);
    }
}
