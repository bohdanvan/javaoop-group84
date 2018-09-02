package com.bvan.javaoop.lessons3_4;

import com.bvan.javaoop.lessons3_4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class LateBindingExample {

    public static void main(String[] args) {
        int x = sum(10, 20); // early binging, compile time
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void print(Shape s) {
        System.out.println("Area = " + s.getPerimeter()); // late binging, run time
    }
}
