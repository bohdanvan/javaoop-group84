package com.bvan.javaoop.lessons9_10.genericwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericsWildcard {

    public static void main(String[] args) {
        List<Cat> c1 = new ArrayList<Cat>();
//        List<Cat> c2 = new ArrayList<Kitty>(); // error

        List<? extends Cat> c3 = new ArrayList<Kitty>(); // can't modify

        List<? super Cat> c4 = new ArrayList<Cat>(); // can't read
        List<? super Cat> c5 = new ArrayList<Object>();
    }
}

class Cat {}
class Kitty extends Cat {}
class Dog {}