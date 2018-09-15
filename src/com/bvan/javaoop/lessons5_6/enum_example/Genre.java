package com.bvan.javaoop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    COMEDY(9),
    DRAMA(7),
    ACTION(10);

    private final int popularity;

    Genre(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getShortName() {
        return name().substring(0, 3).toLowerCase();
    }
}
