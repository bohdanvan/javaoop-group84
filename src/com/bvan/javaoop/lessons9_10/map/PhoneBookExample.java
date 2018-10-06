package com.bvan.javaoop.lessons9_10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class PhoneBookExample {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new HashMap<>();

        phoneBook.put("Petya", new PhoneNumber("+380951111111"));
        phoneBook.put("Masha", new PhoneNumber("+380951111112"));
        phoneBook.put("Vasya", new PhoneNumber("+380951111113"));
//        phoneBook.put("Misha", null);

        PhoneNumber prevNumber = phoneBook.put("Masha", new PhoneNumber("+380951111115"));

        PhoneNumber number = phoneBook.get("Masha");
        System.out.println("number = " + number);
        System.out.println("prevNumber = " + prevNumber);
        System.out.println();

        Set<String> names = phoneBook.keySet();
        Collection<PhoneNumber> phoneNumbers = phoneBook.values();

        Set<Map.Entry<String, PhoneNumber>> pairs = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> pair : pairs) {
            String name = pair.getKey();
            PhoneNumber phoneNumber = pair.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
    }
}

class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
