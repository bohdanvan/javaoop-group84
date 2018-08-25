package com.bvan.javaoop.lessons1_2.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring3 {

    public static void main(String[] args) {
        String a = "Hello";
        String b = a;

        b.concat(", world");

        System.out.println(a);
        System.out.println(b);
    }
}
