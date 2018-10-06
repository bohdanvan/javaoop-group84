package com.bvan.javaoop.lessons9_10.filtering;

import com.bvan.javaoop.lessons9_10.filtering.ReleaseYearPredicate;
import com.bvan.javaoop.lessons9_10.movie.Movie;

import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class PredicatesExample {

    public static void main(String[] args) {
        Predicate<Movie> p1 = new ReleaseYearPredicate(2000, 2010);
        Predicate<Movie> p2 = new ReleaseYearPredicate(1950, 1960);

        Predicate<Movie> p3 = p1.and(p2);
    }
}
