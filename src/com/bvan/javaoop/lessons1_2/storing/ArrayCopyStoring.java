package com.bvan.javaoop.lessons1_2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayCopyStoring {

    public static void main(String[] args) {
        int[] a = {10, 10, 10};
        int[] b = Arrays.copyOf(a, a.length);

        b[0] = 20;

        System.out.println("a = " + Arrays.toString(a)); // [20, 10, 10]
        System.out.println("b = " + Arrays.toString(b)); // [20, 10, 10]
    }
}
