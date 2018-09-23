package com.bvan.javaoop.lessons7_8.generics.box;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericConstraints {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vanya");
        names.add("Pasha");

        List<Integer> list;
        Integer x = 10; // Integer.valueOf(10);
        Integer y = 10;
        Integer z = x + y; // Integer.valueOf(x.intValue() + y.intValue());
        x++;

//        Object[] objects = names.toArray();
//        String[] strings = names.toArray(new String[0]);
    }
}
