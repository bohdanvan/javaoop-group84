package com.bvan.javaoop.lessons7_8.generics.box.good;

import com.bvan.javaoop.lessons7_8.generics.box.Cat;
import com.bvan.javaoop.lessons7_8.generics.box.Kitten;

/**
 * @author bvanchuhov
 */
public class Runner {
    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Kitten());
        Box<Kitten> kittenBox = new Box<>(new Kitten());

//        Box<Dog> dogBox = new Box<>(new Dog());
//        Box<String> nameBox = new Box<>("Vasya");

        Cat cat = catBox.get();
        cat.meow();

        Kitten kitten = kittenBox.get();
        kitten.run();
    }
}
