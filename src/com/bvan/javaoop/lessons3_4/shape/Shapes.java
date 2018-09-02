package com.bvan.javaoop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new LinkedList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getTotalArea() {
        double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}
