package com.bvan.javaoop.lessons5_6.format.proc;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        ProcCart cart = new ProcCart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));

        cart.print("csv");
    }
}
