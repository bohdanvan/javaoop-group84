package com.bvan.javaoop.lessons1_2.dynamicarray.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da1 = new DynamicArray();
        da1.addLast(10);
        da1.addLast(30);
        da1.addLast(20);
        da1.addLast(40);
        da1.addLast(-100);
        System.out.println(da1.toString()); // [10, 30, 20, 40, -100]

        DynamicArray da2 = new DynamicArray();
        da2.addLast(10);
        System.out.println(da2.toString()); // [10]
    }
}
