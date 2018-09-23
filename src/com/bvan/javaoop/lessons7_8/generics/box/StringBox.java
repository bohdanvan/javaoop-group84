package com.bvan.javaoop.lessons7_8.generics.box;

/**
 * @author bvanchuhov
 */
public class StringBox {

    private final String value;

    public StringBox(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        return "StringBox{" +
                "value=" + value +
                '}';
    }
}
