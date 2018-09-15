package com.bvan.javaoop.lessons5_6.format.oop;

import com.bvan.javaoop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatterTest {

    public static void main(String[] args) {
        JsonFormatter jsonFormatter = new JsonFormatter();
        String s = jsonFormatter.format(new Product("MacBook", 2000));
        System.out.println(s);
    }
}
