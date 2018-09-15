package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));

//        Formatter formatter = new CsvFormatter("|");

        Formatter formatter = csvFormatter();
        cart.print(formatter);
    }

    // static factory method
    private static Formatter toStringFormatter() {
        // anonymous class
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }

    private static Formatter toStringFormatterLambda() {
        return p -> p.toString();
    }

    private static Formatter csvFormatter() {
        return new CsvFormatter();
    }
}
