package com.bvan.javaoop.lessons7_8.generics;

import com.bvan.javaoop.lessons1_2.post.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericExample {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(10);
        names.add("Vasya");
        names.add("Tanya");
        names.add(new Post("", ""));

        String o = (String)names.get(0);

        System.out.println(names);
    }
}
