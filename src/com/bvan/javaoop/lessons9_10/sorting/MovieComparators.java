package com.bvan.javaoop.lessons9_10.sorting;

import com.bvan.javaoop.lessons9_10.movie.Movie;

import java.util.Comparator;

/**
 * @author bvanchuhov
 */
public class MovieComparators {

    public static Comparator<Movie> byTitleLength() {
        return new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Integer.compare(
                        o1.getTitle().length(),
                        o2.getTitle().length()
                );
            }
        };
    }

    public static Comparator<Movie> byTitle() {
        return new TitleComparator();
    }

    public static Comparator<Movie> byYear() {
        return new YearComparator();
    }
}

class TitleComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle());
    }
}

class YearComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
    }
}


