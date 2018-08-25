package com.bvan.javaoop.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        int x = sum(10, 20);
        double y = sum(10.0, 20);
        int z = sum(10, 20, 30);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }
}
