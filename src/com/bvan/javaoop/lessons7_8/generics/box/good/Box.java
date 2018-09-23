package com.bvan.javaoop.lessons7_8.generics.box.good;

import com.bvan.javaoop.lessons7_8.generics.box.Cat;

/**
 * @author bvanchuhov
 */
public class Box<T extends Cat> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

//    public T create() {
//        return new T();
//    }
//
//    public T[] createArray() {
//        return (T[]) new Object[10];
//    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
