package com.bvan.javaoop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class MapImplementations {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new TreeMap<>();

        // HashMap - any order
        // LinkedHashMap - adding order
        // TreeMap - sorted order

        phoneBook.put("Vasya", new PhoneNumber("+380951111113"));
        phoneBook.put("Petya", new PhoneNumber("+380951111111"));
        phoneBook.put("Masha", new PhoneNumber("+380951111112"));

        for (Map.Entry<String, PhoneNumber> pair : phoneBook.entrySet()) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}
