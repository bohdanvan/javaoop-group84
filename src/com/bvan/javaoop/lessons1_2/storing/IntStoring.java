package com.bvan.javaoop.lessons1_2.storing;

/**
 * @author bvanchuhov
 */
public class IntStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = x;

        y++;

        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 11
    }
}
