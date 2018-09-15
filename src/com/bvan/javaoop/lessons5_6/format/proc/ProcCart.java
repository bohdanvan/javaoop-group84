package com.bvan.javaoop.lessons5_6.format.proc;

import com.bvan.javaoop.lessons5_6.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcCart {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(String formatType) {
        for (Product product : products) {
            String s = format(product, formatType);
            System.out.println(s);
        }
    }

    private String format(Product product, String formatType) {
        switch (formatType) {
            case "name":
                return product.getName();
            case "csv":
                return product.getName() + "," + product.getPrice();
            case "toString":
                return product.toString();
            default:
                throw new IllegalArgumentException("illegal format type: " + formatType);
        }
    }
}
