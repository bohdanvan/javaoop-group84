package com.bvan.javaoop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // data
    int[] elems = new int[4];
    int size = 0;

    // interface

    public void addLast(int n) {
        if (elems.length == size) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
