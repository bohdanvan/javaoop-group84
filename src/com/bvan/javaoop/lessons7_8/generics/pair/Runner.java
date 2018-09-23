package com.bvan.javaoop.lessons7_8.generics.pair;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Pair<String, Integer> nameAndAge =
                new Pair<>("Ivan", 30);

        Pair<String, String> nameAndSurname;
        Pair<String, List<String>> nameAndFriends;
    }
}
