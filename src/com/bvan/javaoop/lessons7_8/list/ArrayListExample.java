package com.bvan.javaoop.lessons7_8.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        System.out.println(list.size());

        for (int i = 0; i < 101; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
