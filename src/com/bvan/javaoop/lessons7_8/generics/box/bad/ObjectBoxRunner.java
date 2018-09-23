package com.bvan.javaoop.lessons7_8.generics.box.bad;

import com.bvan.javaoop.lessons7_8.generics.box.Cat;
import com.bvan.javaoop.lessons7_8.generics.box.Dog;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        ObjectBox objectBox = new ObjectBox(dog);

        sendBox(objectBox);
    }

    private static void sendBox(ObjectBox objectBox) {
        Object o = objectBox.get();
        if (o instanceof Cat) {
            Cat cat = (Cat) o;
            cat.meow();
        } else {
            throw new IllegalArgumentException("where is my cat?");
        }
    }
}

