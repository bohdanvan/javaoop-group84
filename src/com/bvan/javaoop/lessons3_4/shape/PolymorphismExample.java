package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class PolymorphismExample {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Shape r2 = new Circle(10);
        Nameable r3 = r1;

        EquilateralTriangle t1 = new EquilateralTriangle(10);
        Shape t2 = new EquilateralTriangle(10);
//        Nameable t3 = new EquilateralTriangle(10);

        baz(r1);
        foo(r1);
        bar(r1);

        // bar(t1); // compilation error
        foo(t1);

        if (r2 instanceof Rectangle) { // BAD PRACTICE
            Rectangle r4 = (Rectangle) r2; // BAD PRACTICE
            baz(r4);
        }
    }

    public static void baz(Rectangle r) {}
    public static void foo(Shape s) {}
    public static void bar(Nameable n) {}
}
