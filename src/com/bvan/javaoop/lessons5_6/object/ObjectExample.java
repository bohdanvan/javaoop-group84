package com.bvan.javaoop.lessons5_6.object;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        A a = new A(10);
        A b = new A(10);

        System.out.println(a.toString());
        System.out.println(a.equals(b));

        Object o1 = new A(30);
        Object o2 = "Hello";
        Object o3 = new Product("Asus", 1500);
    }
}

class A {

    private final int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return x == a.x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }
}
