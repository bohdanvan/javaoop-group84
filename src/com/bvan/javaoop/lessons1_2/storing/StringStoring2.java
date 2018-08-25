package com.bvan.javaoop.lessons1_2.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring2 {

    public static void main(String[] args) {
        String a = "Hello";
        String b = a;

        b = b + ", world";

        System.out.println(a); // Hello
        System.out.println(b); // Hello, world
    }
}
