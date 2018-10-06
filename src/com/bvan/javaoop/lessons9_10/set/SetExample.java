package com.bvan.javaoop.lessons9_10.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> langs = new TreeSet<>();

        langs.add("Java");
        langs.add("Java");
        langs.add("C#");
        langs.add("Java");
        langs.add("Kotlin");
        langs.add("Kotlin");
        langs.add("Ruby");
        langs.add("Kotlin");
        langs.add("Ruby");
        langs.add("C#");
        langs.add("C#");
        langs.add("C++");
        langs.add("Java");
        langs.add("Ruby");
        langs.add("Kotlin");

        System.out.println(langs);
    }
}
