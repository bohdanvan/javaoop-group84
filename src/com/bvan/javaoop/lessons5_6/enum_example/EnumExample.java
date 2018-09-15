package com.bvan.javaoop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class EnumExample {

    public static void main(String[] args) {
        Genre g1 = Genre.ACTION;

        // String -> enum
        Genre g2 = Genre.valueOf("DRAMA");
        System.out.println(g2);

        // int -> enum
        Genre[] genres = Genre.values();
        Genre g3 = genres[1];

        // enum -> String
        String name = g1.name();

        // enum -> int
        int ordinal = g1.ordinal();

        System.out.println(g1.getShortName());
    }
}
