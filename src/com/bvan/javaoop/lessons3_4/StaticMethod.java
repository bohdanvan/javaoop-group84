package com.bvan.javaoop.lessons3_4;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class StaticMethod {

    public static void main(String[] args) {
        int sum = StaticMethod.sum(new int[1]);
        double x = Math.sin(1.0);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);

        addToList(list, 20);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public static void addToList(ArrayList<Integer> list, int elem) {}
}
