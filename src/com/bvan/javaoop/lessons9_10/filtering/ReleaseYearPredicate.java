package com.bvan.javaoop.lessons9_10.filtering;

import com.bvan.javaoop.lessons9_10.movie.Movie;

import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class ReleaseYearPredicate implements Predicate<Movie> {

    private final int min;
    private final int max;

    public ReleaseYearPredicate(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean test(Movie movie) {
        return movie.getReleaseYear() >= min
                && movie.getReleaseYear() <= max;
    }
}
