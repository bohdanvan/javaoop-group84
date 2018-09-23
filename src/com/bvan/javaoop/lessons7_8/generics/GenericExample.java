package com.bvan.javaoop.lessons7_8.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Tanya");

        String o = names.get(0);

        System.out.println(names);
    }
}
