package com.bvan.javaoop.lessons7_8.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class ArrayListCollectionConstructor {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); // true
        set.add(1); // false
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(1);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
