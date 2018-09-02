package com.bvan.javaoop.lessons3_4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Example {

    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("A", "C", "B"));

        for (String elem : list) {
            System.out.println();
        }
    }
}
