package com.bvan.javaoop.lessons1_2.dynamicarray.proc;

/**
 * @author bvanchuhov
 */
public class ArrayUtils {

    public static int sum(int[] elems) {
        int sum = 0;
        for (int elem : elems) {
            sum += elem;
        }
        return sum;
    }
}
