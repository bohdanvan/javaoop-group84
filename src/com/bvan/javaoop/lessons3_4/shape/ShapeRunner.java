package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);

        double a1 = r.getArea();
        double a2 = c.getArea();

        System.out.println(a1); // 200
        System.out.println(a2); // 314

        Shape s1 = new Rectangle(10, 20); //new Circle(10);
        double area = s1.getArea();
        System.out.println(area); // 314

        System.out.println("------");

        printShapeInfo(new Rectangle(10, 20));
        printShapeInfo(new Circle(10));
        printShapeInfo(new EquilateralTriangle(10));
    }

    public static void printShapeInfo(Shape s) {
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println("------");
    }
}
