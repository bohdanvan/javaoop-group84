package com.bvan.javaoop.lessons1_2.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat(", world"); // Hello, world

        System.out.println(s1); // Hello
        System.out.println(s2); // Hello, world
    }
}
